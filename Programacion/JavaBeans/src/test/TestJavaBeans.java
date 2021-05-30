package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        // Los frameworks usan JavaBeans en su mayoria, inician un constructor vacio y se añade o actualizan los getter y setter de los atributos
        Persona persona = new Persona();
        persona.setNombre("Diego");
        persona.setApellido("Kippes");
        System.out.println("persona = " + persona);
    }
}
