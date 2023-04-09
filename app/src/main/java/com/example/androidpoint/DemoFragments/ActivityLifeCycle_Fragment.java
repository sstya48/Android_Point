package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.Fragment.Basic.B_card_2_Fragment;
import com.example.androidpoint.R;


public class ActivityLifeCycle_Fragment extends Fragment {

    AppCompatImageView cycle_demo_arrow;

    public ActivityLifeCycle_Fragment() {
        // Required empty public constructor
    }

  public static ActivityLifeCycle_Fragment newInstance() {
        ActivityLifeCycle_Fragment fragment = new ActivityLifeCycle_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_activity_life_cycle_, container, false);


        cycle_demo_arrow=view.findViewById(R.id.cycle_demo_arrow);

        cycle_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_2_Fragment ActivityLifeBackFrag= new B_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ActivityLifeBackFrag, "ActivityLife Demo Back")
                        .commit();
            }
        });

        return view;
    }
}