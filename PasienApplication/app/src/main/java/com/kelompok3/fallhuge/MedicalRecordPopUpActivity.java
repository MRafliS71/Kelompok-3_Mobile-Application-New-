package com.kelompok3.fallhuge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MedicalRecordPopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record_pop_up);
        getSupportActionBar().hide();

        Button yaButton = findViewById(R.id.ya_button);
        yaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ceritanya berhasil Download", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });

        Button noButton = findViewById(R.id.tidak_button);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
