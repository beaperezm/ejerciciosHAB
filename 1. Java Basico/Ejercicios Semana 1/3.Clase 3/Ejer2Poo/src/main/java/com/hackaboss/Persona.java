package com.hackaboss;

public class Persona {

    int id, edad, numeroTelefono;
    String nombre, direccion;

    public Persona(int id, int edad, int numeroTelefono, String nombre, String direccion) {
        this.id = id;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
