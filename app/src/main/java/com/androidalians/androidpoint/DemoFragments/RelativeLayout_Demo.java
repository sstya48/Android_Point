package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.R;

public class RelativeLayout_Demo extends Fragment {

    AppCompatImageView relative_Layout_arrow;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_relative_layout__demo, container, false);


        relative_Layout_arrow = view.findViewById(R.id.relative_Layout_arrow);
        relative_Layout_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllLayout ScrollView= new AllLayout();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScrollView, "Demo Back")
                        .commit();
            }
        });



        return view;
    }
}