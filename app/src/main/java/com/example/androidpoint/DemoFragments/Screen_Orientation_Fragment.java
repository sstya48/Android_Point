package com.example.androidpoint.DemoFragments;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.androidpoint.Activity.LandscapeActivity;
import com.example.androidpoint.R;


public class Screen_Orientation_Fragment extends Fragment {

    Button portrait;

    public Screen_Orientation_Fragment() {
        // Required empty public constructor
    }

   public static Screen_Orientation_Fragment newInstance() {
        Screen_Orientation_Fragment fragment = new Screen_Orientation_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_screen__potrait_, container, false);

        portrait= view.findViewById(R.id.portrait);

        portrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent landscape = new Intent(getActivity(), LandscapeActivity.class);
                startActivity(landscape);

               /* ScrrenLandscape_Fragment scrren_Landscape_fragment= new ScrrenLandscape_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scrren_Landscape_fragment, "screen Landscape DEMO")
                        .addToBackStack(null)
                        .commit();*/
            }
        });



        return view;
    }
}