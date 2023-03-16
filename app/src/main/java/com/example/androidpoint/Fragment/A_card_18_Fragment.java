package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_18_Fragment extends Fragment {

    TextView db_java, db_xml, db_gridal_permission;

    ImageView db_output;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_18_, container, false);

        db_output = view.findViewById(R.id.db_output);
        db_java = view.findViewById(R.id.db_java);
        db_xml = view.findViewById(R.id.db_xml);
        db_gridal_permission = view.findViewById(R.id.db_gridal_permission);


        db_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A18_Fragment scroll_demo= new A_A18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        db_java.setText("");

        db_xml.setText("");

        db_gridal_permission.setText("");


        return view;
    }
}