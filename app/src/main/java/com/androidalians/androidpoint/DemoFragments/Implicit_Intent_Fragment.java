package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.androidalians.androidpoint.Fragment.Basic.B_card_12_Fragment;
import com.androidalians.androidpoint.R;

public class Implicit_Intent_Fragment extends Fragment {

    AppCompatImageView implicit_demo_arrow;

    Button bt_implicit;


    public Implicit_Intent_Fragment() {
        // Required empty public constructor
    }

    public static Implicit_Intent_Fragment newInstance() {
        Implicit_Intent_Fragment fragment = new Implicit_Intent_Fragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intent_implicit, container, false);

        implicit_demo_arrow = view.findViewById(R.id.implicit_demo_arrow);

        bt_implicit = view.findViewById(R.id.bt_implicit);

        bt_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/@Androidalians"));
                startActivity(intent);
                Toast.makeText(getContext(), "Implicit Intent", Toast.LENGTH_SHORT).show();
            }
        });

        implicit_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_12_Fragment ImplicitIntent= new B_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ImplicitIntent, "ImplicitIntent Demo Back")
                        .commit();
            }
        });

        return view;
    }
}