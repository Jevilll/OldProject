package com.example.jevil.selfjournal.screen.statistic.expanded;

import android.support.annotation.NonNull;

/**
 * Created by Jevil on 23.05.2018.
 */

public class StatisticExpandedPresenter {

    private final StatisticExpandedView mView;

    StatisticExpandedPresenter(@NonNull StatisticExpandedView statisticExpandedView) {
        mView = statisticExpandedView;
    }

    public void setText(String s) {
        mView.setText(s);
    }

}
