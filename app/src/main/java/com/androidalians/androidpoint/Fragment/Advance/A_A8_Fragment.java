package com.androidalians.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.androidalians.androidpoint.R;

import java.util.ArrayList;


public class A_A8_Fragment extends Fragment {
    ImageSlider imageslider;
    AppCompatImageView Btn_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a8_, container, false);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);

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

        slideModels.add(new SlideModel("https://wallpaperaccess.com/full/4294242.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://wallpaperaccess.com/full/2653151.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://wallpaperaccess.com/full/4293252.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://wallpaperaccess.com/full/261882.jpg", ScaleTypes.FIT));

        imageslider.setImageList(slideModels, ScaleTypes.FIT);

        return view;
    }
}