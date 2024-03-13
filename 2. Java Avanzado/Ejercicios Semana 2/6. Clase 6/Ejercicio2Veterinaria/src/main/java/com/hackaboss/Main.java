package com.hackaboss;

import java.util.Random;

public class Main {
    public static void main(String[] args) {



        RegistroMascotas<Perro> registroPerro = new RegistroMascotas<>();
        registroPerro.agregarMascota(new Perro(1, "Rayo", 5, "San Bernardo", "Marrón"));
        registroPerro.agregarMascota(new Perro(2, "Peter", 7, "Caniche Toy", "Marrón"));
        registroPerro.agregarMascota(new Perro(3, "Can", 9, "Bulldog francés", "Blanco y negro"));
        registroPerro.agregarMascota(new Perro(4, "Beater", 12, "Beagle", "Marrón y blanco"));


        RegistroMascotas<Gato> registroGato = new RegistroMascotas<>();
        registroGato.agregarMascota(new Gato(5, "Blacky", 8, "Común", 6.00));
        registroGato.agregarMascota(new Gato(6, "Luna", 6, "Persa", 7.00));
        registroGato.agregarMascota(new Gato(7, "Lorenzo", 12, "Scottish Fold", 5.00));
        registroGato.agregarMascota(new Gato(8, "Mister", 2, "Siamés", 5.00));


        System.out.println("-------------------------------------");

        int totalMascotas = registroGato.contarMascotas() + registroPerro.contarMascotas();
        System.out.println("Hay registradas " + totalMascotas + " mascotas");


        System.out.println("-------------------------------------");

         registroGato.buscarPorEspecie("Persa");

         registroPerro.buscarPorNombre("Peter");


        System.out.println("-------------------------------------");

        registroGato.edadesAleatorias("Lorenzo");












    }
}