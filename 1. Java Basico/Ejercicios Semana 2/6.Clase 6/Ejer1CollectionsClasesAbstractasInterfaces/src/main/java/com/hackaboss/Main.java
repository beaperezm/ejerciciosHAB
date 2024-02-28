package com.hackaboss;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Vehiculo v;

        //Forma 1:
        v = new Auto(1, 25000f, "Ford", "1234AAA", "Focus", 2010, 40, 250);
        vehiculos.add((Auto)v);
        v = new Auto(2, 35000f, "Tesla", "4567BBB", "Q320", 2020, 60, 450);
        vehiculos.add((Auto)v);

       v = new Camioneta(3, 30500f, "Renault", "8523DDD", "Q320", 2020, 500, 20);
       vehiculos.add((Camioneta)v);
       v = new Camioneta(4, 20500f, "Seat", "9012CCC", "S32", 2005, 700, 15);
        vehiculos.add((Camioneta)v);

       v = new Moto(5, 40500.5557, "Seat", "9012CCC", "S32", 2005, 700, "123");
        vehiculos.add((Moto)v);
       v = new Moto(6, 40000f, "Seat", "9012CCD", "S3", 2003, 300, "126");
       vehiculos.add((Moto)v);



        /* Forma 2:
        vehiculos.add ( new Auto (1, 25000f, "Ford", "1234AAA", "Focus", 2010, 40, 250) );
        vehiculos.add ( new Auto (2, 35000f, "Tesla", "4567BBB", "Q320", 2020, 60, 450) );
        vehiculos.add ( new Camioneta (3, 30500f, "Renault", "8523DDD", "Q320", 2020, 500, 20) );
        vehiculos.add ( new Camioneta (4, 20500f, "Seat", "9012CCC", "S32", 2005, 700, 15) );
        vehiculos.add ( new Moto (5, 40500.5557, "Seat", "9012CCC", "S32", 2005, 700, "123") );
        vehiculos.add ( new Moto (6, 40000f, "Seat", "9012CCD", "S3", 2003, 300, "126") ); */



     for(Vehiculo vehiculosBucle: vehiculos) {
         if(vehiculosBucle instanceof Auto) {
             System.out.println("AUTO: " + "id: " + vehiculosBucle.getId() +
                     ", Coste: " +vehiculosBucle.getCosto() +
                     ", Marca: " +vehiculosBucle.getMarca() +
                     ", Matrícula: " +vehiculosBucle.getPlaca() +
                     ", Modelo: " +vehiculosBucle.getModelo() +
                     ", Año: " +vehiculosBucle.getAnio() +
                     ", Antigüedad: " +vehiculosBucle.calcularAntiguedad() + " años" +
                     ", Autonomía: " + ((Auto) vehiculosBucle).getAutonomia() +
                     ", Capacidad Batería: " + ((Auto) vehiculosBucle).getCapacidadBateria());
                     ((Auto) vehiculosBucle).cargarEnergia();
         } else if (vehiculosBucle instanceof Camioneta) {
             System.out.println("CAMIONETA: " + "id: " + vehiculosBucle.getId() +
                     ", Coste: " +vehiculosBucle.getCosto() +
                     ", Marca: " +vehiculosBucle.getMarca() +
                     ", Matrícula: " +vehiculosBucle.getPlaca() +
                     ", Modelo: " +vehiculosBucle.getModelo() +
                     ", Año: " +vehiculosBucle.getAnio() +
                     ", Antigüedad: " +vehiculosBucle.calcularAntiguedad() + " años" +
                     ", Autonomía: " + ((Camioneta) vehiculosBucle).getConsumoCombustible() +
                     ", Capacidad Batería: " + ((Camioneta) vehiculosBucle).getCapacidadTanque());
             ((Camioneta) vehiculosBucle).recargarCombustible();
         }
         else {
             System.out.println("MOTO: " + "id: " + vehiculosBucle.getId() +
                     ", Coste: " +vehiculosBucle.getCosto() +
                     ", Marca: " +vehiculosBucle.getMarca() +
                     ", Matrícula: " +vehiculosBucle.getPlaca() +
                     ", Modelo: " +vehiculosBucle.getModelo() +
                     ", Año: " +vehiculosBucle.getAnio() +
                     ", Antigüedad: " +vehiculosBucle.calcularAntiguedad() + " años" +
                     ", Autonomía: " + ((Moto) vehiculosBucle).getCilindrada() +
                     ", Capacidad Batería: " + ((Moto) vehiculosBucle).getTipoMotor());
             ((Moto) vehiculosBucle).recargarCombustible();
         }



     }
    }
}