package com.example.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.androidpoint.Fragment.Advance;
import com.example.androidpoint.Fragment.Basic;
import com.example.androidpoint.Fragment.Learn;
import com.example.androidpoint.R;
import com.google.android.material.tabs.TabLayout;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TabLayout included;
    FrameLayout frameLayout;

    Fragment fragment = null;
    public FragmentManager fragmentManager = getSupportFragmentManager();

    ImageView btnMenu;

    private MainActivity mcontext;

    FragmentTransaction fragmentTransaction;

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

    /*    int width = (int) (getResources().getDisplayMetrics().widthPixels * (0.85));
        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams)
                lvLeftSide.getLayoutParams();
        params.width = width;
        lvLeftSide.setLayoutParams(params);*/

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,MenuActivity.class);
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

        switch (view.getId())
        {
          /*  case R.id.btn_menu:
                Intent i= new Intent(MainActivity.this,MenuActivity.class);
                startActivity(i);*/



        }
    }
}