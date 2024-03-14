package com.hackaboss;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private int id;
    private String nombre;
    List<Directorio> subdirectorios;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
    }

    public Directorio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }


    @Override
    public String toString() {
        return   "nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios +
                '}';
    }
}
