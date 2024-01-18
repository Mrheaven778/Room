package com.company.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity

public class Elemento {
    String nombre;
    String descripcion;
    float valoracion;
    @PrimaryKey(autoGenerate = true)
    int id;
    public Elemento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
