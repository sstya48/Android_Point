package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.Fragment.Basic.B_card_10_Fragment;
import com.androidalians.androidpoint.R;


public class Scroll_Demo_Fragment extends Fragment {

    AppCompatImageView scrollview_demo_arrow;

    public Scroll_Demo_Fragment() {
        // Required empty public constructor
    }
   public static Scroll_Demo_Fragment newInstance() {
        Scroll_Demo_Fragment fragment = new Scroll_Demo_Fragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_scroll__demo_, container, false);

        scrollview_demo_arrow=view.findViewById(R.id.scrollview_demo_arrow);

        scrollview_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_10_Fragment ScrollView= new B_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScrollView, "ScrollView Demo Back")
                        .commit();
            }
        });
        return view;
    }
}