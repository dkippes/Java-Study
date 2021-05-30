package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        // ForEach es un for mejorado
        int edades[] = {5, 6, 8, 9};
        // Lo malo es que no tenemos acceso al contador
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        System.out.println("");
        
        Persona personas[] = {new Persona("Juan"), new Persona("Diego"), new Persona("Karla"), new Persona("Agustin")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
