package com.hackaboss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas <T extends Mascota> {

    private List<T> mascotas;

    public RegistroMascotas() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota (T mascota) {
        mascotas.add(mascota);
        System.out.println("Mascota agregada correctamente: " + mascota.getNombre() + ", con el id: " + mascota.getId());
    }

    public void buscarPorNombre (String nombre) {
        for(T mascota : mascotas) {
            if(nombre.equals(mascota.getNombre())) {
                System.out.println(mascota);
            }
        }
    }

    public void buscarPorEspecie (String especie) {
        for(T mascota : mascotas) {
            if(especie.equals(mascota.getEspecie())) {
                System.out.println(mascota);
            }
        }
    }

    public int contarMascotas () {
        int count = 0;
        for(T mascota : mascotas) {
            count++;
        }
        return count;
    }


    public void edadesAleatorias (String nombre) {
        Random rdm = new Random();
        for(T mascota : mascotas) {
            if(nombre.equals(mascota.getNombre())) {
                mascota.setEdad(rdm.nextInt(15));
                mascota.getEdad();
                System.out.println(mascota);
            }


        }
    }


    @Override
    public String toString() {
        return "{" +
                "mascotas=" + mascotas +
                '}';
    }
}
