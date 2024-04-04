package com.danidatos.quejateaquiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button crearcuenta;
    Button iniciar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = findViewById(R.id.button2);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPantallaPublicaciones();
            }
        });


        crearcuenta = findViewById(R.id.btnCrear);
        crearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPantallaCrearCuenta();
            }
        });
    }

    private void abrirPantallaCrearCuenta(){
        Intent intent = new Intent(MainActivity.this, CrearCuentaActivity.class);
        startActivity(intent);
    }

    private void abrirPantallaPublicaciones(){
        Intent intent = new Intent(MainActivity.this, PublicacionesActivity.class);
        startActivity(intent);
    }
}