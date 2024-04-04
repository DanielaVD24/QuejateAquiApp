package com.danidatos.quejateaquiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PublicacionesActivity extends AppCompatActivity {

    ArrayList<Publicacion> datos;
    RecyclerView recyclerView;
    ImageView crearQueja;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_publicaciones);

        queja();

        datos = new ArrayList<Publicacion>();
        llenar();

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorPublicaciones adaptadorPublicaciones = new AdaptadorPublicaciones(datos);
        recyclerView.setAdapter(adaptadorPublicaciones);
    }

    private void queja(){
        crearQueja = findViewById(R.id.plus);
        crearQueja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PublicacionesActivity.this, CrearQueja.class);
                startActivity(intent);
            }
        });
    }

    public void llenar(){
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
        datos.add(new Publicacion("Titulo", "Esta es la descripcion donde la gente escribira sus quejas hacer de la ciudad donde se encuentren", R.drawable.logoquejate));
    }
}
