package com.eldev.intent10118416;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 Nama               : Lana Septiana
 NIM                : 10118416
 Kelas              : IF10
 Tanggal Pengerjaan : 7 Apr 2021
 **/

public class DashActivity extends AppCompatActivity {
    Button btnOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOut = (Button) findViewById(R.id.btnSignOut);
        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutActivity();
            }
        });
    }
    public void logoutActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
