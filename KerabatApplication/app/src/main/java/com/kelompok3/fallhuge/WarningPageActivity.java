package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.swipebutton_library.OnActiveListener;
import com.example.swipebutton_library.SwipeButton;

public class WarningPageActivity extends AppCompatActivity {

    private ImageButton closeButton;
    private SwipeButton swipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning_page);
        getSupportActionBar().hide();

        closeButton = findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(WarningPageActivity.this, MainpageKerabatActivity.class);
                WarningPageActivity.this.startActivity(myIntent);
            }
        });

        swipeButton = findViewById(R.id.swipe_button);
        swipeButton.setOnActiveListener(new OnActiveListener() {
            @Override
            public void onActive() {
                Intent myIntent = new Intent(WarningPageActivity.this, HelpElderActivity.class);
                WarningPageActivity.this.startActivity(myIntent);
            }
        });
    }
}