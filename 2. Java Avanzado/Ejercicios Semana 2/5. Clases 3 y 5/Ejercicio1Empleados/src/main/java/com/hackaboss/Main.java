package com.hackaboss;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Juan", 1500, "Desarrollador"),
                new Empleado("Jose", 1100, "Analista"),
                new Empleado("Alicia", 2800, "Gerente"),
                new Empleado("Maria", 1500, "Desarrollador"),
                new Empleado("Carlos", 1300, "Analista"),
                new Empleado("Óscar", 1800, "Coordinador"),
                new Empleado("Lucía", 1300, "Desarrollador"),
                new Empleado("Carmen", 1400, "Analista"),
                new Empleado("Mario", 1600, "Coordinador")
        );


        List<Empleado> filtrandoEmpleados = listaEmpleados.stream()
                .filter(p -> p.getSalario() > 1300)
                .collect(Collectors.toList());

        filtrandoEmpleados.forEach(p -> System.out.println(p));



        System.out.println("-------------------------------------------------------");

        //Agrupando por categoria
        Map<String, List<Empleado>> agrupandoEmpleados = listaEmpleados.stream()
                .collect(groupingBy(p -> '\n'+p.getCategoria()));

        System.out.println(agrupandoEmpleados);


         double promedioDesarrolladores = listaEmpleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Desarrollador"))
                        .mapToDouble(p -> p.getSalario())
                        .average()
                        .orElse(0.0);
         System.out.println("El promedio de suelto de los desarrolladores es: " + Math.round(promedioDesarrolladores * 100d)/100d);



         double promedioGerente = listaEmpleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Gerente"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.0);
         System.out.println("El promedio de suelto de los gerentes es: " + Math.round(promedioGerente * 100d)/100d);


         double promedioCoordinador = listaEmpleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Coordinador"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.0);
         System.out.println("El promedio de suelto de los coordinadores es: " + Math.round(promedioCoordinador * 100d)/100d);


         double promedioAnalista = listaEmpleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Analista"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.0);
         System.out.println("El promedio de suelto de los analistas es: " + Math.round(promedioAnalista * 100d)/100d);


        System.out.println("-------------------------------------------------------");

        Empleado salarioMasAlto = listaEmpleados.stream()
                     //forma1
                // .max((x, y) -> (int) (x.getSalario() - y.getSalario())).get();
                     // forma2
                 .max(Comparator.comparingDouble(Empleado::getSalario)).get();


        System.out.println("El salario más alto es: " + salarioMasAlto.getSalario() + "€");


    }
}