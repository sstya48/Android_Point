package com.androidalians.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;

import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_23_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_25_Fragment;
import com.androidalians.androidpoint.R;

public class A_A25_Fragment extends Fragment {
    AppCompatImageView Btn_arrow;
    Chronometer simpleChronometer;
    Button start, stop, restart, setFormat, clearFormat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a25_, container, false);


        Btn_arrow = view.findViewById(R.id.Btn_arrow);

        simpleChronometer = view.findViewById(R.id.simpleChronometer);
        start = view.findViewById(R.id.startButton);
        stop = view.findViewById(R.id.stopButton);
        restart = view.findViewById(R.id.restartButton);
        setFormat = view.findViewById(R.id.setFormat);
        clearFormat = view.findViewById(R.id.clearFormat);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_25_Fragment A_card_25_Fragment = new A_card_25_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_25_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                simpleChronometer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.stop();
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
        setFormat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                simpleChronometer.setFormat("Time (%s)");
            }
        });
        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.setFormat(null);
            }
        });
        return view;
    }
}