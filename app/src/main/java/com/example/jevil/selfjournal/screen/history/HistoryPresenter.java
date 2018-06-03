package com.example.jevil.selfjournal.screen.history;

import android.support.annotation.NonNull;

/**
 * Created by Jevil on 23.05.2018.
 */

public class HistoryPresenter {

    private final HistoryView mView;

    HistoryPresenter(@NonNull HistoryView historyView) {
        mView = historyView;
    }

    public void setText(String s) {
        mView.setText(s);
    }
}
