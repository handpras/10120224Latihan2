package com.example.a10120224latihan2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

//29 April 2023
//Hanung Dwi Prasetyo
//10120224
//IF 6

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btnRegister(View view){
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
    }
}