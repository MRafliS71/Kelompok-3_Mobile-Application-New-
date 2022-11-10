package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainpageKerabatActivity extends AppCompatActivity {

    private ImageButton accountButton, notifButton, firstaidButton, patientButton, locationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_kerabat);

        accountButton = findViewById(R.id.account_button);
        notifButton = findViewById(R.id.notif_button);
        firstaidButton = findViewById(R.id.firstaid_button);
        patientButton = findViewById(R.id.patient_button);
        locationButton = findViewById(R.id.location_button);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, AccountPageKerabatActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        notifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, RiwayatNotifikasiActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        firstaidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, FirstAidActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        patientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, PatientPageActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, KerabatLocationActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}