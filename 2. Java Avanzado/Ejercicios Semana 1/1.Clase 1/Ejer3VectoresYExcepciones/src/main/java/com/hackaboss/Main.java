package com.hackaboss;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Juan", "López", 25);
        clientes[1] = new Cliente("Raquel", "Pérez", 35);
        clientes[2] = new Cliente("Almudena", "Martín", 18);
        clientes[3] = new Cliente("Daniela", "García", 20);
        clientes[4] = new Cliente("Carlos", "Alvarez", 28);

        try {
            for (int i = 0; i < clientes.length; i++) {
                System.out.println("El nombre del cliente es: " + clientes[6].getNombre());
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("** Estás intentando acceder a una posición inválida en el vector **");
        }
    }
}