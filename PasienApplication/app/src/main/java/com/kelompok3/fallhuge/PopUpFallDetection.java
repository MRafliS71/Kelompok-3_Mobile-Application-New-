package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.swipebutton_library.OnActiveListener;
import com.example.swipebutton_library.SwipeButton;

import java.util.Timer;
import java.util.TimerTask;

public class PopUpFallDetection extends AppCompatActivity {

    private SwipeButton swipeButton;
    private ImageButton fallButton;
    private ProgressBar progressBar;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_fall_detection);
        getSupportActionBar().hide();

        prog();

        fallButton = findViewById(R.id.buttonfall);
        fallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PopUpFallDetection.this, MainPagePatientActivity.class);
                PopUpFallDetection.this.startActivity(myIntent);
            }
        });

        swipeButton = findViewById(R.id.swipe_button);
        swipeButton.setOnActiveListener(new OnActiveListener() {
            @Override
            public void onActive() {
                onBackPressed();
//                Intent myIntent = new Intent(PopUpFallDetection.this, MainPagePatientActivity.class);
//                PopUpFallDetection.this.startActivity(myIntent);
            }
        });
    }

    public void prog(){
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        final Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                progressBar.setProgress(counter);

                if (counter == 120) {
                    timer.cancel();
                    Intent myIntent = new Intent(PopUpFallDetection.this, MainPagePatientActivity.class);
                    PopUpFallDetection.this.startActivity(myIntent);
                }
            }
        };

        timer.schedule(tt,0, 120);
    }
}