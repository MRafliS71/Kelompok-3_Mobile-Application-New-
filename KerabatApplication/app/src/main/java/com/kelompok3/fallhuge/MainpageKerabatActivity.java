package com.kelompok3.fallhuge;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainpageKerabatActivity extends AppCompatActivity {

    private ImageButton accountButton, notifButton, firstaidButton, patientButton, locationButton, helpelderButton;
    AlertDialog dialog;

    @Override
    public void onBackPressed() {
        dialog.show(); // memanggil fungsi dialog alert yang sudah dibuat jika user mengklik tombol back pada Main Page
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_kerabat);
        getSupportActionBar().hide();

        // deklarasi AlertDialog, yang akan mematikan system aplikasi jika user inginkeluar
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benarkah anda ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        dialog = builder.create();

        accountButton = findViewById(R.id.account_button);
        notifButton = findViewById(R.id.notif_button);
        firstaidButton = findViewById(R.id.firstaid_button);
        patientButton = findViewById(R.id.patient_button);
        locationButton = findViewById(R.id.location_button);
        helpelderButton = findViewById(R.id.helpelder_button);

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
                Intent myIntent = new Intent(MainpageKerabatActivity.this, NotificationPageActivity.class);
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
                Intent myIntent = new Intent(MainpageKerabatActivity.this, PasienPageActivity.class);
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
        helpelderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, WarningPageActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}