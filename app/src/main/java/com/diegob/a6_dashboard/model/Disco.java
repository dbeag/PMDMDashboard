package com.diegob.a6_dashboard.model;

import java.util.ArrayList;

public class Disco {
    private String nombre;
    private String artista;
    private String imageUrl;

    public Disco(String nombre, String artista, String imageUrl) {
        this.nombre = nombre;
        this.artista = artista;
        this.imageUrl = imageUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
