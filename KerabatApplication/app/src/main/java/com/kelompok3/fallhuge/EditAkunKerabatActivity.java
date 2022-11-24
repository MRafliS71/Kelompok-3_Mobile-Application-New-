package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EditAkunKerabatActivity extends AppCompatActivity {

    private ImageButton backButton;
    private Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_akun_kerabat);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_buttonEditAccount);
        doneButton = findViewById(R.id.done_Button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(EditAkunKerabatActivity.this, AccountPageKerabatActivity.class);
                EditAkunKerabatActivity.this.startActivity(myIntent);
            }
        });
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(EditAkunKerabatActivity.this, AccountPageKerabatActivity.class);
                EditAkunKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}