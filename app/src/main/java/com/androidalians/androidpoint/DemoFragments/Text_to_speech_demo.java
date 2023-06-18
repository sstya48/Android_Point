package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.androidalians.androidpoint.Fragment.Basic.B_card_17_Fragment;
import com.androidalians.androidpoint.R;

import java.util.Locale;


public class Text_to_speech_demo extends Fragment {
    EditText Text;
    Button btnText;
    TextToSpeech textToSpeech;

    AppCompatImageView Text_arrow_demo;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text_to_speech_demo, container, false);

        Text = view.findViewById(R.id.Text);
        btnText = view.findViewById(R.id.btnText);
        Text_arrow_demo = view.findViewById(R.id.Text_arrow_demo);
        textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!=TextToSpeech.ERROR){
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(Text.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        Text_arrow_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_17_Fragment ExplicitIntent= new B_card_17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });
        return view;
    }
}