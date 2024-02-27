package com.hackaboss;

public class Zapato extends Vestimenta {

    private String material, tipoCierre;

    public Zapato() {
    }

    public Zapato(Integer codigo, Integer talla, String nombre, String marca, String color, double precio, String material, String tipoCierre) {
        super(codigo, talla, nombre, marca, color, precio);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }


    public String getTipoCierre() {
        return tipoCierre;
    }

@Override
    public String mostrarSms () {
        return "Estos zapatos son de marca: " + getMarca();
}



}
