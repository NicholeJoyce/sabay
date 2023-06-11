package com.example.sabayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class loginfour extends AppCompatActivity {
    TextInputEditText txtUsername, txtEmailCred, txtPassword, txtConfirmPassword;
    Button btnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfour);

        txtUsername=findViewById(R.id.txtUsername);
        txtEmailCred=findViewById(R.id.txtEmailCred);
        txtPassword=findViewById(R.id.txtPassword);
        txtConfirmPassword=findViewById(R.id.txtConfirmPassword);
        btnNext3=findViewById(R.id.btnNext3);

        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loginfour.class);
                startActivity(intent);
                finish();
            }
        });
    }
}