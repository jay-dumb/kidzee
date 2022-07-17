package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Quiz_activity extends AppCompatActivity {

    ImageView ImageViewQ, ImageViewA1, ImageViewA2, ImageViewA3;
    MediaPlayer wrong,success;


    int i = 0;

    private int[] Images = {R.drawable.apple, R.drawable.bird, R.drawable.abc,R.drawable.numbers};
    private int[] NumberImage = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine,R.drawable.ten,R.drawable.twelve,R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen,R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        ImageViewQ = findViewById(R.id.ImageQ);
        ImageViewA1 = findViewById(R.id.ImageA1);
        ImageViewA2 = findViewById(R.id.ImageA2);
        ImageViewA3 = findViewById(R.id.ImageA3);

        wrong = MediaPlayer.create(this,R.raw.wrong_answer);
        success = MediaPlayer.create(this,R.raw.success);





        if (i <= 0) {

            ImageViewQ.setImageResource(Images[0]);
            ImageViewA1.setImageResource(NumberImage[0]);
            ImageViewA2.setImageResource(NumberImage[1]);
            ImageViewA3.setImageResource(NumberImage[2]);


            ImageViewA1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    ImageViewQ.setImageResource(Images[3]);
                    ImageViewA1.setImageResource(NumberImage[3]);
                    ImageViewA2.setImageResource(NumberImage[4]);
                    ImageViewA3.setImageResource(NumberImage[2]);

                    success.start();


                    i = i + 1;


                    if (i == 1) {

                        ImageViewA1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                YoYo.with(Techniques.Shake  )
                                        .duration(700)
                                        .repeat(3)
                                        .playOn(findViewById(R.id.ImageA1));

                                Toast.makeText(Quiz_activity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong.start();




                            }
                        });

                        ImageViewA2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(Quiz_activity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                                wrong.start();
                                YoYo.with(Techniques.Shake  )
                                        .duration(700)
                                        .repeat(3)
                                        .playOn(findViewById(R.id.ImageA2));
                            }
                        });

                        ImageViewA3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {



                                ImageViewQ.setImageResource(Images[1]);
                                ImageViewA1.setImageResource(NumberImage[12]);
                                ImageViewA2.setImageResource(NumberImage[13]);
                                ImageViewA3.setImageResource(NumberImage[15]);
                                success.start();

                                i = i + 1;
                                ImageViewA1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        success.start();
                                        Toast.makeText(Quiz_activity.this, "correct", Toast.LENGTH_SHORT).show();
                                    }
                                });

                            }
                        });


                    }


                }
            });

            ImageViewA2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Quiz_activity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    wrong.start();

                }
            });

            ImageViewA3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Quiz_activity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    wrong.start();

                }
            });


        }


    }
}