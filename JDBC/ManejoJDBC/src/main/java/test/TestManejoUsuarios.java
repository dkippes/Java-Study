package test;

import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();       
        
        // Listado de usuarios
        // List<Usuario> usuarios = usuarioDao.seleccionar();
        // imprimir(usuarios);
        
        // Insertando un nuevo usuario
        // Usuario usuarioNueevo = new Usuario("Pablo", "6789");
        // usuarioDao.insertar(usuarioNueevo);
        // List<Usuario> usuarios = usuarioDao.seleccionar();
        // imprimir(usuarios);
        
        // Modificar usuario existente
        // Usuario usuarioActualizar = new Usuario(3, "Manu", "6789");
        // usuarioDao.actualizar(usuarioActualizar);
        // List<Usuario> usuarios = usuarioDao.seleccionar();
        // imprimir(usuarios);
        
        //  Borrar un usuario existente
        Usuario usuarioEliminar = new Usuario(3);
        usuarioDao.eliminar(usuarioEliminar);
        List<Usuario> usuarios = usuarioDao.seleccionar();
        imprimir(usuarios);
    }
    
    public static void imprimir(List<Usuario> usuarios){
        usuarios.forEach(usuario -> { // Funcion lambda
            System.out.println("usuario = " + usuario);
        });
    }
}
