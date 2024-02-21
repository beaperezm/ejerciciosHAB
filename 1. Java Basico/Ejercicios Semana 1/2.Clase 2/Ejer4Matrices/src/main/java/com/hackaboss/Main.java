package com.hackaboss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos
        en una matriz de 5x5 y ten en cuenta lo siguiente:
          •	1- Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

          •	2- Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento
        (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

          •	3- Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

          •	4- A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

          •	5- Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
      ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

          •	6- El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
         */

        char[][] filaNumeroAsiento = new char[5][5];
        char asientoOcupado = 'X';
        char asientoVacio = 'O';
        Scanner sc = new Scanner(System.in);
        int fila;
        int asiento;
        boolean bandera = false;


        //Para poner vacíos todos los asientos cuando la app se inicializa
        for(int f=0; f<filaNumeroAsiento.length; f++){
            for (int c=0; c<filaNumeroAsiento[f].length; c++){
                filaNumeroAsiento[f][c] = asientoVacio;
                System.out.print(filaNumeroAsiento[f][c] + " ");
            }
            System.out.println();
        }


        System.out.println("Bienvenido a nuestro sistema de reservas - por favor inserte fila (del 1 al 5) y asiento (del 1 al 5)");
        System.out.println("Cuando desee finalizar añada un 0 en la fila y/o asiento");


        //Pide al usuario que inserte la fila y asiento
        if(bandera != true) {
            for(int f=0; f< filaNumeroAsiento.length; f++) {
                System.out.println();
                for (int c = 0; c < filaNumeroAsiento[f].length; c++) {
                    System.out.println("Introduzca la fila: ");
                    fila = sc.nextInt();
                    fila = fila-1;
                    System.out.println("Introduzca el asiento: ");
                    asiento = sc.nextInt();
                    asiento = asiento-1;

                   //Si usuario añade 0 en fila y/o columna
                    if(fila == -1 || asiento == -1) {
                        System.out.println("¡Hasta pronto!");
                        bandera = true;
                        break;
                    }

                   //Si añade usuario fila incorrecta le avisa
                    if (fila > 4 || asiento > 4) {
                        System.out.println("Lo sentimos pero esa fila / asiento no existe");
                        break;
                    }

                    //Cambia la fila/columna de '0' a 'X'
                   if (filaNumeroAsiento[fila][asiento] == asientoVacio) {
                        filaNumeroAsiento[fila][asiento] = asientoOcupado;
                        System.out.println("Se le ha reservado el asiento: " + (asiento+1) + " de la fila: " + (fila+1));
                    } else {
                        System.out.println("Lo sentimos pero ese asiento está ya ocupado, necesitamos que inserte otro");

                    }


                   //Pinta filas y columnas
                   for (int i = 0; i < filaNumeroAsiento.length; i++) {
                        for (int z = 0; z < filaNumeroAsiento[i].length; z++) {
                            System.out.print(filaNumeroAsiento[i][z] + " ");

                        }
                        System.out.println();


                    }


                }
                //Sale del bucle una vez que se cumple la condición de fila y/o columna 0
                if(bandera == true) {
                    break;
                }
            }


        }

    }


}