package com.example.androidpoint.Activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpoint.R;

public class Feedback extends AppCompatActivity {
    EditText feedBack,name;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        feedBack = findViewById(R.id.feedBack);
        name = findViewById(R.id.name);
        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String("vinaykumarmori1511@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT, "Feedback From App");
                i.putExtra(Intent.EXTRA_TEXT, "Name:"+name.getText()+"\n Message:" + feedBack.getText());

                try {
                    startActivity(Intent.createChooser(i, "Please select Email"));
                    }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(Feedback.this, "There are no Email Clients", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}