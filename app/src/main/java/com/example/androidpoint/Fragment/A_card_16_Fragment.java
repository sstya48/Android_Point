package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_16_Fragment extends Fragment {

    TextView sms_java, sms_xml, sms_gridal_permission;

    ImageView sms_output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_16_, container, false);

        sms_output = view.findViewById(R.id.sms_output);
        sms_java = view.findViewById(R.id.sms_java);
        sms_xml = view.findViewById(R.id.sms_xml);
        sms_gridal_permission = view.findViewById(R.id.sms_gridal_permission);


        sms_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A16_Fragment scroll_demo= new A_A16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        sms_java.setText("");

        sms_xml.setText("");

        sms_gridal_permission.setText("");


        return view;
    }
}