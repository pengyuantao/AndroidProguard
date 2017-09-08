package com.peng.proguard;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.ui.Messages;

/**
 * Created by Administrator on 2017/9/8.
 */
public class ProguardSetting extends AnAction {


    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Messages.showInputDialog("当前Proguard的地址:", "设置混淆获取地址", null, Setting.getInstance().getState(), new InputValidator() {
            @Override
            public boolean checkInput(String s) {
                System.out.println("checkInput:" + s);
                return true;
            }

            @Override
            public boolean canClose(String s) {
                System.out.println("canClose:" + s);
                Setting.getInstance().loadState(s);
                return true;
            }
        });
    }
}
