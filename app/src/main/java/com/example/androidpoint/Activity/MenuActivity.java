package com.example.androidpoint.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.androidpoint.R;
import com.example.androidpoint.SaveState;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MenuActivity extends AppCompatActivity {


    LinearLayout shareapp,tips,feedback,rate_us, about_us,ads_show ;

    FrameLayout frameLayout;

    MainActivity mContext;
    Fragment fragment = null;
    Switch mode_dark;
    LinearLayout mode_change;
    ImageView light;

    //dark mode
    boolean isNightModeOn;
    SaveState saveState;

    InterstitialAd mInterstitialAd;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveState = new SaveState(this);
        if (saveState.getState() == true) {
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        setContentView(R.layout.activity_menu);

/*
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            isNightModeOn = false;

        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            isNightModeOn = true;
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }*/


        about_us = findViewById(R.id.about_us);
        rate_us = findViewById(R.id.rate_us);
        mode_dark = findViewById(R.id.mode_dark);
        mode_change = findViewById(R.id.mode_change);
        light = findViewById(R.id.light);
        shareapp = (LinearLayout) findViewById(R.id.shareapp);
        feedback = (LinearLayout) findViewById(R.id.feedback);
        tips = (LinearLayout) findViewById(R.id.tips);
        ads_show = (LinearLayout) findViewById(R.id.ads_show);


        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent tips = new Intent(MenuActivity.this, TipsActivity.class);
                startActivity(tips);
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MenuActivity.this, Feedback.class);
                startActivity(i);
            }
        });


        AdRequest adRequest=new AdRequest.Builder().build();


        ads_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InterstitialAd.load(MenuActivity.this, getString(R.string.Interstitial_AdOne_unit_id), adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);
                        Log.e("Error",loadAdError.toString());
                    }

                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        super.onAdLoaded(interstitialAd);

                        mInterstitialAd = interstitialAd;

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdClicked() {
                                super.onAdClicked();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);
                            }

                            @Override
                            public void onAdImpression() {
                                super.onAdImpression();
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();

                                mInterstitialAd= null;
                            }
                        });

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                if (mInterstitialAd!= null) {
                                    mInterstitialAd.show(MenuActivity.this);
                                }
                                else {
                                    Log.e("AdPending","Ad is not ready yet!");

                                }

                            }
                        },10000 );

                    }
                });


               /* Intent ads = new Intent(MenuActivity.this, AdsActivity.class);
                startActivity(ads);*/
            }
        });

        shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShareApp(MenuActivity.this);

            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MenuActivity.this, AboutUs.class);
                startActivity(i);
            }
        });

        rate_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  Intent i = new Intent(MenuActivity.this, RatingActivity.class);
                startActivity(i);*/

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androidappdevelopment.learnandroidstudio"));
                startActivity(i);

            }
        });

        /*mode_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNightModeOn) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    isNightModeOn = false;


                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    isNightModeOn = true;
                }

            }
        });*/

        if (saveState.getState() == true) {
            mode_dark.setChecked(true);
        }
        mode_dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    saveState.setState(true);
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Intent i = new Intent(MenuActivity.this, MainActivity.class);
                    startActivity(i);
//                    mContext.btnMenu.setImageDrawable(getResources().getDrawable(R.drawable.menu_dark));

                } else {
                    saveState.setState(false);
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Intent i = new Intent(MenuActivity.this, MainActivity.class);
                    startActivity(i);

                }
            }
        });

        /*mode_dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode_dark.isChecked())
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                }
            }
        });*/
    }

    private void ShareApp(Context context){
        final String appPakageName = context.getPackageName();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Now : https://play.google.com/store/apps/details?id=" + appPakageName);
        sendIntent.setType("text/plain");
        context.startActivity(sendIntent);
    }

}

 // Dark mode==========================================================================================================

      /*  saveState = new SaveState(this);
        if (saveState.getState()==true) {
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
*/

/*
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            isNightModeOn = false;

        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            isNightModeOn = true;
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }*/


        /*mode_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNightModeOn) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    isNightModeOn = false;


                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    isNightModeOn = true;
                }

            }
        });*/



/// for dakr mode=========================================================================================

        /*if (saveState.getState()==true) {
            mode_dark.setChecked(true);
        }*/


/*
        mode_dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    saveState.setState(true);
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Intent i= new Intent(MenuActivity.this,MainActivity.class);
                    startActivity(i);
//                    mContext.btnMenu.setImageDrawable(getResources().getDrawable(R.drawable.menu_dark));

                }
                else{
                    saveState.setState(false);
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Intent i= new Intent(MenuActivity.this,MainActivity.class);
                    startActivity(i);

                }
            }
        });
*/

        /*mode_dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode_dark.isChecked())
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                }
            }
        });*/
