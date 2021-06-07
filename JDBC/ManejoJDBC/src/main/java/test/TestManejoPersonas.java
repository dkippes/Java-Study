package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        /* LISTA SQL */
        PersonaDAO personaDao = new PersonaDAO();       
        
        /* INSERTAR SQL */
        // Persona personaNueva = new Persona("Pepe", "Hulk", "phulk@mail.com", "68644542");
        // personaDao.insertar(personaNueva);
        // List<Persona> personas = personaDao.seleccionar(); -> Deberia comentar la otra lista
        
        /* UPDATE SQL */
        // Persona personaActualizada = new Persona(8, "Gonzalo", "Hulk", "ghulk@mail.com", "68644542");
        // personaDao.actualizar(personaActualizada);
        // List<Persona> personas = personaDao.seleccionar();
        
        /* DELETE SQL */
        Persona personaEliminada = new Persona(4);
        personaDao.eliminar(personaEliminada);
        List<Persona> personas = personaDao.seleccionar();
        
        imprimir(personas);
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
