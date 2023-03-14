package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_4_Fragment extends Fragment {

    TextView alert_java, alert_xml;
    ImageView alert_output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_4_, container, false);

        alert_output = view.findViewById(R.id.alert_output);
        alert_java = view.findViewById(R.id.alert_java);
        alert_xml = view.findViewById(R.id.alert_xml);

        alert_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A4_Fragment scroll_demo= new A_A4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        alert_java.setText("package example.androidalians.alertdemo");
        alert_xml.setText("");

        return view;
    }
}