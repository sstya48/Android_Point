package com.example.androidpoint.Activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidpoint.CustomProgressDialog;
import com.example.androidpoint.Fragment.Advance.Advance;
import com.example.androidpoint.Fragment.Basic.Basic;
import com.example.androidpoint.Fragment.Learn.Learn;
import com.example.androidpoint.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.tabs.TabLayout;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TabLayout included;
    FrameLayout frameLayout;
    Fragment fragment = null;
    public FragmentManager fragmentManager = getSupportFragmentManager();
    ImageView btnMenu;
    AdView adView_main_all;

    FragmentTransaction fragmentTransaction;

    boolean isPressed =  false;

   /* boolean doubleBackToExitPressedOnce = false;

    private static final long delay = 2000L;
    private boolean mRecentlyBackPressed = false;
    private Handler mExitHandler = new Handler();
    private Runnable mExitRunnable = new Runnable() {

        @Override
        public void run() {
            mRecentlyBackPressed=false;
        }
    };*/


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        included = (TabLayout) findViewById(R.id.included);
        frameLayout = (FrameLayout) findViewById(R.id.frame_container);

        btnMenu = findViewById(R.id.btn_menu);

        fragment = new Basic();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        //Banner Ad id====================================
        adView_main_all = findViewById(R.id.adView_main_all);

        //====================================================
        MobileAds.initialize(this);

        AdRequest adRequest = new AdRequest.Builder().build();

        //banner ad load
        adView_main_all.loadAd(adRequest);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DrawerActivity.class);
                startActivity(i);
            }
        });
        included.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new Basic();
                        break;
                    case 1:
                        fragment = new Advance();
                        break;
                    case 2:
                        fragment = new Learn();
                        break;

                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_container, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
          /*  case R.id.btn_menu:
                Intent i= new Intent(MainActivity.this,MenuActivity.class);
                startActivity(i);*/
        }
    }
    @Override
    public void onBackPressed() {

        if (isPressed){
            finishAffinity();

            System.exit(0);
        }
        else {
            Toast.makeText(getApplicationContext(), "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

            isPressed = true;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                isPressed = false;
            }
        };
        new Handler().postDelayed(runnable,2000);

      /*  if (mRecentlyBackPressed) {
            mExitHandler.removeCallbacks(mExitRunnable);
            mExitHandler = null;
            super.onBackPressed();
        }
        else
        {
            mRecentlyBackPressed = true;
            Toast.makeText(this, "press again to exit", Toast.LENGTH_SHORT).show();
            mExitHandler.postDelayed(mExitRunnable, delay);
        }*/

       /* if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_LONG).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);


  //Alret Dialog=======================================================================

*/
       /* new AlertDialog.Builder(this)
                .setIcon(R.drawable.applogo)
                .setTitle("Closing Android Point")
                .setMessage("Are you sure you want to close this Android Point?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();*/
    }

}