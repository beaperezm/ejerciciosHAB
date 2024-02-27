package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        //Creando objeto de cada clase hija. Llamando a los 3 métodos saludar
        Mamifero mamiferos = new Mamifero();
        mamiferos.saludar();

        Ave aves = new Ave();
        aves.saludar();

        Reptil reptiles = new Reptil();
        reptiles.saludar();

        System.out.println("-------------------");

        //Crear objeto de tipo animal e intentar asignarle al Mamífero creado... ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
            Animal animales = new Mamifero();
            animales.saludar();

                           /*
                           Sí que es posible hacerlo debido al polimorfismo ==> si creamos un objeto de
                           una clase padre -> puede contener en su estructura distintos objetos de sus
                           clases hijas aunque sus características sean diferentes.
                          */

        System.out.println("-------------------");

        //Cambiar el modificador de acceso de los métodos de "public" a "private", Intenta acceder desde el "main" a estos métodos
        // ¿Qué sucede? ¿Es posible hacer esto?

                        /*
                        No es posible hacer esto ya que al poner private sólo se puede acceder a dicho método dentro
                        de la misma clase - al intentar usarlo desde el main da error y si se intenta compilar
                        lo que nos dice es que dicho método tiene acceso privado
                         */
    }
}