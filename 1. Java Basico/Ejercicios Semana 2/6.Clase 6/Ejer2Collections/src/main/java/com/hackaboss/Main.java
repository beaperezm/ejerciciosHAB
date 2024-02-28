package com.hackaboss;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Producto> productos = new ArrayList<Producto>();
        double obtenerMayorPrecio = 0.0;
        double obtenerMenorPrecio = 10000.0;
        int obtenerMayorStock = -1, resta = 0;

        Producto p;

        // a) y b) Creando 10 objetos de tipo Producto y guardándolos en el ArrayList:

        p = new Producto(1, 10, "teléfono", "Apple", "i15", 500.5, 800.5);
        productos.add(p);
        p = new Producto(2, 5, "laptop", "Asus", "ZenBook", 1000, 2500);
        productos.add(p);
        p = new Producto(3, 15, "tablet", "Samsung", "Galaxy", 700, 900);
        productos.add(p);
        p = new Producto(4, 2, "teléfono", "Samsung", "Galaxy", 800, 1200);
        productos.add(p);
        p = new Producto(5, 30, "laptop", "Hp", "HP530", 1200, 2000);
        productos.add(p);
        p = new Producto(6, 1, "teléfono", "Xiaomi", "Note13", 100, 386.94);
        productos.add(p);
        p = new Producto(7, 4, "televisor", "Samsung", "Crystal UltraHD", 200, 309.99);
        productos.add(p);
        p = new Producto(8, 25, "televisor", "Philips", "LED UltraHD", 250, 349.99);
        productos.add(p);
        p = new Producto(9, 9, "monitor", "AOC", "LED FullHD", 80, 227);
        productos.add(p);
        p = new Producto(10, 8, "torre", "Hm System Corus", "C7 e Intel Core i7", 300, 612.24);
        productos.add(p);




        // c) Determinar el producto con el mayor precio
        for(Producto productosB: productos) {
            if(productosB.getPrecioVenta() > obtenerMayorPrecio) {
                obtenerMayorPrecio = productosB.getPrecioVenta();
            }
        }
        System.out.println("El mayor precio de venta es: " + obtenerMayorPrecio);


        // d) Determinar el producto con el menor precio
        for(Producto productosB: productos) {
            if(productosB.getPrecioCosto() < obtenerMenorPrecio) {
                obtenerMenorPrecio = productosB.getPrecioCosto();
            }
        }
        System.out.println("El menor precio de costo es: " + obtenerMenorPrecio);


        System.out.println("--------------------------------------------------------------");

        // e) Borrando el producto que se encuentra en la posición 5:

        System.out.println("El listado de los productos antes de borrar es: " + "\n" + productos);

        System.out.println("El producto borrado es: " + "\n" + productos.remove(4));

        System.out.println("El listado de los productos después de borrar es: " + "\n" + productos);

        System.out.println("----------------------------------------------------------------------------------------");

        /*
              f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades de stock y actualizar
              el registro en la lista en base a eso:
        */

        for(Producto productosB: productos) {
            if(productosB.getCantidadStock() > obtenerMayorStock) {
                obtenerMayorStock = productosB.getCantidadStock();
                resta = obtenerMayorStock - 3;
                productosB.setCantidadStock(resta);
            }
        }

        System.out.println("El producto con más stock tiene: " + obtenerMayorStock + " productos");
        System.out.println("Ahora el producto que tenía más stock tiene: " + resta + " productos ");

        System.out.println("La nueva lista es: " + "\n" + productos);


    }
}