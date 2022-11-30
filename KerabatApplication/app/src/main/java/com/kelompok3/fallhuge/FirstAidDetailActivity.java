package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FirstAidDetailActivity extends AppCompatActivity {
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid_detail);
        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(FirstAidDetailActivity.this, FirstAidActivity.class);
//                FirstAidDetailActivity.this.startActivity(myIntent);
            }
        });
    }
}