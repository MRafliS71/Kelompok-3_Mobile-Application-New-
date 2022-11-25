package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class HelpElderActivity extends AppCompatActivity {

    private Button nearhospitalButton, ppButton;
    private ImageButton xButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_elder);
        getSupportActionBar().hide();

        nearhospitalButton = findViewById(R.id.nearestMedicalCenter_Button);
        xButton = findViewById(R.id.x_button);
        ppButton = findViewById(R.id.firstaid_button);

        nearhospitalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Rumah Sakit Terdekat");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        ppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(HelpElderActivity.this, FirstAidActivity.class);
                HelpElderActivity.this.startActivity(myIntent);
            }
        });
        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(HelpElderActivity.this, MainpageKerabatActivity.class);
                HelpElderActivity.this.startActivity(myIntent);
            }
        });
    }

}