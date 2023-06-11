package com.example.sabayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class loginthree extends AppCompatActivity {

    TextInputEditText txtIDtype, txtIDnumber;
    Button btnNext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginthree);

        txtIDnumber=findViewById(R.id.txtIDnumber);
        txtIDnumber=findViewById(R.id.txtIDnumber);
        btnNext2=findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loginfour.class);
                startActivity(intent);
                finish();
            }
        });

    }
}