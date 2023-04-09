package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.Fragment.Basic.B_card_14_Fragment;
import com.example.androidpoint.R;

public class OptionMenuFragment extends Fragment {

    AppCompatImageView optionMenu_demo_arrow;
    public OptionMenuFragment() {
        // Required empty public constructor
    }
    public static OptionMenuFragment newInstance() {
        OptionMenuFragment fragment = new OptionMenuFragment();
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
        View view= inflater.inflate(R.layout.fragment_option_menu, container, false);


        optionMenu_demo_arrow=view.findViewById(R.id.optionMenu_demo_arrow);

        optionMenu_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_14_Fragment OptionMenu= new B_card_14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, OptionMenu, "OptionMenu Demo Back")
                        .commit();
            }
        });

        return view;
    }

}