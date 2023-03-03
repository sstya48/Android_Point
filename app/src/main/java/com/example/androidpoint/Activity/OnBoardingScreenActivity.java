package com.example.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidpoint.Adapter.ViewPagerAdapter;
import com.example.androidpoint.R;

public class OnBoardingScreenActivity extends AppCompatActivity {

    ViewPager mslideviewPager;

    LinearLayout mDotLayout;
    Button backbtn, nextbtn, skipbtn;

    ImageView img_btn;

    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);


        backbtn = findViewById(R.id.btn_back);
        nextbtn = findViewById(R.id.btn_next);
        skipbtn = findViewById(R.id.skip_btn);
        img_btn = findViewById(R.id.img_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getitem(0) > 0) {
                    mslideviewPager.setCurrentItem(getitem(-1), true);
                }

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getitem(0) < 3)
                    mslideviewPager.setCurrentItem(getitem(1), true);

                else {
                    Intent i = new Intent(OnBoardingScreenActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        });

        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(OnBoardingScreenActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });


        mslideviewPager = (ViewPager) findViewById(R.id.slideViewpage);

        mDotLayout = (LinearLayout) findViewById(R.id.indicator_layout);
        viewPagerAdapter = new ViewPagerAdapter(this);

        mslideviewPager.setAdapter(viewPagerAdapter);

        setUpindicator(0);
        mslideviewPager.addOnPageChangeListener(viewListener);
    }

    public void setUpindicator(int position) {
        dots = new TextView[4];
        mDotLayout.removeAllViews();


        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                dots[i].setTextColor(getResources().getColor(R.color.inactive, getApplicationContext().getTheme()));
            }
            mDotLayout.addView(dots[i]);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            dots[position].setTextColor(getResources().getColor(R.color.active, getApplicationContext().getTheme()));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);

            if (position > 0) {
                backbtn.setVisibility(View.VISIBLE);
                img_btn.setVisibility(View.VISIBLE);

            } else {
                backbtn.setVisibility(View.INVISIBLE);
                img_btn.setVisibility(View.INVISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getitem(int i) {

        return mslideviewPager.getCurrentItem() + i;

    }
}