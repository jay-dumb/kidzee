package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LearnShapeActivity extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shape);


        back = findViewById(R.id.LearnShapeBack);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LearnShapeActivity.super.onBackPressed();
            }
        });
    }
}