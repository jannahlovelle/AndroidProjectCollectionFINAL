package com.example.androidprojectcollection;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Random;

public class Match3 extends AppCompatActivity {
    Random r = new Random();
    private Button b00, b01, b02, b03, b04;
    private Button b10, b11, b12, b13, b14;
    private Button b20, b21, b22, b23, b24;
    private Button b30, b31, b32, b33, b34;
    private Button b40, b41, b42, b43, b44;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        Array[][] color = new Array[5][5];
        b00 = findViewById(R.id.button00);
        b01 = findViewById(R.id.button01);
        b02 = findViewById(R.id.button02);
        b03 = findViewById(R.id.button03);
        b04 = findViewById(R.id.button04);

        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
    }
}
