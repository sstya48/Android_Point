package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.R;

public class B_card_9_Fragment extends Fragment {

    AppCompatImageView timepicker_demo,Btn_arrow;

    TextView timepicker_xml,timepicker_java;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b_card_9_, container, false);



        timepicker_xml=view.findViewById(R.id.timepicker_xml);
        timepicker_xml.setTextIsSelectable(true);

        timepicker_java=view.findViewById(R.id.timepicker_java);
        timepicker_java.setTextIsSelectable(true);

        timepicker_demo=view.findViewById(R.id.timepicker_demo);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        timepicker_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        timepicker_java.setText("");

        timepicker_xml.setText("");

        return view;
    }
}