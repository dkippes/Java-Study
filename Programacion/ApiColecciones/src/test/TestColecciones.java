package test;

// Todo se importa de java
import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        /********************************* LISTAS ********************************/
        // Una lista es como un array, puede crecer dinamicamente
        // Una coleccion de lista es del mismo tipo Object, y se guarda ordenadamente, tambien se pueden duplicar los elementos
        System.out.println("TIPO LIST:");
        List miLista = new ArrayList();
        miLista.add("Lunes"); // Puede añadir cualquier objecto
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        // imprimir(miLista);

        /********************************* SETS ********************************/
        System.out.println("\nTIPO SET: ");
        // El add esta definido en la interface padre (Collection), tambien en Lista la hereda
        // No puede duplicar elementos. Los elementos duplicados los borra
        Set miSet = new HashSet(); // No garantiza el orden pero es mas rapido porque no garantiza un orden
        miSet.add("Lunes"); // Puede añadir cualquier objecto
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        // imprimir(miSet);
        
        /********************************* MAPS ********************************/
        // Un mapa es una coleccion de elementos con clase valor
        // La llave no hace falta que sea int, puede ser cualquier tipo
        // Es como un diccionario
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Diego");
        
        // Nos devuelve un tipo Object, y tenemos que convertirlo a un tipo String
        String elemento = (String) miMapa.get("valor1"); // Le tenemos que dar la llave para que nos de el valor
        System.out.println("elemento mapa: " + elemento);
        
        // Para traer todos las llaves
        // Nos trae todo como un set, osea desordenado
        imprimir(miMapa.keySet());
        // Si queremos traer los valores
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){ // Se pasa el tipo mas generico
        // Se puede recorrer con un forEach
        // Funcion lamda, arrow function
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        // Con for
        /*
        for(Object elemento: miLista){
            System.out.println("elemento = " + elemento);
        }
        */
    }
}
