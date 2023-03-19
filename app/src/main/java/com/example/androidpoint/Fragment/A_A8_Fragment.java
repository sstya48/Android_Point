package com.example.androidpoint.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.androidpoint.R;

import java.util.ArrayList;


public class A_A8_Fragment extends Fragment {
    ImageSlider imageslider;

    AppCompatImageView Btn_arrow;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a8_, container, false);


        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_8_Fragment A_card_8_Fragment = new A_card_8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_8_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });



        imageslider = view.findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://www.pexels.com/photo/couple-under-hut-beside-sea-and-infinity-pool-1024967/", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.pexels.com/photo/lake-and-mountain-under-white-sky-443446/", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.pexels.com/photo/architectural-photography-of-bridge-459203/", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.pexels.com/photo/red-and-black-bird-on-red-flowers-36762/", ScaleTypes.FIT));

        imageslider.setImageList(slideModels, ScaleTypes.FIT);

        return view;
    }
}