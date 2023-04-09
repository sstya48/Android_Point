package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.Fragment.Basic.B_card_13_Fragment;
import com.example.androidpoint.R;

public class Explicit_Intent2_Fragment extends Fragment {

    AppCompatImageView explicit_demo_arrow;
    TextView editText2;
    Button btn2;
    public Explicit_Intent2_Fragment() {
        // Required empty public constructor
    }

    public static Explicit_Intent2_Fragment newInstance() {
        Explicit_Intent2_Fragment fragment = new Explicit_Intent2_Fragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_explicit__intent2, container, false);

        explicit_demo_arrow=view.findViewById(R.id.explicit_demo_arrow);

        editText2=view.findViewById(R.id.editText2);
        btn2=view.findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Explicit_Intent1_Fragment explicitIntent1Fragment = new Explicit_Intent1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, explicitIntent1Fragment, "Explicit 1 DEMO")
                        .commit();
            }
        });

        explicit_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_13_Fragment ExplicitIntent= new B_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "ExplicitIntent Demo Back2")
                        .commit();
            }
        });
        return view;
    }
}