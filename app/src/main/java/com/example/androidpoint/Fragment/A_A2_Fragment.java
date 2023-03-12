package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androidpoint.R;

public class A_A2_Fragment extends Fragment {

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