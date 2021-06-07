package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            // Al ejecutarse una sentencia en automatico guarda los cambios, si se set a FALSE no se guardarian, lo estamos haciendo manualmente
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDao = new PersonaDAO(conexion);
            // Si ocurre un fallo hace rollback
            // Hacemos un update
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(8);
            cambioPersona.setNombre("Gonzi");
            cambioPersona.setApellido("Hulk");
            cambioPersona.setEmail("ghulk@mail.com");
            cambioPersona.setTelefono("68644542");
            personaDao.actualizar(cambioPersona);
            
            // Hacemos un insert
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Juan");
            nuevaPersona.setApellido("Perezrtyhfhghfthfgfghfghhgfhgfhfghthrhrhrthrhghfghfghrthtrhfghfgcdftyctf");
            personaDao.insertar(nuevaPersona);
            
            // Aca se hace commit de lo que se hace en la db
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                // Para probar el rollback se inserta mas de 45 caracteres y va a dar un error, no se guarda ni el update ni el insert porque no llega hace commit
                conexion.rollback();
            } catch (SQLException exRoll) {
                exRoll.printStackTrace(System.out);
            }
        }
    }
    
    public static void imprimir(List<Persona> personas){
        /*
        for(Persona persona: personas){ // elemento: lista a iterar
            System.out.println("persona = " + persona);
        }
        */
        
        personas.forEach(persona -> { // Funcion lambda
            System.out.println("persona = " + persona);
        });
    }
}
