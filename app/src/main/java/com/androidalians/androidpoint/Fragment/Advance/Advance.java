package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

public class Advance extends Fragment {

    CardView card_view1, card_view2, card_view3, card_view4,card_view5,card_view6,
            card_view7,card_view8,card_view9,card_view10,card_view11,card_view12,
            card_view13,card_view14,card_view15,card_view16,card_view17,card_view18, card_view19,
            card_view20, card_view21, card_view22, card_view23, card_view24;


    AdView adView_advance;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_advance, container, false);

        // Initialize AdMob SDK (only once in your app)
        MobileAds.initialize(requireContext());
//        loadNativeAd();
        loadNativeAd2();

        card_view1 = view.findViewById(R.id.card1);
        card_view2 = view.findViewById(R.id.card2);
        card_view3 = view.findViewById(R.id.card3);
        card_view4 = view.findViewById(R.id.card4);
        card_view5 = view.findViewById(R.id.card5);
        card_view6 = view.findViewById(R.id.card6);
        card_view7 = view.findViewById(R.id.card7);
        card_view8 = view.findViewById(R.id.card8);
        card_view9 = view.findViewById(R.id.card9);
        card_view10 = view.findViewById(R.id.card10);
        card_view11 = view.findViewById(R.id.card11);
        card_view12 = view.findViewById(R.id.card12);
        card_view13 = view.findViewById(R.id.card13);
        card_view14 = view.findViewById(R.id.card14);
        card_view15 = view.findViewById(R.id.card15);
        card_view16 = view.findViewById(R.id.card16);
        card_view17 = view.findViewById(R.id.card17);
        card_view18 = view.findViewById(R.id.card18);
        card_view19 = view.findViewById(R.id.card19);
        card_view20 = view.findViewById(R.id.card20);
        card_view21 = view.findViewById(R.id.card21);
        card_view22 = view.findViewById(R.id.card22);
        card_view23 = view.findViewById(R.id.card23);
        card_view24 = view.findViewById(R.id.card24);


      /*  //Adss=============================================
        //Banner Ad id====================================
        adView_advance=view.findViewById(R.id.adView_advance);

        //====================================================

        MobileAds.initialize(getContext());

        AdRequest adRequest=new AdRequest.Builder().build();


        //banner ad load
        adView_advance.loadAd(adRequest);
//========================================================

*/
        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_1_Fragment nextFrag= new A_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_2_Fragment nextFrag= new A_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_3_Fragment nextFrag= new A_card_3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_4_Fragment nextFrag= new A_card_4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_5_Fragment nextFrag= new A_card_5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_6_Fragment nextFrag= new A_card_6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_7_Fragment nextFrag= new A_card_7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_8_Fragment nextFrag= new A_card_8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_9_Fragment nextFrag= new A_card_9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_10_Fragment nextFrag= new A_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_11_Fragment nextFrag= new A_card_11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_12_Fragment nextFrag= new A_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_13_Fragment nextFrag= new A_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_14_Fragment nextFrag= new A_card_14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_15_Fragment nextFrag= new A_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_16_Fragment nextFrag= new A_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_17_Fragment nextFrag= new A_card_17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_18_Fragment nextFrag= new A_card_18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });

        card_view19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_19_Fragment nextFrag= new A_card_19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });
        card_view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_20_Fragment nextFrag= new A_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });

        card_view21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_21_Fragment nextFrag= new A_card_21_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });

        card_view22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_22_Fragment nextFrag= new A_card_22_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });

        card_view23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_23_Fragment nextFrag= new A_card_23_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();


            }
        });

        card_view24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_24_Fragment nextFrag= new A_card_24_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
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
                            LinearLayoutCompat nativeAdContainer2 = rootView.findViewById(R.id.native_ad_containerAdvance2);

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

  /*  private void loadNativeAd() {
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
                            LinearLayoutCompat nativeAdContainer = rootView.findViewById(R.id.native_ad_containerAdvance1);

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
    }*/


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