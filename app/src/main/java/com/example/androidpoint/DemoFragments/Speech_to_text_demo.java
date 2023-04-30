package com.example.androidpoint.DemoFragments;

import static android.app.Activity.RESULT_OK;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidpoint.Fragment.Basic.B_card_17_Fragment;
import com.example.androidpoint.Fragment.Basic.B_card_18_Fragment;
import com.example.androidpoint.R;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Speech_to_text_demo extends Fragment {

     ImageView iv_mic;
     TextView tv_Speech_to_text;
     static final int REQUEST_CODE_SPEECH_INPUT = 1;

    AppCompatImageView speech_code_arrow;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_speech_to_text_demo, container, false);

        iv_mic = view.findViewById(R.id.iv_mic);
        tv_Speech_to_text = view.findViewById(R.id.tv_speech_to_text);
        speech_code_arrow = view.findViewById(R.id.speech_code_arrow);

        speech_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_18_Fragment ExplicitIntent= new B_card_18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });

        iv_mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent
                        = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,
                        Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak to text");

                try {
                    startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
                }
                catch (Exception e) {
                    Toast
                            .makeText(getContext(), " " + e.getMessage(),
                                    Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SPEECH_INPUT) {
            if (resultCode == RESULT_OK && data != null) {
                ArrayList<String> result = data.getStringArrayListExtra(
                        RecognizerIntent.EXTRA_RESULTS);
                tv_Speech_to_text.setText(
                        Objects.requireNonNull(result).get(0));

            }
        }
    }
}


