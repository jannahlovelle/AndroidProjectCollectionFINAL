package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnLayoutExercise);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(
                        MainActivity.this,
                        LayoutExercise.class
                );
                startActivity(intent1);
            }
        });

        btn2 = findViewById(R.id.btnTest);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(
                        MainActivity.this,
                        ButtonExercise.class
                );
                startActivity(intent1);
            }
        });

        btn3 = findViewById(R.id.btnCalc);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(
                        MainActivity.this,
                        Calculator.class
                );
                startActivity(intent1);
            }
        });
    }
}