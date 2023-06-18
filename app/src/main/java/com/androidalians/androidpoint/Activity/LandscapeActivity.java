package com.androidalians.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidalians.androidpoint.DemoFragments.Screen_Orientation_Fragment;
import com.androidalians.androidpoint.R;

public class LandscapeActivity extends AppCompatActivity {

    TextView landscape;

    Button Landscape1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscape);

        landscape= findViewById(R.id.landscape);
        Landscape1= findViewById(R.id.Landscape1);

        Landscape1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Screen_Orientation_Fragment screenpotrait= new Screen_Orientation_Fragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, screenpotrait, "screen Landscape DEMO")
                        .commit();

            }
        });

    }
   /* @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            this.finish();
        } else {
            getFragmentManager().popBackStack();
        }
    }*/
}