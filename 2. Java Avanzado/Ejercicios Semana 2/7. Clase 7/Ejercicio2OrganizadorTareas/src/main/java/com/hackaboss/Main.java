package com.hackaboss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        ExploradorTarea tarea = new ExploradorTarea();
        List<Tarea> tareasPrincipales = new ArrayList<>();
        List<Tarea> subtareas = new ArrayList<>();
        List<Tarea> subSubTareas = new ArrayList<>();

        Tarea tareaPrincipal = new Tarea(1, "Proyecto: Desarrollo de Software");

        bucleMenuOpciones(sc, opcion, tareasPrincipales, tareaPrincipal, subtareas, subSubTareas);

        tarea.explorarTarea(tareaPrincipal);
    }

    public static int bucleMenuOpciones (Scanner sc, int opcion, List<Tarea> tareasPrincipales, Tarea tareaPrincipal, List<Tarea> subtareas, List<Tarea> subSubTareas) {
        ExploradorTarea tarea = new ExploradorTarea();
        if(opcion == 5){
            return 0;
        } else {
            System.out.println("1. Añadir tarea principal");
            System.out.println("2. Añadir subtarea");
            System.out.println("3. Añadir sub-subtarea");
            System.out.println("4. Mostrar árbol tareas");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            opcionesSwitchCase(opcion, tareasPrincipales, tareaPrincipal, sc, tarea, subtareas, subSubTareas);
            return bucleMenuOpciones(sc, opcion, tareasPrincipales, tareaPrincipal, subtareas, subSubTareas);
        }
    }

    public static void opcionesSwitchCase(int opcion, List<Tarea> tareasPrincipales, Tarea tareaPrincipal, Scanner sc, ExploradorTarea tarea, List<Tarea> subtareas, List<Tarea> subSubTareas) {
        switch (opcion) {
            case 1:
                sc.nextLine();
                System.out.println("Introduzca la tarea principal");
                String tareaSc = sc.nextLine();
                tareasPrincipales.add(new Tarea("|----- "+tareaSc));
                tareaPrincipal.setTareaPrincipal(tareasPrincipales);
                System.out.println("tareas ppales " + tareasPrincipales);
                break;

            case 2:
                sc.nextLine();
                System.out.println("Introduzca la tarea subtarea");
                String subtareaSc = sc.nextLine();
                subtareas.add(new Tarea("|      |----- "+subtareaSc));
                System.out.println("Introduzca el índice de la tarea a la que quiere añadir la/s subtarea/s");
                int index = sc.nextInt();
                tareaPrincipal.getTareaPrincipal().get(index).setSubtarea(subtareas);
                break;

            case 3:
                sc.nextLine();
                System.out.println("Introduzca la tarea sub - subtarea");
                String subSubtareaSc = sc.nextLine();
                subSubTareas.add(new Tarea("|      |          |----- "+subSubtareaSc));
                System.out.println("Introduzca el índice de la tarea a la que quiere añadir la/s sub-subtarea/s");
                int indexT = sc.nextInt();
                System.out.println("Introduzca el índice de la subtarea a la que quiere añadir la/s sub-subtarea/s");
                int indexS = sc.nextInt();
                tareaPrincipal.getTareaPrincipal().get(indexT).getSubtarea().get(indexS).setSubsubtarea(subSubTareas);
                break;

            case 4:
                tarea.explorarTarea(tareaPrincipal);
                break;

            case 5:
                System.out.println("Hasta pronto");
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }



}