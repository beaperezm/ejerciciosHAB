package com.hackaboss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RegistroMascota<T extends Mascota> {

    private List<Mascota> mascotas;

    public RegistroMascota() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota (Mascota mascota) {
        mascotas.add(mascota);
    }

    public void buscarPorNombre (String nombre) {
        for(Mascota mascota : mascotas) {
            if(nombre.equals(mascota.getNombre())) {
                System.out.println(mascota);
            }
        }
    }

    public void buscarPorEspecie (String especie) {
        for(Mascota mascota : mascotas) {
            if(especie.equals(mascota.getEspecie())) {
                System.out.println(mascota);
            }
        }
    }

    public int contarMascotas () {
        int count = 0;
        for(Mascota mascota : mascotas) {
            count++;
        }
        return count;
    }


    public void edadesAleatorias (String nombre) {
        Random rdm = new Random();
        for(Mascota mascota : mascotas) {
            if(nombre.equals(mascota.getNombre())) {
                mascota.setEdad(rdm.nextInt(15));
                mascota.getEdad();
                System.out.println(mascota);
            }
        }
    }


    public void datosAleatorios (Integer totalDatos) {
        Random random = new Random();
        List<String> nombres = Arrays.asList("Rocco", "Marte", "Lulú", "Richard","Martin", "Mirto");
        List<Integer> edad = Arrays.asList(4, 3, 2, 5, 1, 2);
        List<String> especie = Arrays.asList("Perro", "Gato", "Ave");

        for(int i=0; i < totalDatos; i++) {
            String nombresRandom = null;
            int edadRandom = 0;
            String especieRandom = null;
            for(int n= 0; n < nombres.size(); n++) {
                n = random.nextInt(totalDatos);
                nombresRandom = nombres.get(n);
                for(int e=random.nextInt(totalDatos); e<edad.size(); e++) {
                    edadRandom = edad.get(e);
                    for(int p=random.nextInt(totalDatos); p<especie.size(); p++) {
                        especieRandom = especie.get(p);
                        agregarMascota(new Mascota<>(i, nombresRandom, edadRandom, especieRandom));
                        break;
                    }

                    break;
                }
                break;

            }
        }
        System.out.println(mascotas);

    }


    @Override
    public String toString() {
        return "{" +
                "mascotas=" + mascotas +
                '}';
    }
}
