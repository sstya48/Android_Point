package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.Fragment.Basic.B_card_3_Fragment;
import com.example.androidpoint.R;

public class Hide_Title_Demo_Fragment extends Fragment {


    AppCompatImageView hide_demo_arrow;

    public Hide_Title_Demo_Fragment() {
        // Required empty public constructor
    }

     public static Hide_Title_Demo_Fragment newInstance() {
        Hide_Title_Demo_Fragment fragment = new Hide_Title_Demo_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_hide__title__demo_, container, false);

        hide_demo_arrow=view.findViewById(R.id.hide_demo_arrow);

        hide_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_3_Fragment hideBackFrag= new B_card_3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, hideBackFrag, "Hide Demo Back")
                        .commit();
            }
        });

        return view;
    }
}