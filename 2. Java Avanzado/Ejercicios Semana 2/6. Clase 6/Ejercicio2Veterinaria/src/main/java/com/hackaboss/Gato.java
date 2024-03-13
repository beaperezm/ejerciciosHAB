package com.hackaboss;

public class Gato extends Mascota {

    private double peso;

    public Gato(Object id, Object nombre, Object edad, Object especie, double peso) {
        super(id, nombre, edad, especie);
        this.peso = peso;
    }

    public Gato() {

    }

    public Gato(Object nombre) {
        super(nombre);
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " peso='" + peso + '\'' +
                "} ";
    }
}
