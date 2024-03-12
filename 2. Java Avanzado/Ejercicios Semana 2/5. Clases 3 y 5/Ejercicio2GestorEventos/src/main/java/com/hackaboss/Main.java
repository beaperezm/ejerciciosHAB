package com.hackaboss;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        List<Evento> listadoEventos = Arrays.asList(
                new Evento("Evento Boda 1", LocalDate.of(2024, 5, 25), "Boda"),
                new Evento("Evento Taller 1", LocalDate.of(2024, 6, 20), "Taller"),
                new Evento("Evento Taller 2", LocalDate.of(2024, 6, 25), "Taller"),
                new Evento("Evento Reunión 1", LocalDate.of(2024, 8, 15), "Reunión"),
                new Evento("Evento Reunión 2", LocalDate.of(2024, 4, 10), "Reunión"),
                new Evento("Evento Reunión 3", LocalDate.of(2024, 5, 25), "Reunión")
        );

        List<Evento> filtrandoEvento = listadoEventos.stream()
                .filter(p -> p.getFecha().equals(LocalDate.of(2024, 5, 25)))
                 .collect(Collectors.toList());

        filtrandoEvento.forEach(System.out::println);


        System.out.println("-----------------------------------------------------");


        Map<String, List<Evento>> agrupandoCategoria = listadoEventos.stream()
                .collect(groupingBy(p -> '\n'+p.getCategoria()));

        System.out.println(agrupandoCategoria);

        Predicate<Evento> boda =  p -> p.getCategoria().equalsIgnoreCase("boda");
        Predicate<Evento> taller = p -> p.getCategoria().equalsIgnoreCase("taller");
        Predicate<Evento> reunion = p -> p.getCategoria().equalsIgnoreCase("reunión");

        Long listaBoda = listadoEventos.stream()
                .filter(boda)
                .count();
        System.out.println("Hay: " + listaBoda +" bodas planificadas");

        Long listaTaller = listadoEventos.stream()
                .filter(taller)
                .count();
        System.out.println("Hay: " + listaTaller +" talleres planificados");

        Long listaReunion = listadoEventos.stream()
                .filter(reunion)
                .count();
        System.out.println("Hay: " + listaReunion +" reuniones planificadas");


        System.out.println("-----------------------------------------------------");

Evento eventoMasProximo = listadoEventos.stream()
        .sorted(Comparator.comparing(Evento::getFecha))
        .min((p, x) -> LocalDate.now().compareTo(p.getFecha()))
        .orElse(new Evento());


        System.out.println("El evento más próximo es: " + eventoMasProximo);







        }

    }
