package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.androidpoint.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Basic extends Fragment {
    ImageSlider imageslider;
    CardView card_view1, card_view2, card_view3, card_view4,card_view5,card_view6,card_view7,
            card_view8,card_view9,card_view10,card_view11,card_view12,card_view13,card_view14,
            card_view15,card_view16, card_view17, card_view18, card_view19, card_view20;

    AdView adView_basic;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public Basic() {
        // Required empty public constructor
    }

    public static Basic newInstance() {
        Basic fragment = new Basic();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_basic, container, false);



        imageslider = view.findViewById(R.id.imageslider);

      /*  //Adss=============================================
        //Banner Ad id====================================
        adView_basic=view.findViewById(R.id.adView_basic);

        //====================================================

        MobileAds.initialize(getContext());

        AdRequest adRequest=new AdRequest.Builder().build();


        //banner ad load
        adView_basic.loadAd(adRequest);
//========================================================

*/

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://c1.wallpaperflare.com/preview/595/1003/783/code-coder-coding-computer.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/1181271/pexels-photo-1181271.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/2653362/pexels-photo-2653362.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/546819/pexels-photo-546819.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));

        imageslider.setImageList(slideModels, ScaleTypes.FIT);

        card_view1 = view.findViewById(R.id.card_view1);
        card_view2 = view.findViewById(R.id.card_view2);
        card_view3 = view.findViewById(R.id.card_view3);
        card_view4 = view.findViewById(R.id.card_view4);
        card_view5 = view.findViewById(R.id.card_view5);
        card_view6 = view.findViewById(R.id.card_view6);
        card_view7 = view.findViewById(R.id.card_view7);
        card_view8 = view.findViewById(R.id.card_view8);
        card_view9 = view.findViewById(R.id.card_view9);
        card_view10 = view.findViewById(R.id.card_view10);
        card_view11 = view.findViewById(R.id.card_view11);
        card_view12 = view.findViewById(R.id.card_view12);
        card_view13 = view.findViewById(R.id.card_view13);
        card_view14 = view.findViewById(R.id.card_view14);
        card_view15 = view.findViewById(R.id.card_view15);
        card_view16 = view.findViewById(R.id.card_view16);
        card_view17 = view.findViewById(R.id.card_view17);
        card_view18 = view.findViewById(R.id.card_view18);
        card_view19 = view.findViewById(R.id.card_view19);
        card_view20 = view.findViewById(R.id.card_view20);


        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld= new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_2_Fragment ActivityLife= new B_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ActivityLife, "ActivityLife Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_3_Fragment HideTitle= new B_card_3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, HideTitle, "HideTitle Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_4_Fragment ScreenOrientation= new B_card_4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScreenOrientation, "ScreenOrientation Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_5_Fragment CheckBox= new B_card_5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, CheckBox, "CheckBox Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_6_Fragment RadioBtn= new B_card_6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, RadioBtn, "RadioBtn Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_7_Fragment ListView= new B_card_7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ListView, "ListView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_8_Fragment DatePicker= new B_card_8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, DatePicker, "DatePicker Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_9_Fragment TimePicker= new B_card_9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, TimePicker, "TimePicker Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_10_Fragment ScrollView= new B_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScrollView, "ScrollView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_11_Fragment SearchView= new B_card_11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, SearchView, "SearchView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_12_Fragment ImplicitIntent= new B_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ImplicitIntent, "ImplicitIntent Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_13_Fragment ExplicitIntent= new B_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "ExplicitIntent Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_14_Fragment OptionMenu= new B_card_14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, OptionMenu, "OptionMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_15_Fragment ContextMenu= new B_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ContextMenu, "ContextMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_16_Fragment PopupMenu= new B_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_17_Fragment PopupMenu= new B_card_17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_18_Fragment PopupMenu= new B_card_18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_19_Fragment PopupMenu= new B_card_19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_20_Fragment PopupMenu= new B_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}

