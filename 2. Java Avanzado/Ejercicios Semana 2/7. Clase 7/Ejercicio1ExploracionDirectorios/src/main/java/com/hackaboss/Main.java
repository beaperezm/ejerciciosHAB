package com.hackaboss;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExploradorDirectorio explorador = new ExploradorDirectorio();

        Directorio directorioPrincipal = new Directorio(1, "Directorio Principal");

        List<Directorio> listaSubdirectorios = Arrays.asList(
                new Directorio(2, "   |----- Subdirectorio1"),
                new Directorio(3, "   |----- Subdirectorio2"),
                new Directorio(4, "   |----- Subdirectorio3")
        );
        directorioPrincipal.setSubdirectorios(listaSubdirectorios);


        List<Directorio> listaSubdirectorios2 = Arrays.asList(
                new Directorio(5, "   |    |----- Subdirectorio2.1"),
                new Directorio(6, "   |    |----- Subdirectorio2.2")
        );
        directorioPrincipal.getSubdirectorios().get(1).setSubdirectorios(listaSubdirectorios2);

        List<Directorio> listaArchivos = Arrays.asList(
                new Directorio(7,"   |    |            |----- Archivo1"),
                new Directorio(8,"   |    |            |----- Archivo2"),
                new Directorio(9,"   |    |            |----- Archivo3")
        );
        directorioPrincipal.getSubdirectorios().get(1).getSubdirectorios().get(0).setSubdirectorios(listaArchivos);

       explorador.explorarDirectorio(directorioPrincipal);
    }
}