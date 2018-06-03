package com.example.jevil.selfjournal.screen.settings;

import android.support.annotation.NonNull;

/**
 * Created by Jevil on 23.05.2018.
 */

public class SettingsPresenter {

    private final SettingsView mView;

    SettingsPresenter(@NonNull SettingsView settingsView) {
        mView = settingsView;
    }

    public void setText(String s) {
        mView.setText(s);
    }

}
