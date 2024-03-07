package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ReservaInvalidaException {

        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        reservarVuelos(sc, user);
    }

    public static void reservarVuelos(Scanner sc, Usuario user) throws ReservaInvalidaException {
        try {
            System.out.println("1. Introducir nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("2. Introducir destino: ");
            String destino = sc.nextLine();
            System.out.println("3. Introducir día del viaje: ");
            int dia = sc.nextInt();
            System.out.println("3. Introducir mes del viaje: ");
            int mes = sc.nextInt();
            System.out.println("4. Introducir número de asientos deseados: ");
            int numAsientos = sc.nextInt();
            new Usuario(nombre, destino, dia, mes, numAsientos);
        } catch (ReservaInvalidaException var7) {
            System.out.println("No se ha podido dar de alta al usuario: " + var7.getMessage());
        }

    }

}