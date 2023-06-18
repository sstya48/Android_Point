package com.androidalians.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.R;

public class GridLayoutFragment extends Fragment {

    AppCompatImageView grid_Layout_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid_layout, container, false);


        grid_Layout_arrow = view.findViewById(R.id.grid_Layout_arrow);
        grid_Layout_arrow.setOnClickListener(new View.OnClickListener() {
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