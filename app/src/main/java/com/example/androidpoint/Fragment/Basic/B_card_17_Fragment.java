package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
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

import com.example.androidpoint.DemoFragments.Hello_World_Fragment;
import com.example.androidpoint.DemoFragments.Text_to_speech_demo;
import com.example.androidpoint.R;

public class B_card_17_Fragment extends Fragment {

    TextView text_to_java,text_to_xml;
    AppCompatImageView hello_toast_demo;

    AppCompatImageView Text_code_arrow;
    CardView text_to_yt;
    AppCompatImageView text_to_speech_demo;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_17_, container, false);



        text_to_java= view.findViewById(R.id.text_to_java);
        text_to_yt= view.findViewById(R.id.text_to_yt);
        text_to_java.setTextIsSelectable(true);
        text_to_xml= view.findViewById(R.id.text_to_xml);
        Text_code_arrow= view.findViewById(R.id.Text_code_arrow);
        text_to_xml.setTextIsSelectable(true);

        hello_toast_demo= view.findViewById(R.id.hello_toast_demo);

        text_to_speech_demo=view.findViewById(R.id.text_to_speech_demo);
        Text_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        text_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=c0s72KW6uTk");
            }
        });
        text_to_speech_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Text_to_speech_demo Text_to_speech_demo= new Text_to_speech_demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Text_to_speech_demo, "Text To Speech DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });


        text_to_java.setText("");

        text_to_xml.setText("");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
