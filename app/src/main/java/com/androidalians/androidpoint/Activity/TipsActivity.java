package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.androidalians.androidpoint.R;

public class TipsActivity extends AppCompatActivity {

    AppCompatImageView tips_back_arrow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        tips_back_arrow = findViewById(R.id.tips_back_arrow);

        tips_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}