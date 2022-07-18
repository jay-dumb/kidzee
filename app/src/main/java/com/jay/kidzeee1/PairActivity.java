package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Collections;

import Adapter.Adapter;
import Model.Number;
import Utility.ClickSound;

public class PairActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Number> integerArrayList;
    private ArrayList<Number> randomIntegerArrayList;

    private ArrayList<Number> mainIntegerArrayList;
    private Adapter adapter;

    private static int selectedNum = -1;
    private static int selectedNumPos = -1;

    private LottieAnimationView lottieAnimationView;
    private MaterialButton btnBack;

    private ClickSound clickSound;
    private static String RIGHT_SOUND = "RIGHT";
    private static String WRONG_SOUND = "WRONG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pair);

        lottieAnimationView = findViewById(R.id.animationView);
        lottieAnimationView.setVisibility(View.GONE);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setVisibility(View.GONE);

        clickSound = new ClickSound(PairActivity.this);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PairActivity.this.onBackPressed();
            }
        });

        integerArrayList = new ArrayList<>();
        randomIntegerArrayList = new ArrayList<>();
        mainIntegerArrayList = new ArrayList<>();

        createRandomList();

        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager g1 = new GridLayoutManager(PairActivity.this, 6, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(g1);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(PairActivity.this, mainIntegerArrayList);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void OnClick(int position) {
                


                Number number = mainIntegerArrayList.get(position);

                if (selectedNumPos == position){
                    selectedNum = -1;
                    selectedNumPos = -1;
                }

                if (selectedNum == -1){
                    Number number1;
                    if (number.isCheck()){
                        number1 = new Number(number.getNum(), false);
                        selectedNum = -1;
                        selectedNumPos = -1;
                    }else{
                        number1 = new Number(number.getNum(), true);
                        selectedNum = number.getNum();
                        selectedNumPos = position;
                    }
                    mainIntegerArrayList.set(position,number1);

                }else{

                    if (selectedNum == number.getNum()){

                        mainIntegerArrayList.remove(selectedNumPos);
                        int i=0;
                        for (Number a: mainIntegerArrayList){
                            if (a.getNum()==selectedNum){
                                mainIntegerArrayList.remove(i);
                                break;
                            }
                            i++;
                        }
                        
                        selectedNum = -1;
                        selectedNumPos = -1;

                        clickSound.sound(RIGHT_SOUND);
                    }else{
                        clickSound.sound(WRONG_SOUND);
                    }

                }

                if (mainIntegerArrayList.isEmpty()){
                    lottieAnimationView.setVisibility(View.VISIBLE);
                    btnBack.setVisibility(View.VISIBLE);
                    Toast.makeText(PairActivity.this, "Congratulation....", Toast.LENGTH_SHORT).show();
                }

                adapter.notifyDataSetChanged();

            }
        });
    }

    private void createRandomList() {

        integerArrayList.clear();
        for (int i=1; i<=20 ; i++){
            Number number = new Number(i,false);
            integerArrayList.add(number);
        }

        Collections.shuffle(integerArrayList);

        int j = 0;
        for (Number num:integerArrayList){
            j++;
            if (j<=12){
                randomIntegerArrayList.add(num);
                mainIntegerArrayList.add(num);
            }
        }

        for (Number cNum: randomIntegerArrayList){
            mainIntegerArrayList.add(cNum);
        }
        Collections.shuffle(mainIntegerArrayList);

    }
}