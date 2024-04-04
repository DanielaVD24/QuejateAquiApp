package com.danidatos.quejateaquiapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPublicaciones extends RecyclerView.Adapter<AdaptadorPublicaciones.ViewHolderDatos> {
    ArrayList<Publicacion> datos;

    public AdaptadorPublicaciones(ArrayList<Publicacion> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.publicacion, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.titulo.setText(datos.get(position).getTitulo());
        holder.descripcion.setText(datos.get(position).getDescripcion());
        holder.foto.setImageResource(datos.get(position).getFotografia());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView titulo, descripcion;
        ImageView foto;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tituloCard);
            descripcion = itemView.findViewById(R.id.idDescripcion);
            foto = itemView.findViewById(R.id.idImagen);
        }
    }
}
