package com.hackaboss;

public class Animal {

    private Integer id, edad;
    private String nombre, tipoPiel, tipoAlimentacion;

    public Animal() {
    }

    public Animal(Integer id, Integer edad, String nombre, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }


    public void saludar() {
        System.out.println("Hola soy un animal");
    }

    /*
    private void saludar() {
        System.out.println("Hola soy un animal");
    }
     */
}
