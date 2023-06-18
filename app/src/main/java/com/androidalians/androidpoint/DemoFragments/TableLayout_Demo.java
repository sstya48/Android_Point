package com.androidalians.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.R;

public class TableLayout_Demo extends Fragment {
    AppCompatImageView table_Layout_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_table_layout__demo, container, false);

        table_Layout_arrow = view.findViewById(R.id.table_Layout_arrow);
        table_Layout_arrow.setOnClickListener(new View.OnClickListener() {
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