package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class PasienPage extends AppCompatActivity {

//    private RecyclerView patient_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasien_page);
        getSupportActionBar().hide();

        ImageButton backButtonPatient = findViewById(R.id.back_buttonPatient);
        backButtonPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(PasienPage.this, MainpageKerabatActivity.class);
//                PasienPage.this.startActivity(myIntent);
            }
        });

        Button tambahPasien = findViewById(R.id.tambahpasien_Button);
        tambahPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                onBackPressed();
                Intent myIntent = new Intent(PasienPage.this, MainpageKerabatActivity.class);
                PasienPage.this.startActivity(myIntent);
            }
        });

        ArrayList<Elder> alElder = new ArrayList<Elder>();
        AdapterPasien adapter;
        RecyclerView rvElder;
        RecyclerView.LayoutManager lm;

//        patient_button = findViewById(R.id.elders);

//        profilePatient_Button = findViewById(R.id.profilePatientButton);

//        patient_button.setOnClickListener(new View.OnClickListener() {
//          @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(PasienPage.this, ProfilePasienPage.class);
//                PasienPage.this.startActivity(myIntent);
//            }
//        });
//        profilePatient_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(PasienPage.this, ProfilePasienPage.class);
//                PasienPage.this.startActivity(myIntent);
//            }
//        });

        setContentView(R.layout.activity_pasien_page);

        alElder.add(new Elder("Gordon Ramsay"));
        alElder.add(new Elder("Jackson"));

        rvElder = (RecyclerView) findViewById(R.id.elders);

        //supaya cepat karena ukuran baris tdk berubah.
        rvElder.setHasFixedSize(true);

        //adapter
        adapter = new AdapterPasien(alElder);
        rvElder.setAdapter(adapter);

        //layout manager
        lm = new LinearLayoutManager(this);
        rvElder.setLayoutManager(lm);
    }
}