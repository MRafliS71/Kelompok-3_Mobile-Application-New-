package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PatientPageActivity extends AppCompatActivity {

    private ImageButton backButton;
//    private RecyclerView patient_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_page);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonPatient);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PatientPageActivity.this, MainpageKerabatActivity.class);
                PatientPageActivity.this.startActivity(myIntent);
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
//                Intent myIntent = new Intent(PatientPageActivity.this, ProfilePatientPageActivity.class);
//                PatientPageActivity.this.startActivity(myIntent);
//            }
//        });
//        profilePatient_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(PatientPageActivity.this, ProfilePatientPageActivity.class);
//                PatientPageActivity.this.startActivity(myIntent);
//            }
//        });

        setContentView(R.layout.activity_patient_page);

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