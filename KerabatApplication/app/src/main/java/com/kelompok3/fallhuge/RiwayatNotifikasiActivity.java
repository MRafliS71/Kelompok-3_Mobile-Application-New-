package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RiwayatNotifikasiActivity extends AppCompatActivity {
    private ImageButton back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_notifikasi);
        getSupportActionBar().hide();

        back_Button = findViewById(R.id.back_button);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(RiwayatNotifikasiActivity.this, MainpageKerabatActivity.class);
                RiwayatNotifikasiActivity.this.startActivity(myIntent);
            }
        });
    }
}