package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise2 extends AppCompatActivity {
    Button btnreturn;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        TextView tfname = findViewById(R.id.txt2Fname),
                tlname = findViewById(R.id.txt2Lname),
                tbirth = findViewById(R.id.txt2BDate),
                tphone = findViewById(R.id.txt2Phone),
                temail = findViewById(R.id.txt2Email),
                tgender = findViewById(R.id.txt2Gender),
                tadd = findViewById(R.id.txt2Address);

        btnreturn = findViewById(R.id.btnReturn);
        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        PassingIntentsExercise2.this,
                        PassingIntentsExercise.class
                );
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String gender = intent.getStringExtra("gender_key");
        String pnum = intent.getStringExtra("pnum_key");
        String lname = intent.getStringExtra("lname_key");
        String bdate = intent.getStringExtra("bdate_key");
        String email = intent.getStringExtra("eadd_key");
        String add = intent.getStringExtra("add_key");

        tfname.setText(fname);
        tlname.setText(lname);
        tbirth.setText(bdate);
        tphone.setText(pnum);
        tgender.setText(gender);
        tadd.setText(add);
        temail.setText(email);
        tphone.setText(pnum);
    }
}
