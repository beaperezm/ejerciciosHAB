package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Imagina que eres un cajero en un supermercado.
           Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
           Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
           Luego, muestra el total de la compra que debe abonar.
         */

        Scanner sc = new Scanner(System.in);
        double precio = 0;
        double suma = 0;
        boolean precioIncorrecto = false;

        System.out.println("Introducir los precios. Poner 0 para salir de la aplicación");

        while(!precioIncorrecto) {
            System.out.println("Introduzca un precio: ");
            precio = sc.nextDouble();

            if (precio  == 0) {
                precioIncorrecto = true;
            }
            suma += precio;

        }
        System.out.println("El total de la compra es: " + Math.round(suma *100d) / 100d);
        System.out.println("¡Hasta pronto!");

    }
}