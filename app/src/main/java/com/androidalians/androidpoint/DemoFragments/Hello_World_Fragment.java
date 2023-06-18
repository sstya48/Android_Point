package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.androidalians.androidpoint.Fragment.Basic.B_card_1_Fragment;
import com.androidalians.androidpoint.R;


public class Hello_World_Fragment extends Fragment {

    AppCompatImageView hello_demo_arrow;
    public static Hello_World_Fragment newInstance() {
        Hello_World_Fragment fragment = new Hello_World_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_hello__world_, container, false);

        Toast.makeText(getContext(), "Hello world!!", Toast.LENGTH_LONG).show();

        hello_demo_arrow=view.findViewById(R.id.hello_demo_arrow);

        hello_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                B_card_1_Fragment helloBackFrag= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, helloBackFrag, "Hello Demo Back")
                        .commit();
            }
        });

        return view;
    }
}