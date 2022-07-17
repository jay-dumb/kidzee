package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LearnNumber extends AppCompatActivity {

    ImageView Back;
    ImageView one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty;
    MediaPlayer NumberOne,NumberTwo, NumberThree, NumberFour, NumberFive, NumberSix, NumberSeven, NumberEight, NumberNine, NumberTen, NumberEleven, NumberTwelve, NumberThirteen, NumberFourteen, NumberFifteen, NumberSixteen, NumberSeventeen, NumberEighteen, NumberNineteen, NumberTwenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_number);


        Back = findViewById(R.id.LearnNumberBack);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);


        NumberOne = MediaPlayer.create(this,R.raw.one);
        NumberTwo = MediaPlayer.create(this,R.raw.two);
        NumberThree = MediaPlayer.create(this,R.raw.three);
        NumberFour = MediaPlayer.create(this,R.raw.four);
        NumberFive = MediaPlayer.create(this,R.raw.five);
        NumberSix = MediaPlayer.create(this,R.raw.six);
        NumberSeven = MediaPlayer.create(this,R.raw.seven);
        NumberEight = MediaPlayer.create(this,R.raw.eight);
        NumberNine = MediaPlayer.create(this,R.raw.nine);
        NumberTen = MediaPlayer.create(this,R.raw.ten);
        NumberEleven = MediaPlayer.create(this,R.raw.eleven);
        NumberTwelve = MediaPlayer.create(this,R.raw.twelve);
        NumberThirteen = MediaPlayer.create(this,R.raw.thirteen);
        NumberFourteen = MediaPlayer.create(this,R.raw.fourteen);
        NumberFifteen = MediaPlayer.create(this,R.raw.fifteen);
        NumberSixteen = MediaPlayer.create(this,R.raw.sixteen);
        NumberSeventeen = MediaPlayer.create(this,R.raw.seventeen);
        NumberEighteen = MediaPlayer.create(this,R.raw.eighteen);
        NumberNineteen = MediaPlayer.create(this,R.raw.nineteen);
        NumberTwenty = MediaPlayer.create(this,R.raw.twenty);


        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LearnNumber.super.onBackPressed();
            }
        });
        
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberOne.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.one));
            }
        });
        
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LearnNumber.this, "two", Toast.LENGTH_SHORT).show();

                NumberTwo.start();

                YoYo.with(Techniques.FlipInX  )
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.two));
            }
        });
        
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberThree.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.three));
            }
        });
        
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFour.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.four));
            }
        });
        
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFive.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.five));
            }
        });
        
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberSix.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.six));
            }
        });
        
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberSeven.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.seven));

            }
        });
        
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberEight.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.eight));
            }
        });
        
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberNine.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.nine));

            }
        });
        
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberTen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.ten));

            }
        });
        
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberEleven.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.eleven));

            }
        });
        
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberTwelve.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.twelve));


            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberThirteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.thirteen));

            }
        });
        
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFourteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.fourteen));

            }
        });
        
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFifteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.fifteen));

            }
        });
        
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                NumberSixteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.sixteen));

            }
        });
        
        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberSeventeen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.seventeen));

            }
        });

        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberEighteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.eighteen));

            }
        });
        
        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberNineteen.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.nineteen));

            }
        });
        
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberTwenty.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.twenty));

            }
        });

    }
}