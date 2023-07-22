package com.androidalians.androidpoint.Fragment.Basic;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Basic extends Fragment {
    ImageSlider imageslider;
    CardView card_view1, card_view2, card_view3, card_view4, card_view5, card_view6, card_view7,
            card_view8, card_view9, card_view10, card_view11, card_view12, card_view13, card_view14,
            card_view15, card_view16, card_view17, card_view18, card_view19, card_view20, card_view21,
            card_view22, card_view23, card_view24;

    AdView adView_basic;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        // Initialize AdMob SDK (only once in your app)
        MobileAds.initialize(requireContext());
        loadNativeAd();
        loadNativeAd2();


        ArrayList<SlideModel> slideModels = new ArrayList<>();

        db.collection("SliderImages")
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot queryDocumentSnapshot : task.getResult()) {
                                slideModels.add(new SlideModel(queryDocumentSnapshot.getString("url"), ScaleTypes.FIT));
                                imageslider.setImageList(slideModels, ScaleTypes.FIT);
                            }

                        } else {
                            Toast.makeText(getContext(), "Can't load Images", Toast.LENGTH_SHORT).show();
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getActivity(), "Can't load Images", Toast.LENGTH_SHORT).show();
                    }
                });

/*
        slideModels.add(new SlideModel("https://c1.wallpaperflare.com/preview/595/1003/783/code-coder-coding-computer.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/1181271/pexels-photo-1181271.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/2653362/pexels-photo-2653362.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.pexels.com/photos/546819/pexels-photo-546819.jpeg?auto=compress&cs=tinysrgb&w=600", ScaleTypes.FIT));

        imageslider.setImageList(slideModels, ScaleTypes.FIT);
*/

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
        card_view21 = view.findViewById(R.id.card_view21);
        card_view22 = view.findViewById(R.id.card_view22);
        card_view23 = view.findViewById(R.id.card_view23);
        card_view24 = view.findViewById(R.id.card_view24);


        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_1_Fragment Helloworld = new B_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Helloworld, "Helloworld Code")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_2_Fragment ActivityLife = new B_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ActivityLife, "ActivityLife Code")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_3_Fragment HideTitle = new B_card_3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, HideTitle, "HideTitle Code")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_4_Fragment ScreenOrientation = new B_card_4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScreenOrientation, "ScreenOrientation Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_5_Fragment CheckBox = new B_card_5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, CheckBox, "CheckBox Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_6_Fragment RadioBtn = new B_card_6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, RadioBtn, "RadioBtn Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_7_Fragment ListView = new B_card_7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ListView, "ListView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_8_Fragment DatePicker = new B_card_8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, DatePicker, "DatePicker Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_9_Fragment TimePicker = new B_card_9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, TimePicker, "TimePicker Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_10_Fragment ScrollView = new B_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ScrollView, "ScrollView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_11_Fragment SearchView = new B_card_11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, SearchView, "SearchView Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_12_Fragment ImplicitIntent = new B_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ImplicitIntent, "ImplicitIntent Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_13_Fragment ExplicitIntent = new B_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "ExplicitIntent Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_14_Fragment OptionMenu = new B_card_14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, OptionMenu, "OptionMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_15_Fragment ContextMenu = new B_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ContextMenu, "ContextMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_16_Fragment PopupMenu = new B_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_17_Fragment PopupMenu = new B_card_17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_18_Fragment PopupMenu = new B_card_18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_19_Fragment PopupMenu = new B_card_19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_20_Fragment PopupMenu = new B_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_21_Fragment PopupMenu = new B_card_21_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_22_Fragment PopupMenu = new B_card_22_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });
        card_view23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_23_Fragment PopupMenu = new B_card_23_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        card_view24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_24_Fragment PopupMenu = new B_card_24_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "Code")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }

    private void loadNativeAd2() {
        AdLoader adLoader = new AdLoader.Builder(requireContext(), "ca-app-pub-3940256099942544/2247696110")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
                        // The native ad is loaded. Now, let's add it to the native_ad_container.

                        // Inflate the native ad layout
                        View adView = LayoutInflater.from(requireContext()).inflate(R.layout.item_native_ad, null);

                        // Populate the ad view components with the native ad's assets
                        NativeAdView nativeAdView = adView.findViewById(R.id.nativeAdView);
                        populateNativeAdView(nativeAd, nativeAdView);

                        // Get the root view of the fragment's layout
                        View rootView = getView();

                        if (rootView != null) {
                            // Get the native_ad_container
                            LinearLayoutCompat nativeAdContainer2 = rootView.findViewById(R.id.native_ad_container2);

                            // Add the native ad view to the native_ad_container
                            nativeAdContainer2.removeAllViews();
                            nativeAdContainer2.addView(adView);
                        }
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle ad loading failure if needed
                    }
                })
                .build();

        // Load the native ad
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    private void loadNativeAd() {
        AdLoader adLoader = new AdLoader.Builder(requireContext(), "ca-app-pub-3940256099942544/2247696110")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
                        // The native ad is loaded. Now, let's add it to the native_ad_container.

                        // Inflate the native ad layout
                        View adView = LayoutInflater.from(requireContext()).inflate(R.layout.item_native_ad, null);

                        // Populate the ad view components with the native ad's assets
                        NativeAdView nativeAdView = adView.findViewById(R.id.nativeAdView);
                        populateNativeAdView(nativeAd, nativeAdView);

                        // Get the root view of the fragment's layout
                        View rootView = getView();

                        if (rootView != null) {
                            // Get the native_ad_container
                            LinearLayoutCompat nativeAdContainer = rootView.findViewById(R.id.native_ad_container);

                            // Add the native ad view to the native_ad_container
                            nativeAdContainer.removeAllViews();
                            nativeAdContainer.addView(adView);
                        }
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle ad loading failure if needed
                    }
                })
                .build();

        // Load the native ad
        adLoader.loadAd(new AdRequest.Builder().build());
    }


    private void populateNativeAdView(NativeAd nativeAd, NativeAdView adView) {
        // Set the media view. Media view is mandatory for Native Ad.
       /* MediaView mediaView = adView.findViewById(R.id.ad_media);
        adView.setMediaView(mediaView);*/

        // Set other assets from the NativeAd to the ad view.
        adView.setHeadlineView(adView.findViewById(R.id.nativeAdTitle));
        adView.setBodyView(adView.findViewById(R.id.nativeAdDescription));
//        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.nativeAdIcon));

        // Register the ad asset views with the NativeAd, so they can be automatically populated.
        adView.setNativeAd(nativeAd);

        // Set the text of the headline, body, and call-to-action button from the ad.
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
//        ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());

        // Download and set the ad icon.
        NativeAd.Image icon = nativeAd.getIcon();
        if (icon == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(icon.getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        // Add click action to the ad.
        adView.setClickable(true);
        adView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform desired action when the ad is clicked.
                // For example, you can open a webpage or an in-app view.
            }
        });
    }


}

