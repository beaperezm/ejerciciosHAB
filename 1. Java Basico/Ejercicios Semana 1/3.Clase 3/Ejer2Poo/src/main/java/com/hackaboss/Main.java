package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
        (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
•	a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
•	b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
•	c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y
       luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
•	d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
 */

      Persona[] personas = new Persona[5];
      personas[0] = new Persona(1,25,659265555, "Alba", "Calle Alcalá");
      personas[1] = new Persona(2,30,689777236, "Alberto", "Calle Toledo");
      personas[2] = new Persona(3,20,699555222, "Zoraida", "Calle Lagasca");
      personas[3] = new Persona(4,45,666888999, "Lola", "Calle Goya");
      personas[4] = new Persona(5,40,611222333, "Borja", "Calle Velazquez");

      //Bucle para mostar el nombre y la edad de todas las personas
      for(int i =0; i< personas.length; i++) {
          System.out.println("El nombre de la persona " + (i+1) + " es: " + personas[i].getNombre() + " " + " y su edad es: " + personas[i].getEdad());
      }

        System.out.println("-------------------------------------------------------");

      //Cambiando el nombre de dos personas
        System.out.println("Soy la persona 2 antes de cambiar el nombre: " + personas[1].getNombre());
        personas[1].setNombre("Lucas");
        System.out.println("Soy la persona 2 con el nuevo nombre: " + personas[1].getNombre());

        System.out.println("Soy la persona 5 antes de cambiar el nombre: " + personas[4].getNombre());
        personas[4].setNombre("Tomás");
        System.out.println("Soy la persona 5 con el nuevo nombre: " + personas[4].getNombre());


        System.out.println("-------------------------------------------------------");

        //Bucle para mostrar a las personas cuya edad es mayor de 30 años
        for (int i =0; i< personas.length; i++) {
            if(personas[i].getEdad() > 30) {
                System.out.println("Id: " + personas[i].getId() + ", " +
                        "Nombre: " + personas[i].getNombre() + ", " +
                        "Edad: " + personas[i].getEdad() + ", " +
                        "Dirección: " + personas[i].getDireccion() + ", " +
                        "Número de teléfono: " + personas[i].getNumeroTelefono());
            }
        }

    }
}