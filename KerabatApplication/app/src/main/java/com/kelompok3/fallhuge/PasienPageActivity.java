package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PasienPageActivity extends AppCompatActivity implements InterfacePasien{

    List<ClassPasien> pasien = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasien_page);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvPasien);

//        public List<ClassPasien> pasien = new ArrayList<>();
        pasien.add(new ClassPasien("Gordon Ramsey", R.drawable.user));
        pasien.add(new ClassPasien("Ronaldo", R.drawable.ppexample));
        pasien.add(new ClassPasien("Mas Juki", R.drawable.ppexample));
        pasien.add(new ClassPasien("Kelompok 3 MobApp", R.drawable.user));
        pasien.add(new ClassPasien("Kece banget", R.drawable.user));
        pasien.add(new ClassPasien("Mantap pisan brow", R.drawable.ppexample));
        pasien.add(new ClassPasien("Mantap pisan brow", R.drawable.ppexample));
        pasien.add(new ClassPasien("Mantap pisan brow", R.drawable.user));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterPasien(getApplicationContext(),pasien, this));

        ImageButton backButtonPatient = findViewById(R.id.back_buttonPatient);
        backButtonPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(PasienPageActivity.this, MainpageKerabatActivity.class);
//                PasienPageActivity.this.startActivity(myIntent);
            }
        });

        Dialog myDialog = new Dialog(this);
        Button tambahPasien = findViewById(R.id.tambahpasien_Button);
        tambahPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.setContentView(R.layout.activity_tambah_pasien_pop_up);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
 //               Toast.makeText(getApplicationContext(), "Pasien berhasil ditambahkan", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(PasienPageActivity.this, ProfilePatientPageActivity.class);

        intent.putExtra("NAME", pasien.get(position).getNamePasien());
        intent.putExtra("ProfilePicture", pasien.get(position).getPpPasien());

        startActivity(intent);
    }
}