package com.example.jevil.selfjournal.screen.events.list;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jevil.selfjournal.R;
import com.example.jevil.selfjournal.screen.events.addNew.EventsAddNewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Jevil on 22.05.2018.
 */

public class EventsListFragment extends Fragment implements EventsListContract.View {


    @OnClick(R.id.eventsListFab)
    void onFabClick() {

        EventsAddNewActivity.startActivity(getContext());

    }

    @BindView(R.id.eventsTvText)
    TextView tvText;

    private ProgressDialog progressDialog;
    private Unbinder unbinder;
    private EventsListPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new EventsListPresenter();
        mPresenter.attachView(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.events_list_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);

        mPresenter.setText("ffffffffffffff");


        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }



    @Override
    public void setText(String text) {
        tvText.setText(text);
    }
}
