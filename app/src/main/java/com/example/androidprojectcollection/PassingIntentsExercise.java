package com.example.androidprojectcollection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise extends AppCompatActivity {
    Button btnClear, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        EditText efName = findViewById(R.id.txtFirstName);
        EditText elName = findViewById(R.id.txtLastName);
        RadioButton male = findViewById(R.id.rbtnMale), female = findViewById(R.id.rbtnFemale), others = findViewById(R.id.rbtnOthers);
        EditText eDate = findViewById(R.id.txtDate);
        EditText ePhone = findViewById(R.id.txtPhone);
        EditText eEmail = findViewById(R.id.txtEmail);
        EditText eAdd = findViewById(R.id.txtAddress);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = efName.getText().toString();
                String lname = elName.getText().toString();

                String gender;

                if(male.isChecked()){
                    gender = "Male";
                }
                else if (female.isChecked()){
                    gender = "Female";
                }
                else if (others.isChecked()){
                    gender = "Others";
                }
                else{
                    gender = "Unknown";
                }

                String bDate = eDate.getText().toString();
                String pNumber = ePhone.getText().toString();
                String emailAdd = eEmail.getText().toString();
                String Add = eAdd.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key",fname);
                intent.putExtra("gender_key",gender);
                intent.putExtra("pnum_key", pNumber);
                intent.putExtra("lname_key",lname);
                intent.putExtra("bdate_key",bDate);
                intent.putExtra("eadd_key", emailAdd);
                intent.putExtra("add_key", Add);


                startActivity(intent);
            }
        });

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                efName.setText("");
                elName.setText("");
                male.setChecked(false);
                female.setChecked(false);
                others.setChecked(false);
                eDate.setText("");
                ePhone.setText("");
                eEmail.setText("");
                eAdd.setText("");
            }
        });

    }
}
