package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class KerabatPatientPageActivity extends AppCompatActivity {

    private ImageButton backKerabatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerabat_patient_page);
        getSupportActionBar().hide();

        backKerabatButton = findViewById(R.id.backKerabatButton);
        backKerabatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(KerabatPatientPageActivity.this, MainPagePatientActivity.class);
                KerabatPatientPageActivity.this.startActivity(myIntent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.rvKerabarPatient);

        List<Kerabat> kerabat = new ArrayList<>();
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Muhammad Rafli S", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Muhammad Ghiyats A", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Mochamad Ray M", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Ahmad Muflih I.M.K", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Gordon Ramsey", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Ronaldo", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Messi Pamungkas", R.drawable.arrowcircle_down));
        kerabat.add(new Kerabat(R.drawable.ppacount_default, "Kamu Nenyee?", R.drawable.arrowcircle_down));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterKerabat(getApplicationContext(),kerabat));
    }
}