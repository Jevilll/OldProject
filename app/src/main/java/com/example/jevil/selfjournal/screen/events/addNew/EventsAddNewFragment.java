package com.example.jevil.selfjournal.screen.events.addNew;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jevil.selfjournal.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class EventsAddNewFragment extends Fragment{

    @BindView(R.id.tvText)
    TextView tvText;

    private Unbinder unbinder;
    private EventsAddNewPresenter mPresenter;

    public static EventsAddNewFragment newInstance() {
        return new EventsAddNewFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new EventsAddNewPresenter();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.events_add_new_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);



        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
