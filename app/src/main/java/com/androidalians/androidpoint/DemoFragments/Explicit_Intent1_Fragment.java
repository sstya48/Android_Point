package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.androidalians.androidpoint.Fragment.Basic.B_card_13_Fragment;
import com.androidalians.androidpoint.R;

public class Explicit_Intent1_Fragment extends Fragment {

    AppCompatImageView explicit_demo_arrow;

    TextView editText;
    Button btn1;


    public Explicit_Intent1_Fragment() {
        // Required empty public constructor
    }

    public static Explicit_Intent1_Fragment newInstance() {
        Explicit_Intent1_Fragment fragment = new Explicit_Intent1_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_explicit__intent1_, container, false);

        explicit_demo_arrow=view.findViewById(R.id.explicit_demo_arrow);

        editText=view.findViewById(R.id.editText);
        btn1=view.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Explicit_Intent2_Fragment explicitIntent2Fragment = new Explicit_Intent2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, explicitIntent2Fragment, "Explicit 2 DEMO")
                        .commit();
            }
        });

        explicit_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_13_Fragment ExplicitIntent= new B_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "ExplicitIntent Demo Back")
                        .commit();
            }
        });
        return view;
    }
}