package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;


public class Screen_Orientation_Fragment extends Fragment {


    public Screen_Orientation_Fragment() {
        // Required empty public constructor
    }

   public static Screen_Orientation_Fragment newInstance() {
        Screen_Orientation_Fragment fragment = new Screen_Orientation_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_screen__potrait_, container, false);



        return view;
    }
}