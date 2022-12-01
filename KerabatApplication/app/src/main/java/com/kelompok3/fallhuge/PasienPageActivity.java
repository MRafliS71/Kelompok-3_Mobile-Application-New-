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
import java.util.List;

public class PasienPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasien_page);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvPasien);

        List<ClassPasien> pasien = new ArrayList<>();
        pasien.add(new ClassPasien("Gordon Ramsey"));
        pasien.add(new ClassPasien("Ronaldo"));
        pasien.add(new ClassPasien("Mas Juki"));
        pasien.add(new ClassPasien("Kelompok 3 MobApp"));
        pasien.add(new ClassPasien("Kece banget"));
        pasien.add(new ClassPasien("Mantap pisan brow"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterPasien(getApplicationContext(),pasien));

        ImageButton backButtonPatient = findViewById(R.id.back_buttonPatient);
        backButtonPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(PasienPageActivity.this, MainpageKerabatActivity.class);
//                PasienPageActivity.this.startActivity(myIntent);
            }
        });

        Button tambahPasien = findViewById(R.id.tambahpasien_Button);
        tambahPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                onBackPressed();
                Intent myIntent = new Intent(PasienPageActivity.this, MainpageKerabatActivity.class);
                PasienPageActivity.this.startActivity(myIntent);
            }
        });
    }
}