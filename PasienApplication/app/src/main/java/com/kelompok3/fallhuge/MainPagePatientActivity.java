package com.kelompok3.fallhuge;

import static java.lang.Math.sqrt;

import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainPagePatientActivity extends AppCompatActivity implements SensorEventListener {

    private ImageButton pesanButton, kerabatButton, accountButton, bantuanButton, notifikasiButton;
    private Button buttonFallSimulation;
    AlertDialog dialog;

    //======== Variable Sensor Section ==========
    private SensorManager sm;
    private Sensor senAccel;
    private TextView tvHasil;
    private boolean isJatuh;

    @Override
    public void onBackPressed() {
        dialog.show(); // memanggil fungsi dialog alert yang sudah dibuat jika user mengklik tombol back pada Main Page
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_patient);
        getSupportActionBar().hide();

        // deklarasi AertDialog, yang akan mematikan system aplikasi jika user inginkeluar
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benarkah anda ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        dialog = builder.create();

        buttonFallSimulation = findViewById(R.id.buttonFallSimulation);
        buttonFallSimulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, PopUpFallDetection.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        pesanButton = findViewById(R.id.pesanButton);
        pesanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, MessagePageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        kerabatButton = findViewById(R.id.kerabatButton);
        kerabatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, KerabatPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        notifikasiButton = findViewById(R.id.notifikasiButton);
        notifikasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, NotificationPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        accountButton = findViewById(R.id.accountButton);
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, AccountPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        bantuanButton = findViewById(R.id.bantuanButton);
        bantuanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, PopUpHelpButton.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        // =========TES SENCOR SECTION===========
        String TAG = "sensor_tes";

        //cek apakah sensor tersedia
        sm = (SensorManager)    getSystemService(getApplicationContext().SENSOR_SERVICE);
        senAccel = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (senAccel != null){
            Log.d(TAG,"Sukses, device punya sensor accelerometer!");
        }
        else {
            // gagal, tidak ada sensor accelerometer.
            Log.d(TAG,"Tidak ada sensor accelerometer!");
        }

        tvHasil = findViewById(R.id.tvHasil);
    }

    // Fungsi perubahan pergerakan sensor
    public void onSensorChanged(SensorEvent sensorEvent) {
        double ax=0,ay=0,az=0;
        double ac=0;
        // menangkap perubahan nilai sensor
        if (sensorEvent.sensor.getType()==Sensor.TYPE_ACCELEROMETER) {
            ax=sensorEvent.values[0];
            ay=sensorEvent.values[1];
            az=sensorEvent.values[2];
        }
        //Rumus akselerasi
        ac = sqrt(az*az+ax*ax+ay*ay);
        //jika akselerasi melebihi 20 maka terdeteksi jatuh
        if  (ac>=20) {
            isJatuh = true;
        }
        //jika jatuh bernilai true maka akan menampilkan page pop up
        if (isJatuh) {
            Intent myIntent = new Intent(MainPagePatientActivity.this, PopUpFallDetection.class);
            MainPagePatientActivity.this.startActivity(myIntent);
        } else{
            long timestamp = System.currentTimeMillis();
            // Menampilkan log dari accelerometer beserta timestamp
            String msg = "X: " + ax + ", Y: " + ay + ", Z: " + az + ", Timestamp: " + timestamp + ", Acceleration: " + ac;
            Log.d("sensor_tes", msg);
            //tvHasil.setText(msg);
        }
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }


    @Override
    protected void onPause() {
        super.onPause();
        sm.unregisterListener(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        sm.registerListener(this, senAccel, SensorManager.SENSOR_DELAY_NORMAL);
    }

}