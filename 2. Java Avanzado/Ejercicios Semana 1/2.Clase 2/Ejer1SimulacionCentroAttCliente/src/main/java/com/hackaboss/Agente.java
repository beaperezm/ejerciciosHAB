package com.hackaboss;

import java.util.concurrent.ThreadLocalRandom;

public class Agente extends Thread {

    @Override
    public void run() {

        try {
            int random = ThreadLocalRandom.current().nextInt(2000, 5000);
            System.out.println("Estoy recibiendo una llamada");
            Thread.sleep(random);
            System.out.println("Estoy resolviendo consultas");
            Thread.sleep(random);
            System.out.println("Estoy registrando información de cada llamada");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
