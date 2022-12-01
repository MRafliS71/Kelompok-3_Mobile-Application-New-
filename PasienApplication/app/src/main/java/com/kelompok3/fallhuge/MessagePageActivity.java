package com.kelompok3.fallhuge;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

        List<ClassMessage> message = new ArrayList<>();
        message.add(new ClassMessage(R.drawable.point, "Ambilkan Obat"));
        message.add(new ClassMessage(R.drawable.point, "Minta Tolong"));
        message.add(new ClassMessage(R.drawable.point, "Nyalakan AC"));
        message.add(new ClassMessage(R.drawable.point, "Pijat punggung saya"));
        message.add(new ClassMessage(R.drawable.point, "Saya mau jalan2"));
        message.add(new ClassMessage(R.drawable.point, "Saya lapar"));

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
        Dialog myDialog = new Dialog(this);
        Button tambahkanpesanButton = findViewById(R.id.tambahkanpesan_button);
        tambahkanpesanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.setContentView(R.layout.activity_tambah_pesan_pop_up);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
                //               Toast.makeText(getApplicationContext(), "Pasien berhasil ditambahkan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}