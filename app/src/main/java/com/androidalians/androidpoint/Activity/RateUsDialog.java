package com.androidalians.androidpoint.Activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.androidalians.androidpoint.R;


public class RateUsDialog extends Dialog {
    public RateUsDialog(@NonNull Context context) {
        super(context);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rate_us_dialog);
    }
}
