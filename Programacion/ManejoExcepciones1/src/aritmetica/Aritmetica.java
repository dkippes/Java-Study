package aritmetica;

import javax.management.OperationsException;

public class Aritmetica {
    public static int division(int numerador, int denominador) 
            throws OperationsException{ // Hay que indicar que posiblemente arroja una excepcion - En RuntimeException no es necesario
        // Manejando nuestras propias excepciones
        if( denominador == 0){
            throw new OperationsException("No se puede hacer una division entre 0");
        }
        
        return numerador / denominador;
    }
}
