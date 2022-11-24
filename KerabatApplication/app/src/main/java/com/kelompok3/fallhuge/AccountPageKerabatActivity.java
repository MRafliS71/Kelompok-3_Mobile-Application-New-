package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AccountPageKerabatActivity extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage_kerabat);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonAccount);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPageKerabatActivity.this, MainpageKerabatActivity.class);
                AccountPageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }

}