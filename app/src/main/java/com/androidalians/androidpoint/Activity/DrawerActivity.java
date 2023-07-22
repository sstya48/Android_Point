package com.androidalians.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;

import com.androidalians.androidpoint.BuildConfig;
import com.androidalians.androidpoint.R;
import com.androidalians.androidpoint.SaveState;
import com.google.android.gms.ads.AdRequest;

public class DrawerActivity extends AppCompatActivity {

    LinearLayout shareapp, tips, feedback, rate_us, about_us, ads_show, game, matirial;
    ImageView back_menu;
    LinearLayout youtube_link;
    ImageView light;
    AppCompatImageView close_menu;
    SaveState saveState;
    TextView version1, version2;

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
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.skyblue));
        }

        about_us = findViewById(R.id.about_us);
        rate_us = findViewById(R.id.rate_us);
        youtube_link = findViewById(R.id.youtube_link);
        light = findViewById(R.id.light);
        close_menu = findViewById(R.id.close_menu);
        back_menu = findViewById(R.id.back_menu);
        matirial = findViewById(R.id.matirial);
        shareapp = findViewById(R.id.shareapp);
        feedback = findViewById(R.id.feedback);
        tips = findViewById(R.id.tips);
        ads_show = findViewById(R.id.ads_show);
        game = findViewById(R.id.game);


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
        matirial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mati = new Intent(DrawerActivity.this, MatirialWeb.class);
                startActivity(mati);
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
                Intent i = new Intent(DrawerActivity.this, ProjectList.class);
                startActivity(i);
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
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androidalians.androidpoint"));
                startActivity(i);
            }
        });
    }

    private void ShareApp(Context context) {
        final String appPakageName = context.getPackageName();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "For Quick Learn Android App Development From Basic to Advance Download the App And Start Learning... https://play.google.com/store/apps/details?id=" + appPakageName);
        sendIntent.setType("text/plain");
        context.startActivity(sendIntent);
        Log.d("Package name Share App", appPakageName);
    }
}