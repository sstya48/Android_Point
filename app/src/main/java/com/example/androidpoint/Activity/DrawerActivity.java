package com.example.androidpoint.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidpoint.BuildConfig;
import com.example.androidpoint.R;
import com.example.androidpoint.SaveState;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class DrawerActivity extends AppCompatActivity {

    LinearLayout shareapp, tips, feedback, rate_us, about_us, ads_show, game;

    FrameLayout frameLayout;
    ImageView back_menu;

    MainActivity mContext;
    Fragment fragment = null;
    //Switch mode_dark;
    LinearLayout youtube_link;
    ImageView light;


    AppCompatImageView close_menu;
    //dark mode
    boolean isNightModeOn;
    SaveState saveState;

    TextView version1, version2;

    InterstitialAd mInterstitialAd;


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveState = new SaveState(this);
        if (saveState.getState() == true) {
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        setContentView(R.layout.activity_drawer);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

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

        //mode_dark = findViewById(R.id.mode_dark);
        youtube_link = findViewById(R.id.youtube_link);
        light = findViewById(R.id.light);
        close_menu = findViewById(R.id.close_menu);
        back_menu = findViewById(R.id.back_menu);

        shareapp = (LinearLayout) findViewById(R.id.shareapp);
        feedback = (LinearLayout) findViewById(R.id.feedback);
        tips = (LinearLayout) findViewById(R.id.tips);
        ads_show = (LinearLayout) findViewById(R.id.ads_show);
        game = (LinearLayout) findViewById(R.id.game);


//getversion=========================================================================================

        version1 = findViewById(R.id.version1);
        version1.setText("Version : " + BuildConfig.VERSION_NAME);

        version2 = findViewById(R.id.version2);
        version2.setText("Version : " + BuildConfig.VERSION_NAME);
//=======================================================================================================

        youtube_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@Androidalians"));
                startActivity(i);
            }
        });

        back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tips = new Intent(DrawerActivity.this, MainActivity.class);
                startActivity(tips);
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tips = new Intent(DrawerActivity.this, TipsActivity.class);
                startActivity(tips);
            }
        });

        close_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(DrawerActivity.this, Feedback.class);
                startActivity(i);
            }
        });


        AdRequest adRequest = new AdRequest.Builder().build();


        ads_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InterstitialAd.load(DrawerActivity.this, getString(R.string.Interstitial_AdOne_unit_id), adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);
                        Log.e("Error", loadAdError.toString());
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

                                mInterstitialAd = null;
                            }
                        });

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(DrawerActivity.this);
                                } else {
                                    Log.e("AdPending", "Ad is not ready yet!");

                                }

                            }
                        }, 10000);

                    }
                });


               /* Intent ads = new Intent(MenuActivity.this, AdsActivity.class);
                startActivity(ads);*/
            }
        });

        shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShareApp(DrawerActivity.this);

            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DrawerActivity.this, AboutUs.class);
                startActivity(i);

            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DrawerActivity.this, Game.class);
                startActivity(i);

            }
        });
        rate_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  Intent i = new Intent(MenuActivity.this, RatingActivity.class);
                startActivity(i);*/

//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androidappdevelopment.learnandroidstudio"));

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.example.androidpoint"));
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


        //dark mode===========================================================================================

    /*    if (saveState.getState() == true) {
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
        });*/


        //======================================================================

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

    private void ShareApp(Context context) {
        final String appPakageName = context.getPackageName();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Now : https://play.google.com/store/apps/details?id=" + appPakageName);
        sendIntent.setType("text/plain");
        context.startActivity(sendIntent);
    }


/*
    // Notifiction ----------------------------------------------------------
    Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.appicn,null);
    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
    Bitmap LargeIcon = bitmapDrawable.getBitmap();
    NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    Notification notification;

    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(LargeIcon)
                    .setSmallIcon(R.drawable.appicn)
                    .setContentTitle("Android Point")
                    .setSubText("Basic code in Android Studio")
                    .setChannelId(CHANNEL_ID) // Aa che a version 8  mthi aai ti eeni pel nati atle teni mate uper if confition che & niche else mukyu che jema version 8 niche vala mate e condition lagse.
                    .build();
        }
        // nm valu niche che e orio vala version ma use thay che.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "new channel", NotificationManager.IMPORTANCE_HIGH));
        }
        else {
            notification = new Notification.Builder(this)
                    .setLargeIcon(LargeIcon)
                    .setSmallIcon(R.drawable.appicn)
                    .setContentTitle("Android Point")
                    .setSubText("Basic code in Android Studio")
                    .build();
        }
        nm.notify(NOTIFICATION_ID,notification);
    }

*/

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
