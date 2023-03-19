package com.example.androidpoint.DemoFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;

public class Explicit_Intent1_Fragment extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_explicit__intent1_, container, false);

        editText=view.findViewById(R.id.editText);
        btn1=view.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Explicit_Intent2_Fragment explicitIntent2Fragment = new Explicit_Intent2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, explicitIntent2Fragment, "Explicit 2 DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}