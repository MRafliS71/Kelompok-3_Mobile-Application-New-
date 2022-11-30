package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FirstAidActivity extends AppCompatActivity {
    private ImageButton backButton;
    private Button detailFirstAidButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_button);
        detailFirstAidButton = findViewById(R.id.detailFirstAid_Button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(FirstAidActivity.this, MainpageKerabatActivity.class);
//                FirstAidActivity.this.startActivity(myIntent);
            }
        });
        detailFirstAidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(FirstAidActivity.this, FirstAidDetailActivity.class);
                FirstAidActivity.this.startActivity(myIntent);
            }
        });
    }
}