package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;

public class A_card_11_Fragment extends Fragment {

    TextView bar_java, bar_xml, bar_gridal_permission;

    ImageView bar_output;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_11_, container, false);

        bar_output = view.findViewById(R.id.bar_output);
        bar_java = view.findViewById(R.id.bar_java);
        bar_xml = view.findViewById(R.id.bar_xml);
        bar_gridal_permission = view.findViewById(R.id.bar_gridal_permission);


        bar_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A11_Fragment scroll_demo= new A_A11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        bar_java.setText("");

        bar_xml.setText("");

        bar_gridal_permission.setText("");

        return view;
    }
}