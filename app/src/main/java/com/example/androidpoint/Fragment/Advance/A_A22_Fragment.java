package com.example.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;


public class A_A22_Fragment extends Fragment {

    AppCompatImageView Btn_arrow;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a22_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        return view;
    }
}