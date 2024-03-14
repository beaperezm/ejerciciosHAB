package com.hackaboss;

public class Main {
    public static void main(String[] args) {



        RegistroMascota<Mascota> registroMascota = new RegistroMascota<>();
        registroMascota.agregarMascota(new Mascota(1, "Rayo", 5, "Perro"));
        registroMascota.agregarMascota(new Mascota(2, "Peter", 7, "Perro"));
        registroMascota.agregarMascota(new Mascota(3, "Can", 9, "Perro"));
        registroMascota.agregarMascota(new Mascota(4, "Beater", 12, "Perro"));
        registroMascota.agregarMascota(new Mascota(5, "Blacky", 8, "Gato"));
        registroMascota.agregarMascota(new Mascota(6, "Luna", 6, "Gato"));
        registroMascota.agregarMascota(new Mascota(7, "Lorenzo", 12, "Gato"));
        registroMascota.agregarMascota(new Mascota(8, "Mister", 2, "Gato"));
        registroMascota.agregarMascota(new Mascota(9, "Piolín", 3, "Ave"));
        registroMascota.agregarMascota(new Mascota(10, "Parrot", 2, "Ave"));
        System.out.println("Mascotas agregadas correctamente: " + registroMascota.toString()+"\n");


        System.out.println("-------------------------------------");

        System.out.println("Hay registradas " + registroMascota.contarMascotas() + " mascotas");


        System.out.println("------------------------------------------");


        registroMascota.buscarPorEspecie("Gato");

        System.out.println("-------------------------");
        registroMascota.buscarPorNombre("Peter");


        System.out.println("-------------------------------------");

        registroMascota.datosAleatorios(6);
        System.out.println("Mascotas aleatorias agregadas correctamente");





    }
}