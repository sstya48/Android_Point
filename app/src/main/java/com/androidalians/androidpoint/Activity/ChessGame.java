package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidalians.androidpoint.R;

public class ChessGame extends AppCompatActivity {

    WebView chess_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess_game);

        chess_id = findViewById(R.id.chess_id);
        chess_id.loadUrl("https://games.cdn.famobi.com/html5games/0/3d-chess/v180/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=8e9306bb-99cc-4762-9708-a34d8afa6ae1&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=692&original_ref=https%3A%2F%2Fgames.famobi.com%2F");
        chess_id.getSettings().setJavaScriptEnabled(true);
        chess_id.setWebViewClient(new WebViewClient());
    }
}