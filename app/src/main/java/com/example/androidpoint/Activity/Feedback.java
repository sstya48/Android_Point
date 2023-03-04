package com.example.androidpoint.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpoint.R;
import com.example.androidpoint.databinding.ActivityFeedbackBinding;

public class Feedback extends AppCompatActivity {

    ActivityFeedbackBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        binding = ActivityFeedbackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView

        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = binding.email.getText().toString();
                //String subject = binding.subject.getText().toString();
                String message = binding.message.getText().toString();

            }
        });

    }
}