package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidpoint.R;


public class Hello_World_Fragment extends Fragment {
    public static Hello_World_Fragment newInstance() {
        Hello_World_Fragment fragment = new Hello_World_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_hello__world_, container, false);

        Toast.makeText(getContext(), "Hello world!!", Toast.LENGTH_LONG).show();

        return view;
    }
}