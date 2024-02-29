package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        Verdura[] verduras = new Verdura[5];
        verduras [0] = new Verdura(1, "coliflor", "blanca", 50, true);
        verduras [1] = new Verdura(2, "judías verdes", "verde", 80, true);
        verduras [2] = new Verdura(3, "espinacas", "verde", 60, true);
        verduras [3] = new Verdura(4, "lombarda", "morado", 90, true);
        verduras [4] = new Verdura(5, "brócoli", "verde", 50, true);

        //Mostrando nombre y calorías de todas la verdudas
        for(int i=0; i < verduras.length; i++) {
            System.out.println("La verdura "+ (i+1) + " es: " + verduras[i].getNombre() + " y tiene: " + verduras[i].getCalorias() + " calorías");
        }

        System.out.println("--------------------------------------");

        //Cambiando datos de dos verduras
        verduras[1].setNombre("zanahoria");
        verduras[1].setColor("naranja");
        verduras[1].setCalorias(100);
        verduras[1].setDebeCocinarse(false);

        verduras[3].setNombre("cebolla");
        verduras[3].setColor("blanca");
        verduras[3].setCalorias(30);
        verduras[3].setDebeCocinarse(false);

        System.out.println("La nueva verdura es la: " + verduras[1].getId() + "\nNombre: " + verduras[1].getNombre() +
                "\nColor: " + verduras[1].getColor() +
                "\nCalorías: " + verduras[1].getCalorias() +
                "\n¿Debe cocinarse?: " + verduras[1].getDebeCocinarse());


        System.out.println("La nueva verdura es la: " + verduras[3].getId() + "\nNombre: " + verduras[3].getNombre() +
                "\nColor: " + verduras[3].getColor() +
                "\nCalorías: " + verduras[3].getCalorias() +
                "\n¿Debe cocinarse?: " + verduras[3].getDebeCocinarse());

        System.out.println("--------------------------------------");

        //Mostrando verduras verdes
        for(int i=0; i < verduras.length; i++) {
            if(verduras[i].getColor().equalsIgnoreCase("verde")) {
                System.out.println("id: " + verduras[i].getId() +
                        ", Nombre: " + verduras[i].getNombre() +
                        ", Color: " + verduras[i].getColor() +
                        ", Calorías: " + verduras[i].getCalorias() +
                        ", ¿Debe cocinarse?: " + verduras[i].getDebeCocinarse());
            }
        }

    }
}