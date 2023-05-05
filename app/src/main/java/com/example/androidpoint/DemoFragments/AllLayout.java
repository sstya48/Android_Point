package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidpoint.Fragment.Basic.B_card_10_Fragment;
import com.example.androidpoint.Fragment.Basic.B_card_1_Fragment;
import com.example.androidpoint.Fragment.Basic.B_card_23_Fragment;
import com.example.androidpoint.R;

public class AllLayout extends Fragment {

    AppCompatImageView layout_demo_main;

    Button button1, button2, button3, button4, button5, button6, button7;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_layout, container, false);

        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        layout_demo_main = view.findViewById(R.id.layout_demo_main);

        layout_demo_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_23_Fragment ScrollView= new B_card_23_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScrollView, "Demo Back")
                        .commit();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FrameLayout_Demo Helloworld= new FrameLayout_Demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout_Demo Helloworld= new LinearLayout_Demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });



        return view;
    }
}