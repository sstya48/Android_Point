package com.example.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.androidpoint.R;

public class AboutUs extends AppCompatActivity {

    ImageView insta_btn,youtube_btn, facebook_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        insta_btn = (ImageView) findViewById(R.id.insta_btn);
        youtube_btn = (ImageView) findViewById(R.id.youtube_btn);
        facebook_btn = (ImageView) findViewById(R.id.facebook_btn);

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

        facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/@Androidalians/videos");

            }
        });

    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}