package com.androidalians.androidpoint.Activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class BallPoolGame extends AppCompatActivity {

    WebView ball_pool_id;

    private RewardedAd rewardedAd;
    private boolean isRewardedAdLoaded = false;
    private Handler adHandler;
    private int adCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_pool_game);

        ball_pool_id = findViewById(R.id.ball_pool_id);
        ball_pool_id.loadUrl("https://games.cdn.famobi.com/html5games/0/8-ball-billiards-classic/v240/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=82038e98-d4e1-46dd-8de9-1460d1395eab&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=358&original_ref=https%3A%2F%2Fhtml5games.com%2F");
        ball_pool_id.getSettings().setJavaScriptEnabled(true);
        ball_pool_id.setWebViewClient(new WebViewClient());

        // Initialize AdMob
        MobileAds.initialize(this, initializationStatus -> {
        });

        // Load the rewarded ad
        loadRewardedAd();

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

        // Set up the ad handler to trigger ad automatically
        adHandler = new Handler();
        adHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showRewardedAdIfNeeded();
            }
        }, 0);
    }

    private void showRewardedAdIfNeeded() {
        if (adCount < 2) {
            if (isRewardedAdLoaded) {
                rewardedAd.show(BallPoolGame.this, new OnUserEarnedRewardListener() {
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
                        }, 3600000); // 1 hour in milliseconds
                    }
                });
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
                Log.d("AdError", adError.getMessage());
                isRewardedAdLoaded = false;
            }
        });
    }
}