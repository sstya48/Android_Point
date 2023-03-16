package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_14_Fragment extends Fragment {

    TextView insta_java, insta_xml, insta_gridal_permission;
    ImageView insta_output;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_14_, container, false);

        insta_output = view.findViewById(R.id.insta_output);
        insta_java = view.findViewById(R.id.insta_java);
        insta_xml = view.findViewById(R.id.insta_xml);
        insta_gridal_permission = view.findViewById(R.id.insta_gridal_permission);


        insta_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A14_Fragment scroll_demo= new A_A14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        insta_java.setText("");

        insta_xml.setText("");

        insta_gridal_permission.setText("");


        return view;
    }
}