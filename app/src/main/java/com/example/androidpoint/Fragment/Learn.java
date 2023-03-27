package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpoint.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Learn extends Fragment {

    AdView adView_learn;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_learn, container, false);

      /*  //Adss=============================================
        //Banner Ad id====================================
        adView_learn=view.findViewById(R.id.adView_learn);

        //====================================================

        MobileAds.initialize(getContext());

        AdRequest adRequest=new AdRequest.Builder().build();


        //banner ad load
        adView_learn.loadAd(adRequest);
//========================================================

*/

        return view;
    }
}