package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start;
    MediaPlayer Play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Play = MediaPlayer.create(this , R.raw.background);

        Play.start();



        start = findViewById(R.id.startBtn);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));

                Play.stop();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


        Play.start();
    }

    @Override
    protected void onRestart() {
            super.onRestart();

            Play.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Play.stop();
    }
}