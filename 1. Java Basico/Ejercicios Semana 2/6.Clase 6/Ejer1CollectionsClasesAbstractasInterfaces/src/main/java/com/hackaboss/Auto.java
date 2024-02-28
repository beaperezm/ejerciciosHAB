package com.hackaboss;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria, autonomia;

    public Auto() {
    }

    public Auto(int id, double costo, String marca, String placa, String modelo, int anio, int capacidadBateria, int autonomia) {
        super(id, costo, marca, placa, modelo, anio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }


    public int getAutonomia() {
        return autonomia;
    }


    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía");

    }

    @Override
    public int calcularAntiguedad() {
        Calendar c = new GregorianCalendar();
        int anioActual = c.get(Calendar.YEAR);
        int antiguedad = anioActual - anio;
        return antiguedad;
    }
}
