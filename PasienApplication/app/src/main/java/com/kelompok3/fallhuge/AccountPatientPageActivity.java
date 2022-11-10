package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AccountPatientPageActivity extends AppCompatActivity {

    private ImageButton backaccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_patient_page);
        getSupportActionBar().hide();

        backaccountButton = findViewById(R.id.backaccountButton);
        backaccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPatientPageActivity.this, MainPagePatientActivity.class);
                AccountPatientPageActivity.this.startActivity(myIntent);
            }
        });
    }
}