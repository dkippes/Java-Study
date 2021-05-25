package test;

import dominio.*; // Para importar todas las clases del dominio, no hay problema con la memoria porque solo carga la clase que se use

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
        // No hace falta poner el .toString() si esta definido en la clase persona
        System.out.println("persona1: " + persona1); // el printLn llama automaticamente al metodo toString si esta definido en la clase que llama
    }
}
