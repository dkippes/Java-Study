package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        // Sobreescritura es sobreescribir un metodo del padre para pasar nuevos atributos desde el hijo
        Empleado empleado = new Empleado("Juan", 5000);
        imprimir(empleado);
        
        // Empleado puede recibir y reemplazar referencias por una clase hija
        empleado = new Gerente("Diego", 6600, "Sistemas");
        imprimir(empleado);
    }
    
    // Polimorfismo, poder tener un metodo mas generico
    public static void imprimir(Empleado empleado){ // Un padre puede apuntar a un hijo, la referencia mas generica
        // Polimorfismo -> En ejecucion, el tipo de referencia que se le pase es el de la variable
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
