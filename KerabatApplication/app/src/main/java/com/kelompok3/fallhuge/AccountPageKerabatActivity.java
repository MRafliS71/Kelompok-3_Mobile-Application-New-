package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AccountPageKerabatActivity extends AppCompatActivity {

    private ImageButton backButton;
    private Button editButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage_kerabat);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonAccount);
        editButton = findViewById(R.id.edit_Button);
        logoutButton = findViewById(R.id.logout_Button);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPageKerabatActivity.this, MainpageKerabatActivity.class);
                AccountPageKerabatActivity.this.startActivity(myIntent);
            }
        });
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPageKerabatActivity.this, EditAkunKerabatActivity.class);
                AccountPageKerabatActivity.this.startActivity(myIntent);
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AccountPageKerabatActivity.this, LogInKerabatActivity.class);
                AccountPageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }

}