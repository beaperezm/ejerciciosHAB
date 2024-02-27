package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] prendas = new Vestimenta[9];

        prendas[0] = new Zapato(1, 38, "Tacón", "Mustang", "Negro", 49.99, "Sintético", "sin cierre");
        prendas[1] = new Zapato(2, 36, "Bota", "Camper", "Marrón", 85.98, "Cuero", "Cremallera");
        prendas[2] = new Zapato(3, 40, "Deportiva", "Nike", "Blanco", 149, "Piel", "Cordones");
        prendas[3] = new Pantalon(4, 36,"Vaquero", "Levi´s", "Negro", 80.5, "Recto", "Vaquero");
        prendas[4] = new Pantalon(5, 42,"Chándal", "Adidas", "Burdeos", 90.29, "Deportivo", "Algodón");
        prendas[5] = new Pantalon(6, 44,"Vaquero", "Lee", "Blanco", 70.5, "Campana", "Vaquero");
        prendas[6] = new Camiseta(7, 12, "Deportiva", "Nike", "Roja", 59.95, "Corta" ,"Redondo");
        prendas[7] = new Camiseta(8, 16, "Street", "Zara", "Blanca", 19.99, "Tirantes" ,"Pico");
        prendas[8] = new Sombrero(9, 2, "Casual", "Stradivarius", "Marrón", 29.95, "Moderno", "Pequeño");


        for(int i =0; i < prendas.length; i++) {
            System.out.println(prendas[i].mostrarSms());
        }

        }

}
