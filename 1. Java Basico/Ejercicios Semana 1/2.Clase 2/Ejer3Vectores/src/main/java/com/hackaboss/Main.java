package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
        calcule la temperatura máxima promedio que hubo.
        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
         Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
         */


        Scanner sc = new Scanner(System.in);
        int[] temperaturas = new int[7];
        double promedio = 0;
        int suma = 0;
        int contador = 0;

        for(int i= 0; i < temperaturas.length; i++){
            System.out.println("Introduzca la temperatura " + (i+1) + ":");
            temperaturas[i] = sc.nextInt();
            suma += temperaturas[i];
            contador++;
            promedio = (double) suma / contador;
        }

        System.out.println("El promedio de las temperaturas es: " + Math.round(promedio * 100d) / 100d);
    }
}