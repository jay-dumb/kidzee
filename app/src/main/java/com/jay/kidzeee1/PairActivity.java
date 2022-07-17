package com.jay.kidzeee1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import Adapter.Adapter;
import Model.Number;

public class PairActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Number> integerArrayList;
    private ArrayList<Number> randomIntegerArrayList;


    private ArrayList<Number> mainIntegerArrayList;
    private Adapter adapter;

    private static int selectedNum = 0;
    private static int selectedNumPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pair);

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

                if (selectedNum == 0){
                    Number number1;
                    if (number.isCheck()){
                        number1 = new Number(number.getNum(), false);
                        selectedNum = 0;
                        selectedNumPos = 0;
                    }else{
                        number1 = new Number(number.getNum(), true);
                        selectedNum = number.getNum();
                        selectedNumPos = position;
                    }
                    mainIntegerArrayList.set(position,number1);
                }else{

                    if (selectedNum == number.getNum()){
                        mainIntegerArrayList.remove(selectedNumPos);
                        mainIntegerArrayList.remove(position);

                        selectedNum = 0;
                        selectedNumPos = 0;

                        Toast.makeText(PairActivity.this, "Same", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(PairActivity.this, "Different", Toast.LENGTH_SHORT).show();
                    }

                }




                int j=0;
                for (Number n:mainIntegerArrayList){
                    if (n.isCheck()){

                    }
                    j++;
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