package com.example.jevil.selfjournal.screen.events.addNew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jevil.selfjournal.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventsAddNewActivity extends AppCompatActivity implements EventsAddNewContract.View {

    @BindView(R.id.tvText)
    TextView tvText;

    private EventsAddNewPresenter mPresenter;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, EventsAddNewActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_add_new_fragment);
        ButterKnife.bind(this);
        mPresenter = new EventsAddNewPresenter();
        mPresenter.attachView(this);

        mPresenter.setText("addNewEventFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public void setText(String text) {
        tvText.setText(text);
    }
}
