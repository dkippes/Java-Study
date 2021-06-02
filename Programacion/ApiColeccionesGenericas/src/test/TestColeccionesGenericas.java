package test;

// Todo se importa de java
import java.util.*;

public class TestColeccionesGenericas {
    // Toda la API de collection soporta tipos genericos
    public static void main(String[] args) {
        /********************************* LISTAS ********************************/
        System.out.println("TIPO LIST:");
        // Una lista es como un array, puede crecer dinamicamente
        // Una coleccion de lista es del mismo tipo Object, y se guarda ordenadamente, tambien se pueden duplicar los elementos
        List<String> miLista = new ArrayList<>(); // Se puede poner en ArrayList <String> pero es redundate, se pone <>
        miLista.add("Lunes"); // Al colocar .add ya te dice el tipo que acepta
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);

        /********************************* SETS ********************************/
        System.out.println("\nTIPO SET: ");
        // El add esta definido en la interface padre (Collection), tambien en Lista la hereda
        // No puede duplicar elementos. Los elementos duplicados los borra
        Set<String> miSet = new HashSet<>(); // No hace falta indicar el tipo en HashSet
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        // imprimir(miSet);
        
        /********************************* MAPS ********************************/
        // Un mapa es una coleccion de elementos con clase valor
        // La llave no hace falta que sea int, puede ser cualquier tipo
        // Es como un diccionario
        Map<String, String> miMapa = new HashMap<>(); // Hay que indicar el tipo del key y valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Diego");
        
        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento mapa: " + elemento);
        
        // imprimir(miMapa.keySet());
        // imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){ // Hay que aclarar que va a ser una lista de tipo String
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        // Con for
        /*
        for(String elemento: coleccion){ 
            System.out.println("elemento = " + elemento);
        }
        */
    }
}
