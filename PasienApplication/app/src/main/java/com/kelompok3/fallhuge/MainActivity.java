package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

//    public void bSapaClick(View v) {
//        //ambil komponen text dan label
//        EditText etNama = (EditText) findViewById(R.id.etNama);
//        TextView tvSalam = (TextView) findViewById(R.id.tvHelloNama);
//        //ambil masukkan dari user
//        String nama = etNama.getText().toString();
//        //tulis di label
//        tvSalam.setText("Halo " + nama + " senang bertemu dengan anda");
//    }

}

