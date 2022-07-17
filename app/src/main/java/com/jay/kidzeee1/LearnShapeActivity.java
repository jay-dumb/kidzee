package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class LearnShapeActivity extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
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