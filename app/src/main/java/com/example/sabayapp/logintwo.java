package com.example.sabayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class logintwo extends AppCompatActivity {

    TextInputEditText txtFirstName, txtMiddleName, txtLastName, txtContactNumber, txtBarangay, txtCity, txtProvince;
    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logintwo);

        txtFirstName=findViewById(R.id.txtFirstName);
        txtMiddleName=findViewById(R.id.txtMiddleName);
        txtLastName=findViewById(R.id.txtLastName);
        txtContactNumber=findViewById(R.id.txtContactNumber);
        txtBarangay=findViewById(R.id.txtBarangay);
        txtCity=findViewById(R.id.txtCity);
        txtProvince=findViewById(R.id.txtProvince);
        btnNext1=findViewById(R.id.btnNext1);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loginthree.class);
                startActivity(intent);
                finish();
            }
        });
    }
}