package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidpoint.Fragment.Basic.B_card_18_Fragment;
import com.example.androidpoint.Fragment.Basic.B_card_19_Fragment;
import com.example.androidpoint.R;

public class Countdown_Timer extends Fragment {

    public int counter;
    Button start_timer;
    TextView textView;

    AppCompatImageView Countdown_Timer_demo;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countdown__timer, container, false);

        start_timer= (Button) view.findViewById(R.id.start_timer);
        textView= (TextView) view.findViewById(R.id.textView);
        Countdown_Timer_demo = view.findViewById(R.id.Countdown_Timer_demo);

        Countdown_Timer_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_19_Fragment ExplicitIntent= new B_card_19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });

        start_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(30000, 1000){
                    public void onTick(long millisUntilFinished){
                        textView.setText(String.valueOf(counter));
                        counter++;
                    }
                    public  void onFinish(){
                        textView.setText("FINISH!!");
                    }
                }.start();
            }
        });



        return view;
    }
}