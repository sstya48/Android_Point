package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;

public class Hide_Title_Demo_Fragment extends Fragment {


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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hide__title__demo_, container, false);

        return view;
    }
}