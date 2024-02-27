package com.hackaboss;

public class Camiseta extends Vestimenta {

    private String manga, cuello;

    public Camiseta() {
    }

    public Camiseta(Integer codigo, Integer talla, String nombre, String marca, String color, double precio, String manga, String cuello) {
        super(codigo, talla, nombre, marca, color, precio);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public String getCuello() {
        return cuello;
    }

@Override
    public String mostrarSms () {
        return "Esta camiseta es de marca: " + manga;
}

}
