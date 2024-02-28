package com.hackaboss;

public class Producto {

    private int codigo, cantidadStock;
    private String nombre, marca, tipo;
    private double precioCosto, precioVenta;

    public Producto() {
    }

    public Producto(int codigo, int cantidadStock, String nombre, String marca, String tipo, double precioCosto, double precioVenta) {
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }


    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    public double getPrecioCosto() {
        return precioCosto;
    }


    public double getPrecioVenta() {
        return precioVenta;
    }


    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                ", cantidadStock=" + cantidadStock +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                '}' + "\n";
    }
}
