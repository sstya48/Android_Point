package com.example.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.BuildConfig;
import com.example.androidpoint.R;

public class AboutUs extends AppCompatActivity {

    ImageView insta_btn,youtube_btn, facebook_btn;
    AppCompatImageView aboutus_back_arrow;

    TextView version_tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        version_tv = findViewById(R.id.version_tv);

        insta_btn = findViewById(R.id.insta_btn);
        youtube_btn = findViewById(R.id.youtube_btn);
        // facebook_btn = findViewById(R.id.facebook_btn);
        aboutus_back_arrow = findViewById(R.id.aboutus_back_arrow);

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

     /*   facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/@Androidalians/videos");
            }
        });*/

    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}