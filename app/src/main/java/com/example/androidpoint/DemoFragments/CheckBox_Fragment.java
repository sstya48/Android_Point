package com.example.androidpoint.DemoFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.androidpoint.R;


public class CheckBox_Fragment extends Fragment implements View.OnClickListener {

    CheckBox pizza,coffe,burger;
    Button buttonOrder;

    public CheckBox_Fragment() {
        // Required empty public constructor
    }

     public static CheckBox_Fragment newInstance() {
        CheckBox_Fragment fragment = new CheckBox_Fragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_check_box_, container, false);

        pizza=view.findViewById(R.id.checkBox);
        coffe=view.findViewById(R.id.checkBox2);
        burger=view.findViewById(R.id.checkBox3);
        buttonOrder=view.findViewById(R.id.button);

        pizza.setOnClickListener(this);
        coffe.setOnClickListener(this);
        burger.setOnClickListener(this);
        buttonOrder.setOnClickListener(this);


        return view;
     }

    @Override
    public void onClick(View view) {

        int totalamount=0;
        StringBuilder result=new StringBuilder();
        result.append("Selected Items:");
        if(pizza.isChecked()){
            result.append("\nPizza 100Rs");
            totalamount+=100;
        }
        if(coffe.isChecked()){
            result.append("\nCoffe 50Rs");
            totalamount+=50;
        }
        if(burger.isChecked()){
            result.append("\nBurger 120Rs");
            totalamount+=120;
        }
        result.append("\nTotal: "+totalamount+"Rs");


        Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_LONG).show();
    }

}
