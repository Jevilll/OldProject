package com.example.jevil.selfjournal.screen.events.addNew;

import com.example.jevil.selfjournal.screen.common.PresenterBase;

public class EventsAddNewPresenter extends PresenterBase<EventsAddNewContract.View> implements EventsAddNewContract.Presenter{


    @Override
    public void setText(String text) {
        getView().setText(text);
    }
}
