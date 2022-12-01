package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class EditAkunPasienActivity extends AppCompatActivity {

    private Button doneButton;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_akun_pasien);
        getSupportActionBar().hide();

        doneButton = findViewById(R.id.done_Button);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(EditAkunPasienActivity.this, ProfilePatientPageActivity.class);
                EditAkunPasienActivity.this.startActivity(myIntent);
                Toast.makeText(getApplicationContext(), "Ceritanya akun berhasil di edit", Toast.LENGTH_SHORT).show();
            }
        });

        backButton = findViewById(R.id.backButtonEditAkunPasien);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Intent myIntent = new Intent(EditAccountPatientActivity.this, AccountPatientPageActivity.class);
//                EditAccountPatientActivity.this.startActivity(myIntent);
            }
        });
    }
}