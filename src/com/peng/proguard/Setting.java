package com.peng.proguard;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Administrator on 2017/9/8.
 */
@State(
        name = "proguard",
        storages = {
                @Storage(
                        id = "proguard",
                        file = "$APP_CONFIG$/proguard_setting.xml"
                )
        }
)
public class Setting implements PersistentStateComponent<String> {
    public static final String DEFAULT_PROGUARD_URL = "https://raw.githubusercontent.com/pengyuantao/AndroidProguard/master/AndroidProguard";

    public String proguardUrl = DEFAULT_PROGUARD_URL;

    @Nullable
    @Override
    public String getState() {
        return proguardUrl;
    }

    @Override
    public void loadState(String s) {
        this.proguardUrl = s;
    }

    public static Setting getInstance() {
        return ServiceManager.getService(Setting.class);
    }
}
