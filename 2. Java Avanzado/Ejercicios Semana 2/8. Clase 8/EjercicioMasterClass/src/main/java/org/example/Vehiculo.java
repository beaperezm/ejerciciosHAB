package org.example;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int costo;

    private List<Vehiculo> vehiculos;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.vehiculos = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", costo=" + costo +
                '}';
    }
}
