package com.example.jevil.selfjournal.screen.events;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jevil.selfjournal.R;

/**
 * Created by Jevil on 22.05.2018.
 */

public class EventsFragment extends Fragment {

    public static EventsFragment newInstance() {

        Bundle args = new Bundle();
        EventsFragment fragment = new EventsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.events_fragment, container, false);

        return v;
    }
}
