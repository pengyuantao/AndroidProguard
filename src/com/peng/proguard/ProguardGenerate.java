package com.peng.proguard;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * 彭元涛
 * Created by Administrator on 2017/9/8.
 */
public class ProguardGenerate extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        BufferedReader bufferedReader = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(Setting.getInstance().getState());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept-Charset", "UTF-8");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setReadTimeout(5000);
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == 200) {
                String contentEncoding = urlConnection.getContentEncoding();
                bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
                StringBuilder resultBuilder = new StringBuilder();
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    resultBuilder.append(line).append("\n");
                }
                StringSelection stringSelection = new StringSelection(resultBuilder.toString());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
                Messages.showMessageDialog("Ctrl+V to copy it!","Succese",null);
            } else {
                Messages.showErrorDialog("Code:" + responseCode, "Error");
                return;
            }
        } catch (IOException e1) {
            e1.printStackTrace();
            Messages.showErrorDialog(e1.getMessage(),"Error");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }


    }
}
