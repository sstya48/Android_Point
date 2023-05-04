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
import com.example.androidpoint.DemoFragments.VibratePhoneDemo;
import com.example.androidpoint.R;

public class B_card_23_Fragment extends Fragment {

    AppCompatImageView layout_demo, layout_arrow;

    TextView one_xml, two_xml, three_xml, four_xml, five_xml,  six_xml;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_23_, container, false);

        layout_demo= view.findViewById(R.id.layout_demo);
        layout_arrow= view.findViewById(R.id.layout_arrow);

        one_xml= view.findViewById(R.id.one_xml);
        one_xml.setTextIsSelectable(true);
        two_xml= view.findViewById(R.id.two_xml);
        two_xml.setTextIsSelectable(true);
        three_xml= view.findViewById(R.id.three_xml);
        three_xml.setTextIsSelectable(true);
        four_xml= view.findViewById(R.id.four_xml);
        four_xml.setTextIsSelectable(true);
        five_xml= view.findViewById(R.id.five_xml);
        five_xml.setTextIsSelectable(true);
        six_xml= view.findViewById(R.id.six_xml);
        six_xml.setTextIsSelectable(true);

        one_xml.setText("");
        two_xml.setText("");
        three_xml.setText("");
        four_xml.setText("");
        five_xml.setText("");
        six_xml.setText("");


        layout_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        layout_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AllLayout AllLayout= new AllLayout();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, AllLayout, "Custem Toast DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}


