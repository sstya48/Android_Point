package com.androidalians.androidpoint.Activity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

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

import java.util.Timer;
import java.util.TimerTask;

public class MatirialWeb extends AppCompatActivity {
    WebView matirial;
    Timer timer;
    private RewardedAd rewardedAd;
    private boolean isRewardedAdLoaded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matirial_web);

        // Initialize MobileAds (if not done already)
        MobileAds.initialize(this);

        // Load rewarded ad
        loadRewardedAd();

        matirial = findViewById(R.id.matirial);
        matirial.loadUrl("https://sites.google.com/view/alians940");
        matirial.getSettings().setJavaScriptEnabled(true);
        matirial.setWebViewClient(new WebViewClient());

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MatirialWeb.this, DrawerActivity.class);
                startActivity(intent);
            }
        }, 600000);
    }

    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-3471867131564882/1352157532", adRequest, new RewardedAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error.
                Log.d("AdError", loadAdError.getMessage());
                rewardedAd = null;
            }

            @Override
            public void onAdLoaded(@NonNull RewardedAd ad) {
                rewardedAd = ad;
                Log.d("AdInfo", "Ad was loaded.");
                // Now that the ad is loaded, you can show it immediately
                if (rewardedAd != null) {
                    rewardedAd.show(MatirialWeb.this, new OnUserEarnedRewardListener() {
                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                            // User earned reward callback
                            // Handle the reward given to the user
                        }
                    });
                }
            }
        });

    }

    private void showRewardedAd() {
        if (rewardedAd != null) {
            rewardedAd.show(this, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // User earned reward callback
                }
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Show the rewarded ad when the activity resumes
        showRewardedAd();
    }
}