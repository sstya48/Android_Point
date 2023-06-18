package com.androidalians.androidpoint;

import static android.content.Context.VIBRATOR_SERVICE;

import android.os.Vibrator;

import com.androidalians.androidpoint.DemoFragments.VibratePhoneDemo;


public class VibrateService extends VibratePhoneDemo {

    public static void vibrate(VibratePhoneDemo fragment) {

        Vibrator vibrator = (Vibrator) fragment.getContext().getSystemService(VIBRATOR_SERVICE);   // have fari object banse
        vibrator.vibrate(50);
    }
}