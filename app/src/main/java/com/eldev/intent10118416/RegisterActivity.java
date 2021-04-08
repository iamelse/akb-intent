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

public class RegisterActivity extends AppCompatActivity {
    TextView button;
    Button btnIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button = (TextView) findViewById(R.id.signInTv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        btnIn = (Button) findViewById(R.id.btnSignUp);
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
