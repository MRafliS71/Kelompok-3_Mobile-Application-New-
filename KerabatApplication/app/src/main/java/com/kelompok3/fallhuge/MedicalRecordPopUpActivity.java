package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MedicalRecordPopUpActivity extends AppCompatActivity {

    Button yaButton, noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record_pop_up);
        getSupportActionBar().hide();

        yaButton = findViewById(R.id.ya_button);
        yaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ceritanya berhasil Download", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });

        noButton = findViewById(R.id.tidak_button);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}