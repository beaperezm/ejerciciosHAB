package com.hackaboss;

public class Pantalon extends Vestimenta {

    private String estilo, tipoTejido;

    public Pantalon() {
    }

    public Pantalon(Integer codigo, Integer talla, String nombre, String marca, String color, double precio, String estilo, String tipoTejido) {
        super(codigo, talla, nombre, marca, color, precio);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }


    public String getTipoTejido() {
        return tipoTejido;
    }

@Override
    public String mostrarSms () {
        return "Estos pantalones son de marca: " + estilo;
}


}
