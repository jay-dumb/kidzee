package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView Numbers,Abc,Quiz,Pair,colors,shapes,animals;
    private MediaPlayer hope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        Numbers = findViewById(R.id.cardViewNumbers);
        Abc = findViewById(R.id.cardViewAbc);
        Quiz = findViewById(R.id.cardViewQuiz);
        Pair = findViewById(R.id.cardViewPair);
        colors = findViewById(R.id.cardViewColor);
        shapes = findViewById(R.id.cardViewShape);
        animals = findViewById(R.id.cardViewAnimals);

        Numbers.setOnClickListener(this);
        Abc.setOnClickListener(this);
        Quiz.setOnClickListener(this);
        Pair.setOnClickListener(this);
        colors.setOnClickListener(this);
        shapes.setOnClickListener(this);
        animals.setOnClickListener(this);

    }


    @Override
    protected void onPause() {
        super.onPause();
        hope.stop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        hope = MediaPlayer.create(this , R.raw.hope);
        hope.start();
    }

    @Override
    public void onClick(View view) {
        hope.stop();
        switch (view.getId()){
            case R.id.cardViewNumbers:
                startActivity(new Intent(MenuActivity.this, LearnNumber.class));
                break;
            case R.id.cardViewAbc:
                startActivity(new Intent(MenuActivity.this, LearnAbc.class));
                break;
            case R.id.cardViewQuiz:
                startActivity(new Intent(MenuActivity.this, Quiz_activity.class));
                break;
            case R.id.cardViewPair:
                startActivity(new Intent(MenuActivity.this, PairActivity.class));
                break;
            case R.id.cardViewColor:
                startActivity(new Intent(MenuActivity.this, LearnColorActivity.class));
                break;
            case R.id.cardViewShape:
                startActivity(new Intent(MenuActivity.this, LearnShapeActivity.class));
                break;
            case R.id.cardViewAnimals:
                startActivity(new Intent(MenuActivity.this, Animals_Activity.class));
                break;
            default:
                Toast.makeText(this, "Invalid..", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}