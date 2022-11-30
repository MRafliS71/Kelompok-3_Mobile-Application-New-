package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MessagePageActivity extends AppCompatActivity {

    private ImageButton backMessageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_page);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvMessage);

        List<Message> message = new ArrayList<>();
        message.add(new Message(R.drawable.point, "Ambilkan Obat"));
        message.add(new Message(R.drawable.point, "Minta Tolong"));
        message.add(new Message(R.drawable.point, "Nyalakan AC"));
        message.add(new Message(R.drawable.point, "Pijat punggung saya"));
        message.add(new Message(R.drawable.point, "Saya mau jalan2"));
        message.add(new Message(R.drawable.point, "Saya lapar"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterMessage(getApplicationContext(),message));

        backMessageButton = findViewById(R.id.backMessageButton);
        backMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(MessagePageActivity.this, MainPagePatientActivity.class);
//                MessagePageActivity.this.startActivity(myIntent);
            }
        });
    }
}