package com.example.jevil.selfjournal.screen.statistic.common;

import android.support.annotation.NonNull;

/**
 * Created by Jevil on 23.05.2018.
 */

public class StatisticCommonPresenter {

    private final StatisticCommonView mView;

    StatisticCommonPresenter(@NonNull StatisticCommonView statisticCommonView) {
        mView = statisticCommonView;
    }

    public void setText(String s) {
        mView.setText(s);
    }

}
