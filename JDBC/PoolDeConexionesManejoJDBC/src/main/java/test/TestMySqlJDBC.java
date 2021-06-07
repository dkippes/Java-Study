package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        // Conectando a la base de mysql
        // Cada db tiene una cadena de conexion
        /*
        * Indica la ubicacion de la base de datos, despues del ? son parametros extras opcionales (recomendables)
        * SSL es para seguridad
        * timeZone
        * allowPublicKeyRetrieval
        */
        var url = "jdbc:mysql://localhost:3306/test?userSSL=false&&useTimezone=true&&serverTimezone=UTC&&allowPublicKeyRetrieval=true"; 
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver"); // En las app web puede ser requerida, pero no necesaria
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            // Lado derecho implementa una interfase, en otras db es igual
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona:" + resultado.getInt("id_persona") + " - ");
                System.out.print(" Nombre:" + resultado.getString("nombre") + " - ");
                System.out.print(" Apellido:" + resultado.getString("apellido") + " - ");
                System.out.print(" Email:" + resultado.getString("email") + " - ");
                System.out.print(" Telefono:" + resultado.getString("telefono"));
                System.out.println("");
            }
            // Hay que cerrar las cosas
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
