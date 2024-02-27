package com.hackaboss;

public class Reptil extends Animal{

    private Integer longitud;
    private String tipoEscamas, tipoVeneno, habitat;

    public Reptil(Integer id, Integer edad, String nombre, String tipoPiel, String tipoAlimentacion, Integer longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, edad, nombre, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    public Reptil() {
    }


    @Override
    public void saludar () {
        System.out.println("Hola, soy un reptil");
    }
    /*
     private void saludar () {
        System.out.println("Hola, soy un reptil");
    }
     */
}
