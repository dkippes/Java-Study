package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        // Si a una variable se le pone final, se transforma en una constante y no se puede modificar
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        // Con los objetos
        final Persona persona1 = new Persona();
        // persona1 = new Persona(); -> No se puede
        // persona1.setNombre("Hola"); -> Si se puede modificar el contenido del objeto
    }
}
