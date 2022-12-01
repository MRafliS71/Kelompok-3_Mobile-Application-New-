package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MedicalRecordActivity extends AppCompatActivity {

    ImageButton backButton;
    Button download;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonMedical);
        download = findViewById(R.id.download_Button);
        myDialog = new Dialog(this);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.setContentView(R.layout.activity_medical_record_pop_up);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
//                Toast.makeText(getApplicationContext(), "Tombol download berfungsi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}