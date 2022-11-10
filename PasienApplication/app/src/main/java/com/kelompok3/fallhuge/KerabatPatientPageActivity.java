package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

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
    }
}