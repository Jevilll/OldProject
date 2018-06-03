package com.example.jevil.selfjournal.screen.settings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jevil.selfjournal.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Jevil on 22.05.2018.
 */

public class SettingsFragment extends android.support.v4.app.Fragment implements SettingsView {

    @BindView(R.id.settingsTvText)
    TextView tvText;

    private Unbinder unbinder;
    private SettingsPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new SettingsPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.settings_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);

        mPresenter.setText("Settings fragment");

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
