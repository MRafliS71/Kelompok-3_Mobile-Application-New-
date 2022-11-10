package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LogInKerabatActivity extends AppCompatActivity {
    private Button masukButton;
    private TextView buatAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_log_in_kerabat);

        masukButton = findViewById(R.id.masukButton);
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LogInKerabatActivity.this, MainpageKerabatActivity.class);
                LogInKerabatActivity.this.startActivity(myIntent);
            }
        });

        buatAkun = findViewById(R.id.BuatAkun);
        buatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LogInKerabatActivity.this, SignInKerabatActivity.class);
                LogInKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}