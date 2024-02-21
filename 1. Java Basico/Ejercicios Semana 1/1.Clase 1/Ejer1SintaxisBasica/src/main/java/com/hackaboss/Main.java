package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1- Escibir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario

        System.out.println("Hola, bienvenido al sistema");

       // 2- Permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje

        String name = "Eduardo";
        System.out.println("Hola " + name + " bienvenido al sistema");

        //con la clase Scanner
        String name2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        name2 = sc.nextLine();

        System.out.println("Hola " + name2 + " bienvenido al sistema");

    }
}