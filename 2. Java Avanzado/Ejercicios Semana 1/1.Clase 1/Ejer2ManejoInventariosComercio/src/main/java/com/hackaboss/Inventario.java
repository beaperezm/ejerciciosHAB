package com.hackaboss;

public class Inventario {

    private String nombreProducto;
    private double precio;
    private int cantidadDisponible;

    public Inventario() {
    }

    public Inventario(String nombreProducto, double precio, int cantidadDisponible) throws InventarioException {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;

        if(nombreProducto.length() < 4) {
            throw new InventarioException("la longitud del nombre es incorrecta, tiene que contener al menos 4 caracteres");
        } else if (precio < 0.0) {
            throw new InventarioException("el precio es incorrecto, no puede ser 0");
        } else if (cantidadDisponible < 0) {
            throw new InventarioException("la cantidad es incorrecta, no puede ser menor a 0");
        } else {
            System.out.println("Producto dado de alta correctamente");
        }
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
