package com.hackaboss;


public abstract class Vehiculo {

    protected int id;
    protected double costo;
    protected String marca, placa, modelo;
    protected int anio;


    protected Vehiculo() {
    }

    protected Vehiculo(int id, double costo, String marca, String placa, String modelo, int anio) {
        this.id = id;
        this.costo = costo;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }


    public double getCosto() {
        return costo;
    }


    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }


    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }


    public abstract int calcularAntiguedad();


}
