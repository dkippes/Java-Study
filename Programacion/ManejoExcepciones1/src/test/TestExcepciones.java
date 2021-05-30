package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        // De esta forma nuestro programa no termina de manera abrupta
        // RuntimeException -> UnCheckException, el compilador no pide poner un try catch 
        /*
            * Exception -> Clase padre
            * RuntimeException -> Ocurre en tiempo de ejecucion
            * NullPointerException -> Variable que quiera acceder a un atributo o metodo, y no tiene un objeto valido y es NULL, 
                                      si trata de acceder a un metodo o atributo tira error
        */
        try {
            resultado = 10/0;
        } catch (Exception error) { // Es una clase de tipo Exception - Puede usarse varios catch dentro de un try
            System.out.println("Ocurrio un error: ");
            error.printStackTrace(System.out); // Imprime la pila de excepciones
        } finally { // Este bloque siempre se va a ejecutar despues del try y catch
            // Suele usarse para cerrar recursos, cerrar una conexion a base da datos etc
            System.out.println("Se reviso la division por 0");
        }
        System.out.println("resultado = " + resultado);
        
        
        
        /************************ PROBANDO NUESTRAS PROPIAS EXCEPCIONES *******************************/
        System.out.println("");
        
        int resultado2 = 0;
        try {
            resultado2 = division(10, 0);
        } catch (Exception error) { // Es una clase de tipo Exception
            System.out.println("Ocurrio un error: ");
            error.printStackTrace(System.out); // Imprime la pila de excepciones
            // error.getMessage() se puede mandar directamente el mensaje
        }
        System.out.println("resultado = " + resultado);
    }
}
