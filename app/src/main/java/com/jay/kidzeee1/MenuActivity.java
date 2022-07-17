package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {


    CardView Numbers,Abc,Quiz,Pair,colors,shapes,animals;
    MediaPlayer hope;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Numbers = findViewById(R.id.cardViewNumbers);
        Abc = findViewById(R.id.cardViewAbc);
        Quiz = findViewById(R.id.cardViewQuiz);
        Pair = findViewById(R.id.cardViewPair);
        colors = findViewById(R.id.cardViewColor);
        shapes = findViewById(R.id.cardViewShape);
        animals = findViewById(R.id.cardViewAnimals);

        hope = MediaPlayer.create(this , R.raw.hope);


        hope.start();



        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MenuActivity.this, LearnNumber.class));

                hope.stop();
            }
        });
        
        Abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LearnAbc.class));

                hope.stop();
            }
        });
        
        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MenuActivity.this, Quiz_activity.class));

                hope.stop();

            }
        });
        
        Pair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "PAir", Toast.LENGTH_SHORT).show();
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MenuActivity.this, LearnColorActivity.class));

                hope.stop();

            }
        });

        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LearnShapeActivity.class));

                hope.stop();

            }
        });

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MenuActivity.this, Animals_Activity.class));

                hope.stop();

            }
        });




    }

    @Override
    protected void onPause() {
        super.onPause();

        hope.stop();
    }
}