package com.example.aplicacion01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void operaciones(View view) {
        Intent ioperaciones = new Intent (MainActivity.this,operaciones.class);
        startActivity(ioperaciones);
    }
    public void salud(View view) {
        Intent isalud = new Intent (MainActivity.this,salud.class);
        startActivity(isalud);
    }
    public void salir(View view) {
        finish();
        }
    }
