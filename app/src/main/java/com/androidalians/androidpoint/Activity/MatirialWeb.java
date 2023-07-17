package com.androidalians.androidpoint.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.androidalians.androidpoint.R;

import java.util.Timer;
import java.util.TimerTask;

public class MatirialWeb extends AppCompatActivity {
    WebView matirial;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matirial_web);


        matirial = findViewById(R.id.matirial);
        matirial.loadUrl("https://sites.google.com/view/alians940");
        matirial.getSettings().setJavaScriptEnabled(true);
        matirial.setWebViewClient(new WebViewClient());

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MatirialWeb.this, DrawerActivity.class);
                startActivity(intent);
            }
        }, 600000);

    }
}