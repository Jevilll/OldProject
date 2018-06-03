package com.example.jevil.selfjournal.screen.statistic.common;

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

/**
 * Created by Jevil on 22.05.2018.
 */

public class StatisticCommonFragment extends Fragment implements StatisticCommonView {

    @BindView(R.id.sCommonTvText)
    TextView tvText;

    private Unbinder unbinder;
    private StatisticCommonPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new StatisticCommonPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.stitistic_common_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);

        mPresenter.setText("Statistic common fragment");

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
