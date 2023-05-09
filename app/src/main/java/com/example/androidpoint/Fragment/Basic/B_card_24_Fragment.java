package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.AllLayout;
import com.example.androidpoint.DemoFragments.ImageSwitcher_Demo;
import com.example.androidpoint.R;

public class B_card_24_Fragment extends Fragment {
    AppCompatImageView image_switcher_arrow,image_switcher_demo;
    TextView content_main_xml,image_switcher_xml,image_switcher_java;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_24_, container, false);

        image_switcher_arrow= view.findViewById(R.id.image_switcher_arrow);
        image_switcher_demo= view.findViewById(R.id.image_switcher_demo);
        content_main_xml= view.findViewById(R.id.content_main_xml);
        content_main_xml.setTextIsSelectable(true);
        image_switcher_xml= view.findViewById(R.id.image_switcher_xml);
        image_switcher_xml.setTextIsSelectable(true);
        image_switcher_java= view.findViewById(R.id.image_switcher_java);
        image_switcher_java.setTextIsSelectable(true);


        content_main_xml.setText("");
        image_switcher_xml.setText("");
        image_switcher_java.setText("");


        image_switcher_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        image_switcher_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageSwitcher_Demo AllLayout= new ImageSwitcher_Demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, AllLayout, "Image Switcher DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}