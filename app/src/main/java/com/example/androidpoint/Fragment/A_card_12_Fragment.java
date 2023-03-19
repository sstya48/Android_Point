package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_12_Fragment extends Fragment {

    TextView line_java, line_xml, line_gridal_permission;

    ImageView line_output;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_12_, container, false);


        line_output = view.findViewById(R.id.line_output);
        line_java = view.findViewById(R.id.line_java);
        line_xml = view.findViewById(R.id.line_xml);
        line_gridal_permission = view.findViewById(R.id.line_gridal_permission);


        line_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A12_Fragment scroll_demo= new A_A12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        line_java.setText("");
        line_java.setTextIsSelectable(true);

        line_xml.setText("");
        line_xml.setTextIsSelectable(true);

        line_gridal_permission.setText("");
        line_gridal_permission.setTextIsSelectable(true);

        return view;
    }
}