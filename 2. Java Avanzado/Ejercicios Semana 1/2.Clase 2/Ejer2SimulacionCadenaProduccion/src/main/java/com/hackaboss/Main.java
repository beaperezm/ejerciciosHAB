package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        Runnable miRunnable = new Trabajador();

        Thread tarea1 = new Thread(miRunnable);
        tarea1.start();

        Thread tarea2 = new Thread(miRunnable);
        tarea2.start();

        Thread tarea3 = new Thread(miRunnable);
        tarea3.start();
    }
}