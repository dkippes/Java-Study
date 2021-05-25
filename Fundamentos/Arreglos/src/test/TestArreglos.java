package test;

public class TestArreglos {
    public static void main(String[] args) {
        // Se tiene que indicar el tipo del arreglo, y tambien el tamaño del arreglo
        // El tamaño del arreglo es inmutable, no puede crecer dinamicamente
        // Si queremos que cambie hay que usar una lista, un set o un map.
        int edades[] = new int[3]; // length -> 3 elementos, los 3 elementos por default tienen 0
        System.out.println("edades = " + edades); // Direccion de memoria
        
        
        // Accediendo a los elementos
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        
        for(int i=0; i < edades.length; i++){
            System.out.println("edades [" + i + "] = " + edades[i]);
        }
        
        String frutas[] = {"Naranja", "Banana", "Uva"}; // -> Aca se sabe cuantos tiene, se indica el numero de elementos
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
