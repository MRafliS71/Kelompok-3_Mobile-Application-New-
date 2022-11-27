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

public class SignInPasienActivity extends AppCompatActivity {

    TextInputEditText editTextUsername, editTextFirstname, editTextLastname, editTextEmail, editTextPassword;
    private Button buatakunButton;
    private TextView masukDisini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_in_pasien);

        editTextUsername = findViewById(R.id.editTextTextUsername);
        editTextFirstname = findViewById(R.id.editTextTextFirstname);
        editTextLastname = findViewById(R.id.editTextTextLastname);
        editTextEmail = findViewById(R.id.editTextTextEmail);
        editTextPassword = findViewById(R.id.editTextTextPassword);

        buatakunButton = findViewById(R.id.buatakunButton);
        buatakunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {String username, firstname, lastname, email, password;
                username = String.valueOf(editTextUsername.getText());
                firstname = String.valueOf(editTextFirstname.getText());
                lastname = String.valueOf(editTextLastname.getText());
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());

                if(!username.equals("") && !firstname.equals("") && !lastname.equals("") && !email.equals("") && !password.equals("")) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[5];
                            field[0] = "username";
                            field[1] = "firstname";
                            field[2] = "lastname";
                            field[3] = "email";
                            field[4] = "password";
                            //Creating array for data
                            String[] data = new String[5];
                            data[0] = username;
                            data[1] = firstname;
                            data[2] = lastname;
                            data[3] = email;
                            data[4] = password;
                            PutData putData = new PutData("http://192.168.119.70/mobappproject/akunPasien/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                    if(result.equals("Sign Up Success")){
                                        //Set agar tombol bisa diklik dan pindah page
                                        Intent myIntent = new Intent(SignInPasienActivity.this, MainPagePatientActivity.class);
                                        SignInPasienActivity.this.startActivity(myIntent);
                                    }
                                }
                            }
                            //End Write and Read data with URL
                        }
                    });
                }else{
                    Toast.makeText(getApplicationContext(), "Harap isis seluruh kolom yang tersedia", Toast.LENGTH_SHORT).show();
                }
            }
        });

        masukDisini = findViewById(R.id.MasukDisini);
        masukDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SignInPasienActivity.this, LogInActivity.class);
                SignInPasienActivity.this.startActivity(myIntent);
            }
        });
    }
}