package com.example.androidpoint;

import static android.content.Context.VIBRATOR_SERVICE;

import android.content.Context;
import android.os.Vibrator;

import com.example.androidpoint.DemoFragments.VibratePhoneDemo;


public class VibrateService extends VibratePhoneDemo {

    public static void vibrate(VibratePhoneDemo fragment) {

        Vibrator vibrator = (Vibrator) fragment.getContext().getSystemService(VIBRATOR_SERVICE);   // have fari object banse
        vibrator.vibrate(50);
    }
}