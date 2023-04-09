package com.example.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidpoint.R;

public class
A_A4_Fragment extends Fragment {

    Button b1;
    AppCompatImageView Btn_arrow;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a4_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_4_Fragment A_card_4_Fragment = new A_card_4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_4_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });



        b1= view.findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                ViewGroup viewGroup= view.findViewById(android.R.id.content);
                View dialog = LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_a__a4_1_,viewGroup,false);
                Button btn_no = dialog.findViewById(R.id.btn_no);
                Button btn_yes = dialog.findViewById(R.id.btn_yes);
                builder.setView(dialog);

                final AlertDialog alertDialog= builder.create();
                btn_no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                btn_yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        return view;
    }
}