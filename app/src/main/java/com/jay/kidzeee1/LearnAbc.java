package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LearnAbc extends AppCompatActivity {


    ImageView Back;
    ImageView a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    MediaPlayer AlphabetA, AlphabetB,AlphabetC,AlphabetD,AlphabetE,AlphabetF,AlphabetG,AlphabetH,AlphabetI,AlphabetJ,AlphabetK,AlphabetL,AlphabetM,AlphabetN,AlphabetO,AlphabetP,AlphabetQ,AlphabetR,AlphabetS,AlphabetT,AlphabetU,AlphabetV,AlphabetW,AlphabetX,AlphabetY,AlphabetZ ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_abc);


        Back = findViewById(R.id.LearnAbcBack);
        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        g = findViewById(R.id.G);
        h = findViewById(R.id.H);
        i = findViewById(R.id.I);
        j = findViewById(R.id.J);
        k = findViewById(R.id.K);
        l = findViewById(R.id.L);
        m = findViewById(R.id.M);
        n = findViewById(R.id.N);
        o = findViewById(R.id.O);
        p = findViewById(R.id.P);
        q = findViewById(R.id.Q);
        r = findViewById(R.id.R);
        s = findViewById(R.id.S);
        t = findViewById(R.id.T);
        u = findViewById(R.id.U);
        v = findViewById(R.id.V);
        w = findViewById(R.id.W);
        x = findViewById(R.id.X);
        y = findViewById(R.id.Y);
        z = findViewById(R.id.Z);



        AlphabetA = MediaPlayer.create(this,R.raw.a);
        AlphabetB = MediaPlayer.create(this,R.raw.b);
        AlphabetC = MediaPlayer.create(this,R.raw.c);
        AlphabetD = MediaPlayer.create(this,R.raw.d);
        AlphabetE = MediaPlayer.create(this,R.raw.e);
        AlphabetF = MediaPlayer.create(this,R.raw.f);
        AlphabetG = MediaPlayer.create(this,R.raw.g);
        AlphabetH = MediaPlayer.create(this,R.raw.h);
        AlphabetI = MediaPlayer.create(this,R.raw.i);
        AlphabetJ = MediaPlayer.create(this,R.raw.j);
        AlphabetK = MediaPlayer.create(this,R.raw.k);
        AlphabetL = MediaPlayer.create(this,R.raw.l);
        AlphabetM = MediaPlayer.create(this,R.raw.m);
        AlphabetN = MediaPlayer.create(this,R.raw.n);
        AlphabetO = MediaPlayer.create(this,R.raw.o);
        AlphabetP = MediaPlayer.create(this,R.raw.p);
        AlphabetQ = MediaPlayer.create(this,R.raw.q);
        AlphabetR = MediaPlayer.create(this,R.raw.r);
        AlphabetS = MediaPlayer.create(this,R.raw.s);
        AlphabetT = MediaPlayer.create(this,R.raw.t);
        AlphabetU = MediaPlayer.create(this,R.raw.u);
        AlphabetV = MediaPlayer.create(this,R.raw.v);
        AlphabetW = MediaPlayer.create(this,R.raw.w);
        AlphabetX = MediaPlayer.create(this,R.raw.x);
        AlphabetY = MediaPlayer.create(this,R.raw.y);
        AlphabetZ = MediaPlayer.create(this,R.raw.z);


        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LearnAbc.super.onBackPressed();
            }
        });
        
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetA.start();


                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.A));
            }
        });
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetB.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.B));
            }
        });
        
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AlphabetC.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.C));
            }
        });
        
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetD.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.D));
            }
        });
        
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetE.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.E));
            }
        });
        
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetF.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.F));
            }
        });
        
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AlphabetG.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.G));
            }
        });
        
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetH.start();
                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.H));
            }
        });
        
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetI.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.I));
            }
        });
        
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetJ.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.J));
            }
        });
        
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetK.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.K));
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetL.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.L));
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AlphabetM.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.M));
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetN.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.N));
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetO.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.O));
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetP.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.P));
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetQ.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.Q));
            }
        });
        
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetR.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.R));
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetS.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.S));
            }
        });
        
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetT.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.T));
            }
        });
        
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetU.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.U));
            }
        });
        
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetV.start();



                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.V));
            }
        });
        
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphabetW.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.W));
            }
        });
        
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlphabetX.start();


                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.X));
            }
        });
        
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AlphabetY.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.Y));
            }
        });
        
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AlphabetZ.start();

                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.Z));
            }
        });
        
    }
}