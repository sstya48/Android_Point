package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androidpoint.R;

public class A_A2_Fragment extends Fragment {

    AppCompatImageView Btn_arrow;
     ToggleButton toggleButton1, toggleButton2;
     Button buttonSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  =  inflater.inflate(R.layout.fragment_a__a2_, container, false);


        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_2_Fragment A_card_2_Fragment = new A_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_2_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });


        toggleButton1 = view.findViewById(R.id.toggleButton);
        toggleButton2 = view.findViewById(R.id.toggleButton2);
        buttonSubmit = view.findViewById(R.id.button);



            //Performing action on button click
            buttonSubmit.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    StringBuilder result = new StringBuilder();
                    result.append("ToggleButton1 : ").append(toggleButton1.getText());
                    result.append("\nToggleButton2 : ").append(toggleButton2.getText());
                    //Displaying the message in toast
                    Toast.makeText(getContext(), result.toString(),Toast.LENGTH_LONG).show();
                }

            });


        return view;
    }
}