package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.androidalians.androidpoint.Fragment.Advance.Cards.A_card_15_Fragment;
import com.androidalians.androidpoint.R;

public class A_A15_Fragment extends Fragment {
    EditText etno;
    Button call;
    AppCompatImageView Btn_arrow;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a15_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_15_Fragment A_card_15_Fragment = new A_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_15_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        etno = view.findViewById(R.id.etno);
        call = view.findViewById(R.id.call);
       /* button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String number = edittext1.getText().toString();
               *//* Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);*//*
                Toast.makeText(getContext(),"Sorry this number can not enable",Toast.LENGTH_SHORT).show();
            }
        });
*/


        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String no = "tel:" + etno.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(no));
                startActivity(i);
            }
        });


            return view;
    }
}
