package com.kelompok3.fallhuge;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class MainPagePatientActivity extends AppCompatActivity {

    private ImageButton pesanButton, kerabatButton, accountButton, bantuanButton, notifikasiButton;
    private Button buttonFallSimulation;
    AlertDialog dialog;

    @Override
    public void onBackPressed() {
        dialog.show(); // memanggil fungsi dialog alert yang sudah dibuat jika user mengklik tombol back pada Main Page
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_patient);
        getSupportActionBar().hide();

        // deklarasi AertDialog, yang akan mematikan system aplikasi jika user inginkeluar
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

        buttonFallSimulation = findViewById(R.id.buttonFallSimulation);
        buttonFallSimulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, PopUpFallDetection.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        pesanButton = findViewById(R.id.pesanButton);
        pesanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, MessagePageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        kerabatButton = findViewById(R.id.kerabatButton);
        kerabatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, KerabatPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        notifikasiButton = findViewById(R.id.notifikasiButton);
        notifikasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, NotificationPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        accountButton = findViewById(R.id.accountButton);
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, AccountPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        bantuanButton = findViewById(R.id.bantuanButton);
        bantuanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, PopUpHelpButton.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });
    }
}