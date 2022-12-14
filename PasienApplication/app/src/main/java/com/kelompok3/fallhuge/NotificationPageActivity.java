package com.kelompok3.fallhuge;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotificationPageActivity extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_page);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvNotification);

        List<ClassNotification> notif = new ArrayList<>();
        notif.add(new ClassNotification("Saya ingin makan","Bantuan","10.20","4 Desember 2022",R.drawable.ppacount_default,R.drawable.bgmessagenotif,R.drawable.yellowbellnotif));
        notif.add(new ClassNotification("Terjatuh!!","Darurat","15.28","3 Desember 2022",R.drawable.ppacount_default,R.drawable.bgemergencnotif,R.drawable.triangelemergency));
        notif.add(new ClassNotification("Terjatuh!!","Darurat","07.09","8 November 2022",R.drawable.ppacount_default,R.drawable.bgemergencnotif,R.drawable.triangelemergency));
        notif.add(new ClassNotification("Ambilkan Obat","Bantuan","19.20","12 Agustus 2022",R.drawable.ppacount_default,R.drawable.bgmessagenotif,R.drawable.yellowbellnotif));
        notif.add(new ClassNotification("Terjatuh!!","Darurat","10.45","2 Juli 2022",R.drawable.ppacount_default,R.drawable.bgemergencnotif,R.drawable.triangelemergency));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterNotif(getApplicationContext(),notif));

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(NotificationPageActivity.this, MainPagePatientActivity.class);
//                NotificationPageActivity.this.startActivity(myIntent);
            }
        });
    }
}
