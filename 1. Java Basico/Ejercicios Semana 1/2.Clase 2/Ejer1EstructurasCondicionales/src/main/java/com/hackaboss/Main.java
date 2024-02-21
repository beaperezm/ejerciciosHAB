package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*  Un recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
            a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no
            ingresar al evento.
          El programa debe mostrar (según cada caso) un mensaje informando la situación.
         */

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("Introduzca su edad: ");
        age = sc.nextInt();

        if(age > 18) {
            System.out.println("Bienvenido/a al recital!");
        } else {
            System.out.println("Lo sentimos pero para poder formar parte del recital tiene que ser mayor de 18 años");
        }


    }
}