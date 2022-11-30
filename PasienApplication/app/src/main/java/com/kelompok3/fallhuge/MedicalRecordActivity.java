package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MedicalRecordActivity extends AppCompatActivity {

    ImageButton backButton;
    Button download, upload, delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonMedical);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        download = findViewById(R.id.download_Button);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Tombol download berfungsi", Toast.LENGTH_SHORT).show();
            }
        });

        upload = findViewById(R.id.upload_Button);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Tombol upload berfungsi", Toast.LENGTH_SHORT).show();
            }
        });

        delete = findViewById(R.id.delete_Button);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Tombol delete berfungsi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}