package com.hackaboss;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Camioneta extends Vehiculo implements Combustion {

    private double capacidadTanque, consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int id, double costo, String marca, String placa, String modelo, int anio, double capacidadTanque, double consumoCombustible) {
        super(id, costo, marca, placa, modelo, anio);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }


    public double getConsumoCombustible() {
        return consumoCombustible;
    }


    @Override
    public int calcularAntiguedad() {
        Calendar c = new GregorianCalendar();
        int anioActual = c.get(Calendar.YEAR);
        int antiguedad = anioActual - anio;
        return antiguedad;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible");

    }
}
