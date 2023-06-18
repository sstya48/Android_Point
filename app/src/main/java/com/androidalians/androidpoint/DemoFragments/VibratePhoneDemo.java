package com.androidalians.androidpoint.DemoFragments;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.androidalians.androidpoint.Fragment.Basic.B_card_21_Fragment;
import com.androidalians.androidpoint.R;


public class VibratePhoneDemo extends Fragment {
    Button buttonVibrate;

    AppCompatImageView vaibrat_arrow_main;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_vibrate_phone_demo, container, false);

        buttonVibrate = view.findViewById(R.id.buttonVibrate);
        vaibrat_arrow_main = view.findViewById(R.id.vaibrat_arrow_main);

        buttonVibrate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Vibrator vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(50);

            }
        });
        vaibrat_arrow_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_21_Fragment ExplicitIntent= new B_card_21_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });
        return view;
    }

}