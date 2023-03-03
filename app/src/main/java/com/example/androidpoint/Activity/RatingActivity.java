package com.example.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.example.androidpoint.R;

public class RatingActivity extends AppCompatActivity {

    private float userRate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        final AppCompatButton rateNewBtn = findViewById(R.id.rateNewBtn);
        final AppCompatButton leterBtn = findViewById(R.id.leterBtn);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        final ImageView ratingImage = findViewById(R.id.ratingImage);

        rateNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        leterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Binder();
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {


                if (rating <= 1){
                    ratingImage.setImageResource(R.drawable.one_star);
                } else if (rating <= 2) {
                    ratingImage.setImageResource(R.drawable.two_star);
                }
                else if (rating <= 3) {
                    ratingImage.setImageResource(R.drawable.three_star);
                }
                else if (rating <= 4) {
                    ratingImage.setImageResource(R.drawable.four_star);
                }
                else if (rating <= 5) {
                    ratingImage.setImageResource(R.drawable.five_star);
                }

          //  animateImage(ratingImage);

                userRate = rating;
            }
        });
    }

//    private void Binder() {
//    }
//
//    private void animateImage(ImageView ratingImage){
//
//        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1f, Animation.RELATIVE_TO_SELF,
//                0.5f );
//
//        scaleAnimation.setFillAfter(true);
//        scaleAnimation.setDuration(200);
//        ratingImage.setAnimation(scaleAnimation);
//
//    }
}