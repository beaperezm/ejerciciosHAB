package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        Verdura[] verdurasO = new Verdura[5];
        verdurasO [0] = new Verdura(1, "coliflor", "blanca", 50, true);
        verdurasO [1] = new Verdura(2, "judías verdes", "verde", 80, true);
        verdurasO [2] = new Verdura(3, "espinacas", "verde", 60, true);
        verdurasO [3] = new Verdura(4, "lombarda", "morado", 90, true);
        verdurasO [4] = new Verdura(5, "brócoli", "verde", 50, true);

        //Mostrando verduras verdes
        for(int i=0; i < verdurasO.length; i++) {
            if(verdurasO[i].getColor().equalsIgnoreCase("verde")) {
                System.out.println("id: " + verdurasO[i].getId() +
                        ", Nombre: " + verdurasO[i].getNombre() +
                        ", Color: " + verdurasO[i].getColor() +
                        ", Calorías: " + verdurasO[i].getCalorias() +
                        ", ¿Debe cocinarse?: " + verdurasO[i].getDebeCocinarse());
            }
        }

    }
}