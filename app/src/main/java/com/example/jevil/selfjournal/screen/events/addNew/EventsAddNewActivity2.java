package com.example.jevil.selfjournal.screen.events.addNew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jevil.selfjournal.R;

import butterknife.BindView;

public class EventsAddNewActivity2 extends AppCompatActivity {

    @BindView(R.id.tvText)
    TextView tvText;

    private EventsAddNewPresenter mPresenter;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, EventsAddNewContract.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_add_new2);
    }
}
