package com.hackaboss;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;


    public Moto() {
    }

    public Moto(int id, double costo, String marca, String placa, String modelo, int anio, int cilindrada, String tipoMotor) {
        super(id, costo, marca, placa, modelo, anio);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }


    public String getTipoMotor() {
        return tipoMotor;
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
