package com.androidalians.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_10_Fragment;
import com.androidalians.androidpoint.R;


public class A_A10_Fragment extends Fragment {

    Button buttonSubmit;

    AppCompatImageView Btn_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a10_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_10_Fragment A_card_10_Fragment = new A_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_10_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });


        buttonSubmit = view.findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Registration Successfully...!" , Toast.LENGTH_SHORT).show();

            }
        });



        return view;
    }
}