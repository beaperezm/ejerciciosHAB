package com.hackaboss;

public class Usuario {

    private String nombre;
    private String destino;
    private int dia;
    private int mes;
    private int numeroAsientosDeseados;

    public Usuario() {
    }

    public Usuario(String nombre, String destino, int dia, int mes, int numeroAsientosDeseados) throws ReservaInvalidaException {
        this.nombre = nombre;
        this.destino = destino;
        this.dia = dia;
        this.mes = mes;
        this.numeroAsientosDeseados = numeroAsientosDeseados;
        if (this.dia >= 1 && this.dia <= 31) {
            if (this.mes >= 1 && this.mes <= 12) {
                if (this.numeroAsientosDeseados >= 1 && this.numeroAsientosDeseados <= 8) {
                    System.out.println("** Datos introducidos correctamente **");
                } else {
                    throw new ReservaInvalidaException("el mínimo número de asientos para reservar es 1 y el máximo 8");
                }
            } else {
                throw new ReservaInvalidaException("el mes introducido es incorrecto , el mínimo es 1 y máximo 12");
            }
        } else {
            throw new ReservaInvalidaException("el día introducido es incorrecto , el mínimo es 1 y máximo 31");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getNumeroAsientosDeseados() {
        return this.numeroAsientosDeseados;
    }

    public void setNumeroAsientosDeseados(int numeroAsientosDeseados) {
        this.numeroAsientosDeseados = numeroAsientosDeseados;
    }
}
