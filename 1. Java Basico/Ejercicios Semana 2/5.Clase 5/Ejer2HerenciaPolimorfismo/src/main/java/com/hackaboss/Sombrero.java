package com.hackaboss;

public class Sombrero extends  Vestimenta {

    private String tipo, tamanio;

    public Sombrero() {
    }

    public Sombrero(Integer codigo, Integer talla, String nombre, String marca, String color, double precio, String tipo, String tamanio) {
        super(codigo, talla, nombre, marca, color, precio);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }


    public String getTamanio() {
        return tamanio;
    }

@Override
    public String mostrarSms () {
        return "Este sombrero son de marca: " + tipo;
}

}
