package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.androidalians.androidpoint.R;


public class ScrrenLandscape_Fragment extends Fragment {

    TextView landscape;

    Button Landscape1;


    public ScrrenLandscape_Fragment() {
        // Required empty public constructor
    }

    public static ScrrenLandscape_Fragment newInstance() {
        ScrrenLandscape_Fragment fragment = new ScrrenLandscape_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_scrren_landscape_, container, false);

        landscape = view.findViewById(R.id.landscape);
        Landscape1 = view.findViewById(R.id.Landscape1);
//        landscape.setText("This activity is Landscape orientation");



        Landscape1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen_Orientation_Fragment screen_orientation_portrait= new Screen_Orientation_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, screen_orientation_portrait, "screen Portrait DEMO")
                        .commit();
            }
        });

        return  view;
    }

  /*  @Override
    public void onResume() {
        super.onResume();
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
*/
  /*  @Override
    public void onDestroyView() {
        super.onDestroyView();

        getActivity().setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }*/
}