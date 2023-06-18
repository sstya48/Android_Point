package com.androidalians.androidpoint.DemoFragments;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.androidalians.androidpoint.Fragment.Basic.B_card_24_Fragment;
import com.androidalians.androidpoint.R;

public class ImageSwitcher_Demo extends Fragment {

    AppCompatImageView switcher_arrow;

    private static final String TAG = "AnimationStarter";
    ObjectAnimator textColorAnim;
    Button stopBlinkTextButton, startBlinkTextButton;
    TextView blinkTextView;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_switcher__demo, container, false);

        switcher_arrow= view.findViewById(R.id.switcher_arrow);
         startBlinkTextButton =  view.findViewById(R.id.startBlinkTextButton);
         stopBlinkTextButton =  view.findViewById(R.id.stopBlinkTextButton);
        blinkTextView  = view.findViewById(R.id.blinkTextView);

        switcher_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_24_Fragment B_card_24_Fragment= new B_card_24_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, B_card_24_Fragment, "Back Button Basic")
                        .commit();
            }
        });

        startBlinkTextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textColorAnim = ObjectAnimator.ofInt(blinkTextView, "textColor", Color.RED, Color.TRANSPARENT);
                textColorAnim.setDuration(1000);
                textColorAnim.setEvaluator(new ArgbEvaluator());
                textColorAnim.setRepeatCount(ValueAnimator.INFINITE);
                textColorAnim.setRepeatMode(ValueAnimator.REVERSE);
                textColorAnim.start();
            }
        });
        stopBlinkTextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(textColorAnim != null) {
                    textColorAnim.cancel();
                    blinkTextView.setTextColor(Color.RED);
                }
            }
        });

        return view;
    }
}








