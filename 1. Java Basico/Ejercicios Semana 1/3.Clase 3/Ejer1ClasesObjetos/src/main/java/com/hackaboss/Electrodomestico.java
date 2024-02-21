package com.hackaboss;

public class Electrodomestico {

    private int cod, consumo;
    private String marca, modelo, color;


    public Electrodomestico (int cod, int consumo, String marca, String modelo, String color) {
        this.cod = cod;
        this.consumo = consumo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public Electrodomestico () {

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo() {
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo() {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }


}
