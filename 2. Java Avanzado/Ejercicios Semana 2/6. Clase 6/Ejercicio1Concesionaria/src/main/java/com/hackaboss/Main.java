package com.hackaboss;

public class Main {
    public static void main(String[] args) {


        InventarioAutos<Auto> creandoAuto = new InventarioAutos<>();
        creandoAuto.agregarAuto(new Auto("Ford", "Focus", 2020, 16000));
        creandoAuto.agregarAuto(new Auto("Mercedes", "C220", 2022, 36000));
        creandoAuto.agregarAuto(new Auto("Audi", "A5", 2021, 32500));
        creandoAuto.agregarAuto(new Auto("Toyota", "Corolla", 2018, 13000));
        creandoAuto.agregarAuto(new Auto("Ford", "Fiesta", 2023, 18000));
        creandoAuto.agregarAuto(new Auto("Opel", "Corsa", 2020, 15000));
        creandoAuto.agregarAuto(new Auto("Peuget", "2008", 2021, 16000));

        System.out.println("-----------------------------------");
        double total = creandoAuto.calcularTotal();
        System.out.println(total);

        System.out.println("-----------------------------------");
        creandoAuto.buscarAutoMarca("Ford");

        System.out.println("-----------------------------------");
        creandoAuto.buscarAutoPrecio(16000);
    }
}