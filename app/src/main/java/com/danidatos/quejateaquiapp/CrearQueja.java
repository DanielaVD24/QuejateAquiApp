package com.danidatos.quejateaquiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CrearQueja extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_crear_queja);

        Spinner spinner = findViewById(R.id.spinner);
        // Crea una lista de elementos para el menú desplegable
                List<String> opciones = new ArrayList<>();
                opciones.add("Opción 1");
                opciones.add("Opción 2");
                opciones.add("Opción 3");
        // Crea un adaptador para el Spinner
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        // Especifica el diseño para los elementos desplegables
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Asigna el adaptador al Spinner
                spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Maneja la selección del elemento
                String opcionSeleccionada = opciones.get(position);
                // Puedes realizar acciones según la opción seleccionada
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Opcionalmente, maneja el caso en que no se seleccione ningún elemento
            }
        });
    }
}
