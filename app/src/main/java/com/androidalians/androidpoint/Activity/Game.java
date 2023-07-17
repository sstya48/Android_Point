package com.androidalians.androidpoint.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidalians.androidpoint.R;

public class Game extends AppCompatActivity {
    AppCompatImageView feed_back_arrow;
    CardView game1, game2, game3, game4, game5, game6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        feed_back_arrow = findViewById(R.id.feed_back_arrow);
        game1 = findViewById(R.id.game1);
        game2 = findViewById(R.id.game2);
        game3 = findViewById(R.id.game3);
        game4 = findViewById(R.id.game4);
        game5 = findViewById(R.id.game5);
        game6 = findViewById(R.id.game6);

        feed_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Game.this, MainActivity.class);
                startActivity(intent);
            }
        });
        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Game.this, LudoGame.class);
                startActivity(intent);
            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Game.this, TicTocTic.class);
                startActivity(intent);
            }
        });

        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chess = new Intent(Game.this, ChessGame.class);
                startActivity(chess);
            }
        });


        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ballpool = new Intent(Game.this, BallPoolGame.class);
                startActivity(ballpool);
            }
        });

        game5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arcy = new Intent(Game.this, ArcheryGame.class);
                startActivity(arcy);
            }
        });
        game6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent run = new Intent(Game.this, NomRunGame.class);
                startActivity(run);
            }
        });
    }
}