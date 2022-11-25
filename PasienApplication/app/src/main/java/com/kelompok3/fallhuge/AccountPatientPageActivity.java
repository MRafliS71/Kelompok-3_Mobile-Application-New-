package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AccountPatientPageActivity extends AppCompatActivity {

    private ImageButton backaccountButton;
    private Button medicalButton, editButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_patient_page);
        getSupportActionBar().hide();

        backaccountButton = findViewById(R.id.backaccountButton);
        medicalButton = findViewById(R.id.medical_Button);
        editButton = findViewById(R.id.edit_Button);
        logoutButton = findViewById(R.id.logout_Button);

        backaccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPatientPageActivity.this, MainPagePatientActivity.class);
                AccountPatientPageActivity.this.startActivity(myIntent);
            }
        });
        medicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPatientPageActivity.this, MedicalRecordActivity.class);
                AccountPatientPageActivity.this.startActivity(myIntent);
            }
        });
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPatientPageActivity.this, EditAccountPatientActivity.class);
                AccountPatientPageActivity.this.startActivity(myIntent);
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPatientPageActivity.this, LogInActivity.class);
                AccountPatientPageActivity.this.startActivity(myIntent);
            }
        });
    }
}