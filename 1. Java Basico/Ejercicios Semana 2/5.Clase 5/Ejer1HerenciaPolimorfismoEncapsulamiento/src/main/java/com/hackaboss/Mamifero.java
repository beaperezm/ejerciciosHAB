package com.hackaboss;

public class Mamifero extends Animal {

    private Integer numeroPatas;
    private String tipoReproduccion, colorPelaje, habitat;

    public Mamifero(Integer id, Integer edad, String nombre, String tipoPiel, String tipoAlimentacion, Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, edad, nombre, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Mamifero() {
    }


    @Override
    public void saludar () {
        System.out.println("Hola, soy un mamífero");
    }

    /*
    private void saludar () {
        System.out.println("Hola, soy un mamífero");
    }
     */
}
