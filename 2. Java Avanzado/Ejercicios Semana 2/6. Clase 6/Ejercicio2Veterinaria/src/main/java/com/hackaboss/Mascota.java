package com.hackaboss;

public class Mascota<T> {
    private int id;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(int id, String nombre, int edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
public Mascota() {

}

    public Mascota(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public T getEspecie() {
        return especie;
    }

    public void setEspecie(T especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", edad=" + edad +
                ", especie=" + especie + '}';
    }
}
