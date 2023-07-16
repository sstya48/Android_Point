package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidalians.androidpoint.R;

public class BallPoolGame extends AppCompatActivity {

    WebView ball_pool_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_pool_game);

        ball_pool_id = findViewById(R.id.ball_pool_id);
        ball_pool_id.loadUrl("https://games.cdn.famobi.com/html5games/0/8-ball-billiards-classic/v240/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=82038e98-d4e1-46dd-8de9-1460d1395eab&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=358&original_ref=https%3A%2F%2Fhtml5games.com%2F");
        ball_pool_id.getSettings().setJavaScriptEnabled(true);
        ball_pool_id.setWebViewClient(new WebViewClient());
    }
}