package com.hackaboss;

public class Main {
    public static void main(String[] args) {
          /*
    Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
    Luego, realiza las siguientes acciones:
•	a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
•	b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
•	c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
•	d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
     */


        Electrodomestico electrodomestico1 = new Electrodomestico(160, 79, "Siemens", "S370", "blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(170, 70, "Balay", "B330", "plata");
        Electrodomestico electrodomestico3 = new Electrodomestico(180, 65, "Teka", "T680", "negro");

        System.out.println("El primer electrodoméstico: "
                + "Marca: " + electrodomestico1.getMarca()
                + ", Modelo: " + electrodomestico1.getModelo()
                + ", Consumo energético: " + electrodomestico1.getConsumo());

        System.out.println("El segundo electrodoméstico: "
                + "Marca: " + electrodomestico2.getMarca()
                + ", Modelo: " + electrodomestico2.getModelo()
                + ", Consumo energético: " + electrodomestico2.getConsumo());

        System.out.println("El tercer electrodoméstico: "
                + "Marca: " + electrodomestico3.getMarca()
                + ", Modelo: " + electrodomestico3.getModelo()
                + ", Consumo energético: " + electrodomestico3.getConsumo());


        //En este caso va a imprimir null- ya que si a un String u Objeto no se le asigna ningún valor por defecto va a ser null
        Electrodomestico electrodomestico4 = new Electrodomestico();
        System.out.println(electrodomestico4.getMarca());




    }
}