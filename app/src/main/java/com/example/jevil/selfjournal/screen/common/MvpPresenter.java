package com.example.jevil.selfjournal.screen.common;


public interface MvpPresenter <V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

}
