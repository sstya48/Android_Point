package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;


public class A_A16_Fragment extends Fragment {

    AppCompatImageView Btn_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a16_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_16_Fragment A_card_16_Fragment = new A_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_16_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}