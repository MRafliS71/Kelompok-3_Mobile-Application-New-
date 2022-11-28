package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class LogInKerabatActivity extends AppCompatActivity {

    TextInputEditText editTextUsername, editTextPassword;
    private Button masukButton;
    private TextView buatAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_log_in_kerabat);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        masukButton = findViewById(R.id.masukButton);
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = String.valueOf(editTextUsername.getText());
                password = String.valueOf(editTextPassword.getText());

//                if(!username.equals("") && !password.equals("")) {
//                    Handler handler = new Handler(Looper.getMainLooper());
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            //Starting Write and Read data with URL
//                            //Creating array for parameters
//                            String[] field = new String[2];
//                            field[0] = "username";
//                            field[1] = "password";
//                            //Creating array for data
//                            String[] data = new String[2];
//                            data[0] = username;
//                            data[1] = password;
//                            PutData putData = new PutData("http://192.168.119.70/mobappproject/akunKerabat/login.php", "POST", field, data);
//                            if (putData.startPut()) {
//                                if (putData.onComplete()) {
//                                    String result = putData.getResult();
//                                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
//                                    if(result.equals("Login Success")){
//                                        //Set agar tombol bisa diklik dan pindah page
//
//                                    }
//                                }
//                            }
//                            //End Write and Read data with URL
//                        }
//                    });
//                }else{
//                    Toast.makeText(getApplicationContext(), "Email atau Password Salah", Toast.LENGTH_SHORT).show();
//                }
                Intent myIntent = new Intent(LogInKerabatActivity.this, MainpageKerabatActivity.class);
                LogInKerabatActivity.this.startActivity(myIntent);
            }
        });

        buatAkun = findViewById(R.id.BuatAkun);
        buatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LogInKerabatActivity.this, SignInKerabatActivity.class);
                LogInKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}