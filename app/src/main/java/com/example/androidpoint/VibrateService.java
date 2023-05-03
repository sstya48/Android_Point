package com.example.androidpoint;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;

public class VibrateService extends Service {

    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);

        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long pattern[] = { 0, 800, 200, 1200, 300, 2000, 400, 4000 };
        v.vibrate(pattern, -1);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
}
