package com.hackaboss;

public class Mascota<T> {
    private T id;
    private T nombre;
    private T edad;
    private T especie;

    public Mascota(T id, T nombre, T edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
public Mascota() {

}

    public Mascota(T nombre) {
        this.nombre = nombre;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getEdad() {
        return edad;
    }

    public void setEdad(T edad) {
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
        return '{' +
                "id=" + id +
                ", nombre=" + nombre +
                ", edad=" + edad +
                ", especie=" + especie;
    }
}
