package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Pedir al usuario que ingrese dos números enteros y realice suma, resta multiplicacion y division
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        result = num1 + num2;
        System.out.println("El resultado de la suma es: " + result);

        result = num1 - num2;
        System.out.println("El resultado de la resta es: " + result);

        result = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + result);

        //Si el usuario pone un 0 como segundo número da error
        //result = num1 / num2;
        //System.out.println("El resultado de la división es: " + result);

        //SI el segundo número es igual a 0 --> en la divisón sale un Exception - he creado un if y de esta forma no sale el error

        if(num2 == 0) {
           result = num2 / num1;
            System.out.println("El resultado de la división es: " + result);
        }
        else {
           result = num1 / num2;
            System.out.println("El resultado de la división es: " + result);
        }

    }
}