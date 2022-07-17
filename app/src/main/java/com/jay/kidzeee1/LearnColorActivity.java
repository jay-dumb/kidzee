package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class LearnColorActivity extends AppCompatActivity {

    ImageView Back,red,blue,yellow,purple,black,white,orange,pink;
    MediaPlayer ColorRed,ColorBlue,ColorYellow,ColorPurple,ColorBlack,ColorWhite,ColorOrange,ColorPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_color);


        Back = findViewById(R.id.LearnColorBack);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        yellow = findViewById(R.id.yellow);
        purple = findViewById(R.id.purple);
        black = findViewById(R.id.black);
        white = findViewById(R.id.white);
        orange = findViewById(R.id.orange);
        pink = findViewById(R.id.pink);


        ColorRed = MediaPlayer.create(this,R.raw.red);
        ColorBlue = MediaPlayer.create(this,R.raw.blue);
        ColorYellow = MediaPlayer.create(this,R.raw.yellow);
        ColorPurple = MediaPlayer.create(this,R.raw.purple);
        ColorBlack = MediaPlayer.create(this,R.raw.black);
        ColorWhite = MediaPlayer.create(this,R.raw.white);
        ColorOrange = MediaPlayer.create(this,R.raw.orange);
        ColorPink = MediaPlayer.create(this,R.raw.pink);



        



        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LearnColorActivity.super.onBackPressed();

            }
        });
        
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ColorRed.start();
            }
        });
        
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ColorBlue.start();
            }
        });
        
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ColorYellow.start();
            }
        });
        
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPurple.start();
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorBlack.start();
            }
        });
        
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorWhite.start();
            }
        });
        
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ColorOrange.start();
            }
        });
        
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ColorPink.start();
            }
        });




    }
}