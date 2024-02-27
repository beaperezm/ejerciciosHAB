package com.hackaboss;

public class Ave extends Animal{

    private Integer envergaduraAlas;
    private String tipoVuelo, colorPlumaje, tipoPico;

    public Ave(Integer id, Integer edad, String nombre, String tipoPiel, String tipoAlimentacion, Integer envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, edad, nombre, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Ave() {
    }


    @Override
    public void saludar () {
        System.out.println("Hola, soy un ave");
    }

    /*
       private void saludar () {
        System.out.println("Hola, soy un ave");
    }
     */
}
