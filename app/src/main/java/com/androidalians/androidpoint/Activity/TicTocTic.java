package com.androidalians.androidpoint.Activity;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class TicTocTic extends AppCompatActivity implements View.OnClickListener {

    boolean playerOneActive;
    private TextView playerOneScore, playerTwoScore, playerStatus;
    private Button[] buttons = new Button[9];
    private Button reset, playagain;
    int[] gameState = {2,2,2,2,2,2,2,2,2};
    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6},

            {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
    int rounds;
    AppCompatImageView game_back_arrow;
    private int playerOneScoreCount, playerTwoScoreCount;

    private RewardedAd rewardedAd;
    private boolean isRewardedAdLoaded = false;

    private Handler adHandler;
    private int adCount = 0;

    private int clickCountPlayAgain = 0;
    private int clickCountReset = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_toc_tic);

        playerOneScore = findViewById(R.id.score_Player1);
        playerTwoScore = findViewById(R.id.score_Player2);
        playerStatus = findViewById(R.id.textStatus);
        reset = findViewById(R.id.btn_reset);
        playagain = findViewById(R.id.btn_play_again);
        game_back_arrow = findViewById(R.id.game_back_arrow);


        game_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TicTocTic.this, Game.class);
                startActivity(intent);
            }
        });

        buttons[0] = findViewById(R.id.btn0);
        buttons[1] = findViewById(R.id.btn1);
        buttons[2] = findViewById(R.id.btn2);
        buttons[3] = findViewById(R.id.btn3);
        buttons[4] = findViewById(R.id.btn4);
        buttons[5] = findViewById(R.id.btn5);
        buttons[6] = findViewById(R.id.btn6);
        buttons[7] = findViewById(R.id.btn7);
        buttons[8] = findViewById(R.id.btn8);

        for(int i=0; i<buttons.length; i++)

        {
            buttons[i].setOnClickListener(this);
        }

        playerOneScoreCount = 0;
        playerTwoScoreCount = 0;
        playerOneActive = true;
        rounds = 0;

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
                rewardedAd.show(TicTocTic.this, new OnUserEarnedRewardListener() {
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

    @Override
    public void onClick(View view)
    {
        if(!((Button)view).getText().toString().equals(""))

        {


        }

        else if(checkWinner())
        {
        }

        String buttonID  = view.getResources().getResourceEntryName(view.getId());
        int gameStatePointer = Integer.parseInt(buttonID.substring(buttonID.length()-1,buttonID.length()));


        if(playerOneActive)
        {
            ((Button)view).setText("✖");
            ((Button)view).setTextColor(Color.parseColor("#FF0000"));
            gameState[gameStatePointer] = 0;
        }

        else
        {
            ((Button)view).setText("O");
            ((Button)view).setTextColor(Color.parseColor("#FF58DD5D"));
            gameState[gameStatePointer] = 1;
        }
        rounds++;
        if(checkWinner())
        {
            if(playerOneActive)
            {
                playerOneScoreCount++;
                updatePlayerScore();
                playerStatus.setText("Player-1 has won");
                Toast.makeText(getApplicationContext(),"Player-1 has won",Toast.LENGTH_SHORT).show();
            }else
            {
                playerTwoScoreCount++;
                updatePlayerScore();
                playerStatus.setText("Player-2 has won");
                Toast.makeText(getApplicationContext(),"Player-2 has won",Toast.LENGTH_SHORT).show();

            }

        }

        else if(rounds==9)
        {
            playerStatus.setText("No Winner");
        }
        else
        {
            playerOneActive = !playerOneActive;
        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCountReset++;
                if (clickCountReset >= 5) {
                    clickCountReset = 0;
                    showAds();
                }
                playAgain();
                playerOneScoreCount= 0;
                playerTwoScoreCount= 0;
                updatePlayerScore();
            }
        });

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCountPlayAgain++;
                if (clickCountPlayAgain >= 5) {
                    clickCountPlayAgain = 0;
                    showAds();
                }

                playAgain();
            }
        });
    }

    private void showAds() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        rewardedAd = null;

//                        Toast.makeText(TicTocTic.this, "Failed to Load", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        rewardedAd = ad;

//                        Toast.makeText(TicTocTic.this, "Ad Loaded", Toast.LENGTH_SHORT).show();


                    }
                });

        if (rewardedAd != null) {
            Activity activityContext = TicTocTic.this;
            rewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    Log.d(TAG, "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();
                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }

    }
    private boolean checkWinner()
    {
        boolean winnerResults  = false;
        for (int[] winningPositions: winningPositions)
        {
            if(gameState[winningPositions[0]]==gameState[winningPositions[1]]&&
                    gameState[winningPositions[1]]==gameState[winningPositions[2]] &&
                    gameState[winningPositions[0]]!=2)
            {
                winnerResults = true;
            }
        }
        return winnerResults;
    }

    private void playAgain()
    {
        rounds = 0;
        playerOneActive = true;
        for (int i=0; i<buttons.length; i++)
        {
            gameState[i] = 2;
            buttons[i].setText("");
        }
        playerStatus.setText("Status");
    }
    private void updatePlayerScore()
    {
        playerOneScore.setText(Integer.toString(playerOneScoreCount));
        playerTwoScore.setText(Integer.toString(playerTwoScoreCount));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}