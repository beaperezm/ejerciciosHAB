package com.hackaboss;

public class Main {
    public static void main(String[] args) {
        // 1- Crea un programa que declare una variable para cada uno de los siguientes tipos de datos

        int number = 5;
        double price = 29.99;
        boolean exist = true;
        String name = "Marta";

        System.out.println("variable tipo int: " + number);
        System.out.println("variable tipo double: " + price);
        System.out.println("variable tipo boolean: " + exist);
        System.out.println("variable tipo string: " + name);

        // 2- Asignar valores incorrectos y observar qué ocurre

        //Se produce un error en el tiempo de compilación
        // (avisando que no se han podido resolver los problemas a la hora de compilar ya que no ha podido convertir los tipos)
        // --> Es debido a que Java es fuertemente tipado


		int number2 = "Hola mundo";
		String name2 = 39.99;
		boolean exist2 = 5;
		double price2 = true;

		System.out.println("variable tipo int: " + number2);
		System.out.println("variable tipo double: " + price2);
		System.out.println("variable tipo boolean: " + exist2);
		System.out.println("variable tipo string: " + name2);



    }
}