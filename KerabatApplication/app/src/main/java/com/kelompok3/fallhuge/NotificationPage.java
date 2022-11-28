package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class NotificationPage extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_page);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvNotification);

        List<Notification> notif = new ArrayList<Notification>();
        notif.add(new Notification("Ambilkan Obat","Bantuan","19.20","12 Agustus 2022",R.drawable.ppacount_default,R.drawable.bgmessagenotif,R.drawable.yellowbellnotif));
        notif.add(new Notification("Terjatuh!!","Darurat","07.09","8 November 2022",R.drawable.ppacount_default,R.drawable.bgemergencnotif,R.drawable.triangelemergency));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterNotif(getApplicationContext(),notif));

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NotificationPage.this, MainpageKerabatActivity.class);
                NotificationPage.this.startActivity(myIntent);
            }
        });
    }
}