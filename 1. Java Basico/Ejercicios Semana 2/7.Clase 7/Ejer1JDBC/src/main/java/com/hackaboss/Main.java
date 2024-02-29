package com.hackaboss;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3360/universidad";
        String usuario = "root";
        String contrasenia = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            System.out.println("Conexión establecida");

            //Creando datos
            Estudiante estudiante1 = new Estudiante(1, "Raquel Pérez", 15, 6.5);
            Estudiante estudiante2 = new Estudiante(2, "Lucas López", 14, 7.0);
            Estudiante estudiante3 = new Estudiante(3, "Adrián Martín", 16, 4.5);
            Estudiante estudiante4 = new Estudiante(4, "Gerardo Rodríguez", 14, 8.5);

            //Insertando datos
            String insertarDatos = "INSERT INTO estudiantes (id, nombre, edad, calificacion) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(insertarDatos);

            statement.setInt(1, estudiante1.getId());
            statement.setString(2, estudiante1.getNombre());
            statement.setInt(3, estudiante1.getEdad());
            statement.setDouble(4, estudiante1.getCalificacion());
            statement.executeUpdate();

            statement.setInt(1, estudiante2.getId());
            statement.setString(2, estudiante2.getNombre());
            statement.setInt(3, estudiante2.getEdad());
            statement.setDouble(4, estudiante2.getCalificacion());
            statement.executeUpdate();

            statement.setInt(1, estudiante3.getId());
            statement.setString(2, estudiante3.getNombre());
            statement.setInt(3, estudiante3.getEdad());
            statement.setDouble(4, estudiante3.getCalificacion());
            statement.executeUpdate();

            statement.setInt(1, estudiante4.getId());
            statement.setString(2, estudiante4.getNombre());
            statement.setInt(3, estudiante4.getEdad());
            statement.setDouble(4, estudiante4.getCalificacion());
            statement.executeUpdate();

            System.out.println("Registros insertados correctamente en la tabla estudiantes");

            //Obteniendo datos
            String obtenerDatos = "SELECT * FROM estudiantes";
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(obtenerDatos);

            while (resultados.next()) {
                System.out.println(resultados.getInt(1) + ", "
                        + resultados.getString(2) + ", "
                        +  resultados.getInt(3) + ", "
                        + resultados.getDouble(4));
            }

            //Borrando datos
            String borrarDato = "DELETE FROM estudiantes WHERE id=2";
            sentencia.execute(borrarDato);
            System.out.println("Se ha borrado al estudiante correctamente");

            //Consultando de nuevo los datos
            resultados = sentencia.executeQuery(obtenerDatos);

            while (resultados.next()) {
                System.out.println(resultados.getInt(1) + ", "
                        + resultados.getString(2) + ", "
                        +  resultados.getInt(3) + ", "
                        + resultados.getDouble(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}