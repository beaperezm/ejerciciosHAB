package com.hackaboss;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {

    private List<T> autos;


    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto (T auto) {
        autos.add(auto);
        System.out.println("Auto agregado correctamente al inventario: " + auto.getMarca());
    }

    public void buscarAutoMarca(String marca) {
        System.out.println("Inventario de Autos por Marca:");
        for (T auto : autos) {
            if (marca.equalsIgnoreCase(auto.getMarca())) {
                System.out.println(auto);
            }
        }
    }

    public void buscarAutoPrecio(double precio) {
        System.out.println("Inventario de Autos por Precio:");
        for (T auto : autos) {
            if (precio == auto.getPrecio()) {
                System.out.println(auto);
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for(T auto : autos) {
            total += auto.getPrecio();
        }
      return total;
    }


}
