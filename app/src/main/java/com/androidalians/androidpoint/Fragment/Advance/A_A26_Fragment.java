package com.androidalians.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_25_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_26_Fragment;
import com.androidalians.androidpoint.R;
import com.google.android.material.snackbar.Snackbar;


public class A_A26_Fragment extends Fragment {
    AppCompatImageView Btn_arrow;
    Button callbackButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a26_, container, false);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);
        callbackButton = view.findViewById(R.id.callbackButton);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_26_Fragment A_card_26_Fragment = new A_card_26_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_26_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });


        callbackButton = view.findViewById(R.id.callbackButton);

        callbackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                callbackButton = view.findViewById(R.id.callbackButton);
                String message = "canikissyou@gmail.com";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });



        return view;
    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}