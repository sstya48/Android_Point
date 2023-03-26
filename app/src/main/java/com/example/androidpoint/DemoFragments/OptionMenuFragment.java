package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;

public class OptionMenuFragment extends Fragment {
    public OptionMenuFragment() {
        // Required empty public constructor
    }
    public static OptionMenuFragment newInstance() {
        OptionMenuFragment fragment = new OptionMenuFragment();
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
        View view= inflater.inflate(R.layout.fragment_option_menu, container, false);

        return view;
    }

}