package com.example.jevil.selfjournal.screen.events.addNew;


import com.example.jevil.selfjournal.screen.common.MvpPresenter;
import com.example.jevil.selfjournal.screen.common.MvpView;

public interface EventsAddNewContract {

    interface View extends MvpView {

        void setText(String text);

    }

    interface Presenter extends MvpPresenter<View> {

        void setText(String text);

    }

}
