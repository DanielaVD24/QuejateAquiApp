package com.danidatos.quejateaquiapp;

public class Publicacion {
    String titulo;
    String descripcion;
    int fotografia;

    public Publicacion(){

    }

    public Publicacion(String titulo, String descripcion, int fotografia) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotografia() {
        return fotografia;
    }

    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }
}
