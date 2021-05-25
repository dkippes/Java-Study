/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Variables {
    // main ejecuta nuestro programa
    public static void main(String args[]) {
        // Definimos la variable
        int numeroEntero = 3; // Entero, no punto flotante
        System.out.println("Numero Entero: " + numeroEntero);
        // Modificamos la variable
        numeroEntero = 5;
        System.out.println("Numero Entero: " + numeroEntero);
        
        // Strings
        String cadena = "Saludos";
        System.out.println("String: " + cadena);
        
        cadena = "Adios";
        System.out.println("String: " + cadena);
        
        // Var - Inferencia de tipos en Java, se puede usar dentro de un metodo no fuera
        var variableEntero2 = 10; // var sabe automaticamente que tipo usa
        System.out.println("variableEntero2 = " + variableEntero2);
        
        var nuevaCadena = "Nueva Cadena";
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Regla definir variables -> Esta bien: miVariable, $miVariable, _miVariable
    }
}
