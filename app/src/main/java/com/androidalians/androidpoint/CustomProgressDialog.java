package com.androidalians.androidpoint;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;


public class CustomProgressDialog extends Dialog {

            public CustomProgressDialog(@NonNull Context context) {
                super(context);
                WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
                layoutParams.gravity = Gravity.CENTER;
                getWindow().setAttributes(layoutParams);
                getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                View view = LayoutInflater.from(context).inflate(R.layout.activity_custom_progress_dialog, null);
                ImageView imageView = view.findViewById(R.id.ivProgress);
                imageView.setBackgroundResource(R.color.trans);

                Glide.with(context)
                        .load(R.drawable.progress_logo)
                        .into(imageView);
                setContentView(view);

        }

}