package com.androidalians.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.Fragment.Basic.Basic;
import com.androidalians.androidpoint.Fragment.Learn.Learn;
import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public FragmentManager fragmentManager = getSupportFragmentManager();
    TabLayout included;
    FrameLayout frameLayout;
    Fragment fragment = null;
    ImageView btnMenu;
//    AdView adView_main_all;

    FragmentTransaction fragmentTransaction;

    boolean isPressed = false;

    private int backPressCount = 0;

    private RewardedAd rewardedAd;
    private boolean isRewardedAdLoaded = false;

    private Handler adHandler;
    private int adCount = 0;
    private boolean isAppRunning;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Video Ad Implement==========================================================================================

        // Initialize AdMob
        MobileAds.initialize(this, initializationStatus -> {
            loadRewardedAd();
        });

        // Set isAppRunning to true when the app is open
        isAppRunning = true;


        // Load the rewarded ad
//        loadRewardedAd();

        // Check if it's the first app launch
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstLaunch = preferences.getBoolean("isFirstLaunch", true);

        if (isFirstLaunch) {
            // Show rewarded ad once within 10 seconds
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    showRewardedAdIfNeeded();
                }
            }, 10000); // 10 seconds

            // Set isFirstLaunch to false
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("isFirstLaunch", false);
            editor.apply();
        }

        // Set up the ad handler to trigger ad automatically every 20 minutes (1 time)

        if (isAppRunning) {
            adHandler = new Handler();
            adHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    showRewardedAdIfNeeded();
                }
            }, 5 * 60 * 1000);
        }
        // 5 minutes in milliseconds

//complete ad implement=====================================================================================


        included = (TabLayout) findViewById(R.id.included);
        frameLayout = (FrameLayout) findViewById(R.id.frame_container);

        btnMenu = findViewById(R.id.btn_menu);

        fragment = new Basic();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DrawerActivity.class);
                startActivity(i);
            }
        });
        included.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new Basic();
                        break;
                    case 1:
                        fragment = new Advance();
                        break;
                    case 2:
                        fragment = new Learn();
                        break;

                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_container, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void showRewardedAdIfNeeded() {
        if (adCount < 1) {
            if (isRewardedAdLoaded) {
                rewardedAd.show(MainActivity.this, new OnUserEarnedRewardListener() {
                    @Override
                    public void onUserEarnedReward(RewardItem rewardItem) {
                        // User earned reward callback
                        // Handle the reward given to the user
                    }
                });

                rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Ad dismissed callback
                        loadRewardedAd(); // Load the next rewarded ad
                        adCount++;

                        // Schedule the next ad to show after an hour
                        adHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                showRewardedAdIfNeeded();
                            }
                        }, 5 * 60 * 1000); // 1 hour in milliseconds
//                        }, 3600000); // 1 hour in milliseconds
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Ad failed to show full-screen content
                        // Load the next rewarded ad and show it if needed
                        loadRewardedAd();
                        adCount = 0;
                    }
                });
                adCount++; // Increment the ad count when the ad is shown
            } else {
                // If the rewarded ad is not loaded, try again after a short delay
                adHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showRewardedAdIfNeeded();
                    }
                }, 5000); // 5 seconds delay before trying again
            }
        }
    }


    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917", adRequest, new RewardedAdLoadCallback() {
            @Override
            public void onAdLoaded(RewardedAd ad) {
                super.onAdLoaded(ad);
                // Rewarded ad loaded callback
                rewardedAd = ad;
                isRewardedAdLoaded = true;
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                // Rewarded ad failed to load callback
                rewardedAd = null;
                Log.d("AdError", adError.getMessage());
                isRewardedAdLoaded = false;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // App is in foreground, set isAppRunning to true
        isAppRunning = true;
        // Start the ad countdown
        if (adHandler == null) {
            adHandler = new Handler();
            showRewardedAdIfNeeded();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // App is in background, set isAppRunning to false and remove ad callbacks
        isAppRunning = false;
        if (adHandler != null) {
            adHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove any pending callbacks to prevent memory leaks
        if (adHandler != null) {
            adHandler.removeCallbacksAndMessages(null);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
    }

    @Override
    public void onBackPressed() {
        backPressCount++;

        if (backPressCount == 2) {
            // Show the custom alert dialog on the second back press
            showExitConfirmationDialog();
        } else if (backPressCount == 1) {
            // Show a toast or any other feedback to indicate that another back press will exit the app
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();

            // Reset the back press count after a certain delay (e.g., 2 seconds)
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    backPressCount = 0;
                }
            }, 2000); // Delay in milliseconds (2 seconds)
        } else {
            // If the user presses the back button multiple times quickly, reset the count
            backPressCount = 0;
        }
    }

    private void showExitConfirmationDialog() {
        // Create the custom dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Inflate the custom layout for the dialog
        View dialog = getLayoutInflater().inflate(R.layout.fragment_a__a4_1_, null);
        builder.setView(dialog);
        Button btn_no = dialog.findViewById(R.id.btn_no);
        Button btn_yes = dialog.findViewById(R.id.btn_yes);

        final AlertDialog alertDialog = builder.create();
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPressCount = 1;
                alertDialog.dismiss();
            }
        });
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}