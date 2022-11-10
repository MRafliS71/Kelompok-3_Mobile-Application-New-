package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ProfilePatientPageActivity extends AppCompatActivity {

        private ImageButton backButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_profilepatient_page);

            backButton = findViewById(R.id.back_buttonProfile);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(ProfilePatientPageActivity.this, PatientPageActivity.class);
                    ProfilePatientPageActivity.this.startActivity(myIntent);
                }
            });
    }
}