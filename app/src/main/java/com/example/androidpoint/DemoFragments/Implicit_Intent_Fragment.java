package com.example.androidpoint.DemoFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;

public class Implicit_Intent_Fragment extends Fragment {

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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intent_implicit, container, false);

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

        return view;
    }
}