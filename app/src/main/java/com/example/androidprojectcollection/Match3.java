package com.example.androidprojectcollection;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Match3 extends AppCompatActivity {
    Random r = new Random();
    public int[][] color = new int[5][5];
    private Button b00, b01, b02, b03, b04;
    private Button b10, b11, b12, b13, b14;
    private Button b20, b21, b22, b23, b24;
    private Button b30, b31, b32, b33, b34;
    private Button b40, b41, b42, b43, b44;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);


        initButtons();
        randomizeTable(color);

    }

    public void initButtons(){
        //initializing button
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

        b20 = findViewById(R.id.button20);
        b21 = findViewById(R.id.button21);
        b22 = findViewById(R.id.button22);
        b23 = findViewById(R.id.button23);
        b24 = findViewById(R.id.button24);

        b30 = findViewById(R.id.button30);
        b31 = findViewById(R.id.button31);
        b32 = findViewById(R.id.button32);
        b33 = findViewById(R.id.button33);
        b34 = findViewById(R.id.button34);

        b40 = findViewById(R.id.button40);
        b41 = findViewById(R.id.button41);
        b42 = findViewById(R.id.button42);
        b43 = findViewById(R.id.button43);
        b44 = findViewById(R.id.button44);
    }
    public void randomizeTable(int[][] color){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                color[i][j] = r.nextInt(5);
            }
        }
    }
}
