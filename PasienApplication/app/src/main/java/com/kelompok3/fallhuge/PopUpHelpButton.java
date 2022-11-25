package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PopUpHelpButton extends AppCompatActivity {

    private Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_help_button);
        getSupportActionBar().hide();

        cancelButton = findViewById(R.id.tidak_Button2);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PopUpHelpButton.this, MainPagePatientActivity.class);
                PopUpHelpButton.this.startActivity(myIntent);
            }
        });
    }
}