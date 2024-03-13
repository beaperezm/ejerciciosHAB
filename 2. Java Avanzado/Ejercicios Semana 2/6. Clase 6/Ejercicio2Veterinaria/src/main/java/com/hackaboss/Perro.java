package com.hackaboss;

public class Perro extends Mascota {

    private String color;

    public Perro(Object id, Object nombre, Object edad, Object especie, String color) {
        super(id, nombre, edad, especie);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " color='" + color + '\'' +
                "} ";
    }
}
