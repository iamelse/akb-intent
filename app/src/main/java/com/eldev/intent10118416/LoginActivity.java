package com.eldev.intent10118416;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 Nama               : Lana Septiana
 NIM                : 10118416
 Kelas              : IF10
 Tanggal Pengerjaan : 7 Apr 2021
 **/

public class LoginActivity extends AppCompatActivity {
    TextView button;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (TextView) findViewById(R.id.signUpTv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        btn = (Button) findViewById(R.id.btnSignIn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    public void dashActivity(){
        Intent intent = new Intent(this, DashActivity.class);
        startActivity(intent);
    }

}


