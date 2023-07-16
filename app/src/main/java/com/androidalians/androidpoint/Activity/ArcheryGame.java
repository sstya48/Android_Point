package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidalians.androidpoint.R;

public class ArcheryGame extends AppCompatActivity {

    WebView archery_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archery_game);

        archery_id = findViewById(R.id.archery_id);
        archery_id.loadUrl("https://games.cdn.famobi.com/html5games/a/archery-world-tour/v460/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ebcb987a-3fd0-4b4a-bae6-f456fff9cac3&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=357&original_ref=https%3A%2F%2Fhtml5games.com%2F");
        archery_id.getSettings().setJavaScriptEnabled(true);
        archery_id.setWebViewClient(new WebViewClient());
    }
}