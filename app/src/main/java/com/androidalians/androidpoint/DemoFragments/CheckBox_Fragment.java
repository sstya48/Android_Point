package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.androidalians.androidpoint.Fragment.Basic.B_card_5_Fragment;
import com.androidalians.androidpoint.R;

public class CheckBox_Fragment extends Fragment implements View.OnClickListener {

    CheckBox pizza, coffe, burger;
    Button buttonOrder;

    AppCompatImageView check_demo_arrow;

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

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_box_, container, false);

        check_demo_arrow = view.findViewById(R.id.check_demo_arrow);

        pizza = view.findViewById(R.id.checkBox);
        coffe = view.findViewById(R.id.checkBox2);
        burger = view.findViewById(R.id.checkBox3);
        buttonOrder = view.findViewById(R.id.button);

        pizza.setOnClickListener(this);
        coffe.setOnClickListener(this);
        burger.setOnClickListener(this);
        buttonOrder.setOnClickListener(this);

        check_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_5_Fragment CheckBoxBackFrag = new B_card_5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, CheckBoxBackFrag, "CheckBox Demo Back")
                        .commit();
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {

        int totalamount = 0;
        StringBuilder result = new StringBuilder();
        result.append("Selected Items:");
        if (pizza.isChecked()) {
            result.append("\nPizza 100Rs");
            totalamount += 100;
        }
        if (coffe.isChecked()) {
            result.append("\nCoffe 50Rs");
            totalamount += 50;
        }
        if (burger.isChecked()) {
            result.append("\nBurger 120Rs");
            totalamount += 120;
        }
        result.append("\nTotal: " + totalamount + "Rs");

        Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_LONG).show();

    }
}
