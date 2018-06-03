package com.example.jevil.selfjournal.screen.events.list;


import com.example.jevil.selfjournal.screen.common.MvpPresenter;
import com.example.jevil.selfjournal.screen.common.MvpView;

public interface EventsListContract {

    interface View extends MvpView {

        void setText(String text);

    }

    interface Presenter extends MvpPresenter<View> {

        void setText(String text);

    }
}
