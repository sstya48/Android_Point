package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_13_Fragment extends Fragment {

    TextView pie_java, pie_xml, pie_gridal_permission;

    ImageView pie_output;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_13_, container, false);

        pie_output = view.findViewById(R.id.pie_output);
        pie_java = view.findViewById(R.id.pie_java);
        pie_xml = view.findViewById(R.id.pie_xml);
        pie_gridal_permission = view.findViewById(R.id.pie_gridal_permission);


        pie_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A13_Fragment scroll_demo= new A_A13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        pie_java.setText("");
        pie_java.setTextIsSelectable(true);

        pie_xml.setText("");
        pie_xml.setTextIsSelectable(true);

        pie_gridal_permission.setText("");
        pie_gridal_permission.setTextIsSelectable(true);

        return view;
    }
}