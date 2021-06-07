package test;

import datos.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;  
        try {
            conexion = Conexion.getConnection();
            // Al ejecutarse una sentencia en automatico guarda los cambios, si se set a FALSE no se guardarian, lo estamos haciendo manualmente
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            // Si ocurre un fallo hace rollback
            // Hacemos un update
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(2);
            cambioUsuario.setUsername("Carlu");
            cambioUsuario.setPassword("6456756765");
            usuarioDao.actualizar(cambioUsuario);
            
            // Hacemos un insert
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("juan");
            nuevoUsuario.setPassword("5356456564546564645645654646564336545324264575764542325134543455");
            usuarioDao.insertar(nuevoUsuario);
            
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
    
    public static void imprimir(List<Usuario> usuarios){
        usuarios.forEach(usuario -> { // Funcion lambda
            System.out.println("usuario = " + usuario);
        });
    }
}
