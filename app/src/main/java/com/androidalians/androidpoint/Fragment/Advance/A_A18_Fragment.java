package com.androidalians.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_18_Fragment;
import com.androidalians.androidpoint.R;


public class A_A18_Fragment extends Fragment {

    AppCompatImageView Btn_arrow;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a18_, container, false);

         Btn_arrow=view.findViewById(R.id.Btn_arrow);

         Btn_arrow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 A_card_18_Fragment A_card_18_Fragment = new A_card_18_Fragment();
                 getActivity().getSupportFragmentManager().beginTransaction()
                         .replace(R.id.frame_container, A_card_18_Fragment, "Back Button Basic")
                         .addToBackStack(null)
                         .commit();
             }
         });


        return view;
    }
}