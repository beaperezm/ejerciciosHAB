package com.hackaboss;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExploradorTarea tarea = new ExploradorTarea();

        Tarea tareaPrincipal = new Tarea(1, "Proyecto: Desarrollo de Software");

        List<Tarea> tareasPrincipales = Arrays.asList(
                new Tarea(2, "|----- Tarea Principal: Diseño de la aplicación"),
                new Tarea(3, "|----- Tarea Principal: Implementación del Código"),
                new Tarea(4, "|----- Tarea Principal: Pruebas y depuración")
        );
        tareaPrincipal.setTareaPrincipal(tareasPrincipales);

        List<Tarea> subtareas1 = Arrays.asList(
                new Tarea(5, "|      |----- Subtarea: Crear Prototipo"),
                new Tarea(6, "|      |----- Subtarea: Diseñar Interfaz"),
                new Tarea(7, "|      |----- Subtarea: Documentar requisitos")
        );
       tareaPrincipal.getTareaPrincipal().get(0).setSubtarea(subtareas1);

       List<Tarea> subSubTarea1 = Arrays.asList(
               new Tarea(8, "|      |          |----- Sub-subtarea: Definir Esquema de Colores"),
               new Tarea(9, "|      |          |----- Sub-subtarea: Diseñar Diseño Responsivo")
       );
       tareaPrincipal.getTareaPrincipal().get(0).getSubtarea().get(1).setSubsubtarea(subSubTarea1);


        tarea.explorarTarea(tareaPrincipal);
    }
}