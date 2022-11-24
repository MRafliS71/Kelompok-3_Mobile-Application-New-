package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class ProfilePatientPageActivity extends AppCompatActivity {

        private ImageButton backButton;
        private Button medicalButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profilepatient_page);
            getSupportActionBar().hide();

            backButton = findViewById(R.id.back_buttonProfile);
            medicalButton = findViewById(R.id.medical_Button);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(ProfilePatientPageActivity.this, PatientPageActivity.class);
                    ProfilePatientPageActivity.this.startActivity(myIntent);
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