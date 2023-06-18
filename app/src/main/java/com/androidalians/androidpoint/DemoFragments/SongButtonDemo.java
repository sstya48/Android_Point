package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.androidalians.androidpoint.Fragment.Basic.B_card_22_Fragment;
import com.androidalians.androidpoint.R;


public class SongButtonDemo extends Fragment {
    MediaPlayer button_sound;
    AppCompatImageView song_demo_main;
    Button b1,b2,b3,b4;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_song_button_demo, container, false);


         b1 = view.findViewById(R.id.button1);
         b2 = view.findViewById(R.id.button2);
         b3 =  view.findViewById(R.id.button3);
         b4 = view.findViewById(R.id.button4);
         b4 = view.findViewById(R.id.button4);
        song_demo_main = view.findViewById(R.id.song_demo_main);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                button_sound = MediaPlayer.create(getContext(),
                        R.raw.songone);
                button_sound.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                button_sound = MediaPlayer.create(getContext(),
                        R.raw.songtwo);
                button_sound.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button_sound = MediaPlayer.create(getContext(),
                        R.raw.songthree);
                button_sound.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button_sound = MediaPlayer.create(getContext(),
                        R.raw.songfour);
                button_sound.start();
            }
        });

        song_demo_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_22_Fragment ExplicitIntent= new B_card_22_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });
        return view;
    }

}