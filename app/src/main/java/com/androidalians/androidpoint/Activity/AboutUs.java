package com.androidalians.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.androidalians.androidpoint.BuildConfig;
import com.androidalians.androidpoint.R;

public class AboutUs extends AppCompatActivity {

    ImageView insta_btn, youtube_btn, apoint_link, lenuguage_link, recipe_link;
    AppCompatImageView aboutus_back_arrow;
    TextView version_tv, more_app ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        version_tv = findViewById(R.id.version_tv);
        more_app = findViewById(R.id.more_app);
        insta_btn = findViewById(R.id.insta_btn);
        recipe_link = findViewById(R.id.recipe_link);
        lenuguage_link = findViewById(R.id.lenuguage_link);
        apoint_link = findViewById(R.id.apoint_link);
        youtube_btn = findViewById(R.id.youtube_btn);
        aboutus_back_arrow = findViewById(R.id.aboutus_back_arrow);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        more_app.startAnimation(animation);

        aboutus_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, MainActivity.class);
                startActivity(intent);
            }
        });

        version_tv.setText(BuildConfig.VERSION_NAME);


        insta_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/android_alians/");
            }
        });

        youtube_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/@Androidalians/videos");
            }
        });

        apoint_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=com.androidalians.androidpoint&hl=en_IN");
            }
        });

        lenuguage_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=com.androidalians.languagetranslator&hl=en_IN");
            }
        });

        recipe_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=com.urva.gujaratirecipes&hl=en&gl=US");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}