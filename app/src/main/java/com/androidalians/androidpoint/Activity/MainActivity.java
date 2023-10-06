package com.androidalians.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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
    FragmentTransaction fragmentTransaction;

    private int backPressCount = 0;

    private RewardedAd rewardedAd;
    private boolean isRewardedAdLoaded = false;
    TextView title_android;
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

        isAppRunning = true;

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

        included = findViewById(R.id.included);
        frameLayout = findViewById(R.id.frame_container);
        btnMenu = findViewById(R.id.btn_menu);
        title_android = findViewById(R.id.title_android);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        title_android.startAnimation(animation);

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
                    }
                });

                rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        loadRewardedAd();
                        adCount++;

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
                        loadRewardedAd();
                        adCount = 0;
                    }
                });
                adCount++; // Increment the ad count when the ad is shown
            } else {
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
        RewardedAd.load(this, "ca-app-pub-3471867131564882/9027730902", adRequest, new RewardedAdLoadCallback() {
            @Override
            public void onAdLoaded(RewardedAd ad) {
                super.onAdLoaded(ad);
                rewardedAd = ad;
                isRewardedAdLoaded = true;
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                rewardedAd = null;
                Log.d("AdError", adError.getMessage());
                isRewardedAdLoaded = false;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        isAppRunning = true;
        if (adHandler == null) {
            adHandler = new Handler();
            showRewardedAdIfNeeded();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        isAppRunning = false;
        if (adHandler != null) {
            adHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (adHandler != null) {
            adHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
    }

   /* @Override
    public void onBackPressed() {
        backPressCount++;

        if (backPressCount == 2) {
            showExitConfirmationDialog();
        } else if (backPressCount == 1) {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    backPressCount = 0;
                }
            }, 2000); // Delay in milliseconds (2 seconds)
        } else {
            backPressCount = 0;
        }
    }*/

    @Override
    public void onBackPressed() {
        backPressCount++;

        if (backPressCount == 2) {
            showExitConfirmationDialog();
        } else if (backPressCount == 1) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
            Toast toast = new Toast(this);
            toast.setGravity(Gravity.BOTTOM, 0, 100);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    backPressCount = 0;
                }
            }, 500);
        } else {
            backPressCount = 0;
        }
    }


    private void showExitConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
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