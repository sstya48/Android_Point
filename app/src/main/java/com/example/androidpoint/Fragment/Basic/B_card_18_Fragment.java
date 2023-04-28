package com.example.androidpoint.Fragment.Basic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.Speech_to_text_demo;
import com.example.androidpoint.DemoFragments.Text_to_speech_demo;
import com.example.androidpoint.R;


public class B_card_18_Fragment extends Fragment {

    TextView speech_to_java,speech_to_xml;
    CardView speech_to_yt;
    AppCompatImageView speech_code_arrow,speech_to_text_demo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_18_, container, false);


        speech_to_java= view.findViewById(R.id.speech_to_java);
        speech_to_yt= view.findViewById(R.id.speech_to_yt);
        speech_to_java.setTextIsSelectable(true);
        speech_to_xml= view.findViewById(R.id.speech_to_xml);
        speech_to_xml.setTextIsSelectable(true);

        speech_code_arrow= view.findViewById(R.id.speech_code_arrow);

        speech_to_text_demo=view.findViewById(R.id.speech_to_text_demo);
        speech_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        speech_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=_SE7Sx4Cgqo");
            }
        });
        speech_to_text_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Speech_to_text_demo Speech_to_text_demo= new Speech_to_text_demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Speech_to_text_demo, "Speech To Text DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });


        speech_to_java.setText("");

        speech_to_xml.setText("");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
