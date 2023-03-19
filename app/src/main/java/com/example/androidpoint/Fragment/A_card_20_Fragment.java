package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;

public class A_card_20_Fragment extends Fragment {

    TextView flash_java, flash_xml, Gridal_Permission;
    ImageView flash_output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_20_, container, false);

        flash_java = view.findViewById(R.id.flash_java);
        flash_xml = view.findViewById(R.id.flash_xml);
        Gridal_Permission = view.findViewById(R.id.Gridal_Permission);
        flash_output = view.findViewById(R.id.flash_output);

        flash_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A20_Fragment scroll_demo= new A_A20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        flash_java.setTextIsSelectable(true);
        flash_java.setText("");

        flash_xml.setTextIsSelectable(true);
        flash_xml.setText("");

        Gridal_Permission.setTextIsSelectable(true);
        Gridal_Permission.setText("");


        return view;
    }
}