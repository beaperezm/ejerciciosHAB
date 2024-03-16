package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950)
        );


        //Ordenando lista por precios de menor a mayor
      List<Vehiculo> ordenandoPecio = vehiculos.stream()
                .sorted(Comparator.comparingInt(Vehiculo::getCosto))
                .toList();
      ordenandoPecio.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------");

        //Ordenando por Marca y por Precio
       List<Vehiculo> ordenandoMarcaYPrecio = vehiculos.stream()
               .sorted(Comparator.comparing(Vehiculo::getMarca)
                       .thenComparingInt(Vehiculo::getCosto))
               .toList();
       ordenandoMarcaYPrecio.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------");

        Predicate<Vehiculo> precioNoMayor1000 = p -> p.getCosto() < 1000;
        Predicate<Vehiculo> precioMayorOIgual1000 = p -> p.getCosto() >=1000;

        List<Vehiculo> noMayor1000 = vehiculos.stream()
                .filter(precioNoMayor1000)
                .toList();
        System.out.println("**   VEHÍCULOS CON PRECIO INFERIOR A 1000   **\n");
        noMayor1000.forEach(System.out::println);

        System.out.println("\n=========================================================\n");

        List<Vehiculo> mayorOIgual1000 = vehiculos.stream()
                .filter(precioMayorOIgual1000)
                .toList();
        System.out.println("**   VEHÍCULOS CON PRECIO MAYOR O IGUAL A 1000   **\n");
        mayorOIgual1000.forEach(System.out::println);

        System.out.println("\n=========================================================\n");

        double promedio = vehiculos.stream()
                .mapToInt(p -> p.getCosto())
                .average()
                .orElse(0.0);
        System.out.println("El promedio total de precios de toda la lista de vehículos es: " + Math.floor(promedio*100)/100);



    }
}