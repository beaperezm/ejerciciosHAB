package com.hackaboss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InventarioException {

        Scanner sc = new Scanner(System.in);
        Inventario producto = new Inventario();
        ingresarProductos(sc, producto);
    }

    public static void ingresarProductos(Scanner sc, Inventario producto) throws InventarioException{
        try {
            System.out.println("1. Introducir nombre: ");
            String nombreP = sc.next();
            System.out.println("2. Introducir precio: ");
            double precio = sc.nextDouble();
            System.out.println("3. Introducir cantidad: ");
            int cantidad = sc.nextInt();
            new Inventario(nombreP, precio, cantidad);
        } catch (InventarioException i) {
            System.out.println("No se ha podido dar de alta el producto: " + i.getMessage());
        } catch (InputMismatchException in) {
            System.out.println("Dato introducido incorrecto, tiene que ser un número");
        }

    }
}