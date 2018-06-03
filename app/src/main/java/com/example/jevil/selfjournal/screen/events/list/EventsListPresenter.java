package com.example.jevil.selfjournal.screen.events.list;

import com.example.jevil.selfjournal.screen.common.PresenterBase;
import com.example.jevil.selfjournal.screen.events.list.EventsListContract.Presenter;

public class EventsListPresenter extends PresenterBase<EventsListContract.View> implements Presenter{

    public void setText(String s) {
        getView().setText(s);
    }

}
