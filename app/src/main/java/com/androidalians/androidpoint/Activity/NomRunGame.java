package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidalians.androidpoint.R;

public class NomRunGame extends AppCompatActivity {

    WebView run_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nom_run_game);

        run_id = findViewById(R.id.run_id);
        run_id.loadUrl("https://games.cdn.famobi.com/html5games/o/om-nom-run/v1140/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=abe80572-560a-444d-baf7-2fa4a7b2c02f&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=357&original_ref=https%3A%2F%2Fhtml5games.com%2F");
        run_id.getSettings().setJavaScriptEnabled(true);
        run_id.setWebViewClient(new WebViewClient());

    }
}