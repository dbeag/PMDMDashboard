package com.diegob.a6_dashboard.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Disco implements Serializable {
    private String nombre;
    private String artista;
    private Integer lanzamiento;
    private int image;

    public Disco(String nombre, String artista, int lanzamiento, int image) {
        this.nombre = nombre;
        this.artista = artista;
        this.lanzamiento = lanzamiento;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getLanzamiento() {
        return lanzamiento;
    }

    public int getImage() {
        return image;
    }
}
