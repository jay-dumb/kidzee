package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Animals_Activity extends AppCompatActivity {

    ImageView back, next, ImageAnimals;
    MediaPlayer cow,goat,cat,dog,tiger,horse,lion,rabbit;

    int count = 0;
    private int[] Images = {R.drawable.cow, R.drawable.goat, R.drawable.cat, R.drawable.dog, R.drawable.tiger, R.drawable.horse, R.drawable.lion, R.drawable.rabbit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        back = findViewById(R.id.AnimalsBack);
        next = findViewById(R.id.ImageNext);
        ImageAnimals = findViewById(R.id.ImageAnimals);

        cow = MediaPlayer.create(this,R.raw.cow);
        goat = MediaPlayer.create(this,R.raw.goat);
        cat = MediaPlayer.create(this,R.raw.cat);
        dog = MediaPlayer.create(this,R.raw.dog);
        tiger = MediaPlayer.create(this,R.raw.tiger);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animals_Activity.super.onBackPressed();



            }
        });

        ImageAnimals.setImageResource(Images[0]);

        ImageAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cow.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.ImageAnimals));

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = 1 +count;
                cow.stop();
                if (count==1)
                {

                    ImageAnimals.setImageResource(Images[1]);
                    ImageAnimals.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            goat.start();

                            YoYo.with(Techniques.FlipInX)
                                    .duration(700)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.ImageAnimals));

                        }


                    });

                }

                if(count == 2){
                    ImageAnimals.setImageResource(Images[2]);
                    ImageAnimals.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            goat.stop();

                            cat.start();

                            YoYo.with(Techniques.FlipInX)
                                    .duration(700)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.ImageAnimals));

                        }
                    });

                }

                if(count == 3){
                    ImageAnimals.setImageResource(Images[3]);

                    ImageAnimals.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            cat.stop();
                            dog.start();


                            YoYo.with(Techniques.FlipInX)
                                    .duration(700)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.ImageAnimals));



                        }
                    });


                }

                if(count == 4 ){

                    ImageAnimals.setImageResource(Images[488]);

                    ImageAnimals.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            dog.stop();

                            tiger.start();



                            YoYo.with(Techniques.FlipInX)
                                    .duration(700)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.ImageAnimals));

                        }
                    });




                }





            }
        });



    }
}