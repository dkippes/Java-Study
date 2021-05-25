package test;

import domain.Persona;

public class TestMatricesObject {
    public static void main(String[] args) {
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Pepe");
        personas[0][1] = new Persona("Carlitos");
        imprimir(personas);
    }
    
    // Al poner tipo Object se puede pasar cualquier clase que herede de tipo Object
    public static void imprimir(Object matriz[][]){ // No hace falta especificar las col y filas
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                System.out.println("matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
