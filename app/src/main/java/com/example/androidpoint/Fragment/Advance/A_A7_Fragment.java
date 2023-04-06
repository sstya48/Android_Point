package com.example.androidpoint.Fragment.Advance;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidpoint.R;


public class A_A7_Fragment extends Fragment {

    Button b1;
    ProgressDialog progress;

    AppCompatImageView Btn_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_a__a7_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_7_Fragment A_card_7_Fragment = new A_card_7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_7_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

            b1 = view.findViewById(R.id.button2);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    progress = new ProgressDialog(getContext());
                    progress.setMessage("Downloading Music");
                    progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    progress.setIndeterminate(true);
                    progress.setProgress(0);
                    progress.show();

                    final int totalProgressTime = 100;
                    final Thread t = new Thread() {
                        @Override
                        public void run() {
                            int jumpTime = 0;

                            while (jumpTime < totalProgressTime) {
                                try {
                                    sleep(200);
                                    jumpTime += 5;
                                    progress.setProgress(jumpTime);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }
                        }
                    };
                    t.start();

                }
            });


        return view;
    }
}