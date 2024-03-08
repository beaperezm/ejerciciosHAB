package com.hackaboss;

public class Main {
    public static void main(String[] args) {

        Agente agente1 = new Agente();
        Agente agente2 = new Agente();
        Agente agente3 = new Agente();

        agente1.start();
        agente2.start();
        agente3.start();
    }
}