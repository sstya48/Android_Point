package com.example.androidpoint.Fragment.Advance;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;

import java.io.IOException;

public class A_A20_Fragment extends Fragment implements SurfaceHolder.Callback {

    AppCompatImageView Btn_arrow;

    Button onBtn, offBtn;
    Camera camera;
    android.hardware.Camera.Parameters parameters;
    private boolean lightIsOn = false;

    @Override
    public void onStart() {
        super.onStart();
        SurfaceView preview = (SurfaceView) getView().findViewById(R.id.PREVIEW);
        SurfaceHolder mHolder = preview.getHolder();
        mHolder.addCallback(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        turnOffLight();
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a20_, container, false);


        offBtn = view.findViewById(R.id.offBtn);
        onBtn = view.findViewById(R.id.onBtn);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_20_Fragment A_card_20_Fragment = new A_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_20_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA,}, PackageManager.PERMISSION_GRANTED);
        }
        if (!getActivity().getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            Toast.makeText(getActivity(), "Device has no flashlight", Toast.LENGTH_SHORT).show();
        }


        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnOnLight();
            }
        });
        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnOffLight();
            }
        });


        return view;
    }

    private void turnOnLight() {
        if (!lightIsOn) {
            if (camera == null || parameters == null) {
                return;
            }
            parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(parameters);
            camera.startPreview();
            lightIsOn = true;
        }
    }

    private void turnOffLight() {

        if (lightIsOn) {
            if (camera == null || parameters == null) {
                return;
            }

            parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            camera.setParameters(parameters);
            camera.stopPreview();
            lightIsOn = false;
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        if (camera != null) {
            camera.stopPreview();
            camera.setPreviewCallback(null);
            camera.release();
            camera = null;
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        if (camera == null) {
            camera = Camera.open();
            parameters = camera.getParameters();
            try {
                camera.setPreviewDisplay(holder);
            } catch (IOException e) {
                camera.release();
                camera = null;
            }
        }
    }
}