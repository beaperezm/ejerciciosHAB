package com.hackaboss;

public class Trabajador implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("Ensamblando productos");
            Thread.sleep(1000);
            System.out.println("Realizando controles de calidad");
            Thread.sleep(2000);
            System.out.println("Embalando productos");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
