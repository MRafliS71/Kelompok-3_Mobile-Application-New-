package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MedicalRecordActivity extends AppCompatActivity {

    ImageButton backButton;
    Button download, upload, delete;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record);

        backButton = findViewById(R.id.back_buttonMedical);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        download = findViewById(R.id.download_Button);
        myDialog = new Dialog(this);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.setContentView(R.layout.activity_medical_record_pop_up);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
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