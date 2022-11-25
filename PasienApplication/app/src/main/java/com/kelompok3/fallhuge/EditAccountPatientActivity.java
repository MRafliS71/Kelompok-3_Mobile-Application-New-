package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditAccountPatientActivity extends AppCompatActivity {

    private Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account_patient);
        getSupportActionBar().hide();

        doneButton = findViewById(R.id.done_Button);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(EditAccountPatientActivity.this, AccountPatientPageActivity.class);
                EditAccountPatientActivity.this.startActivity(myIntent);
            }
        });
    }
}