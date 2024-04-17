package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class ButtonExercise extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RelativeLayout rootLayout = findViewById(R.id.RLayout);

        btn1 = findViewById(R.id.button5);
        btn2 = findViewById(R.id.button7);
        btn3 = findViewById(R.id.button8);
        btn4 = findViewById(R.id.button10);
        btn5 = findViewById(R.id.button11);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        ButtonExercise.this,
                        CloseActivity.class
                );
                startActivity(intent1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar test = Snackbar.make(view, "Hello", BaseTransientBottomBar.LENGTH_LONG);
                test.show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getWindow().getDecorView().setBackgroundColor(000000);
                rootLayout.setBackgroundColor(Color.parseColor("#1498db"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setBackgroundColor(Color.parseColor("#4564db"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setVisibility(View.INVISIBLE);
            }
        });

    }

}
