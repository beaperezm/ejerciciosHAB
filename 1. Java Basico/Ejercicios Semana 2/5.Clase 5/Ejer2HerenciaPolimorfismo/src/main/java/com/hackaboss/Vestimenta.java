package com.hackaboss;

public class Vestimenta {

    private Integer codigo, talla;
    private String nombre, marca, color;
    private double precio;

    public Vestimenta() {
    }

    public Vestimenta(Integer codigo, Integer talla, String nombre, String marca, String color, double precio) {
        this.codigo = codigo;
        this.talla = talla;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }


    public Integer getTalla() {
        return talla;
    }


    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarSms () {
        return "Estoy en Vestimenta";

    }


}
