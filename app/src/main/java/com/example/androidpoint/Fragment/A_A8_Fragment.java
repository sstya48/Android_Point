package com.example.androidpoint.Fragment;

import android.os.Bundle;

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a8_, container, false);






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