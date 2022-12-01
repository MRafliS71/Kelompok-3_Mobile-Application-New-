package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePatientPageActivity extends AppCompatActivity {

        private ImageButton backButton;
        private Button medicalButton;

        TextView nameAccountPasien;
        ImageView ppAccountPasien;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profilepatient_page);
            getSupportActionBar().hide();

            String namePasien = getIntent().getStringExtra("NAME");
            int ppPasien = getIntent().getIntExtra("ProfilePicture", 0);

            nameAccountPasien = findViewById(R.id.nameAccount);
            ppAccountPasien = findViewById(R.id.ppAccount);

            nameAccountPasien.setText(namePasien);
            ppAccountPasien.setImageResource(ppPasien);

            backButton = findViewById(R.id.back_buttonProfile);
            medicalButton = findViewById(R.id.medical_Button);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
//                    Intent myIntent = new Intent(ProfilePatientPageActivity.this, PasienPageActivity.class);
//                    ProfilePatientPageActivity.this.startActivity(myIntent);
                }
            });
            medicalButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(ProfilePatientPageActivity.this, MedicalRecordActivity.class);
                    ProfilePatientPageActivity.this.startActivity(myIntent);
                }
            });
    }
}