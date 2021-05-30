package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        // InstanceOf -> Permite determinar el tipo en tiempo de ejecucion
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        
        empleado = new Gerente("Diego", 6600, "Sistemas");
        determinarTipo(empleado);
    }
    
    public static void determinarTipo(Empleado empleado){
        // Primero las clases hijas y luego las padres
        // Porque si se pregunta por padre primero ya sabe que tiene las hijas, y va a devolver ambas
        if(empleado instanceof Gerente){
            System.out.println("Es un gerente");
            // Transformando una clase en otra de tipo hijo, ya que esta no puede accecder a los metodos de la hija
            Gerente gerente = (Gerente)empleado; // Asgina la conversion a la variable gerente
            System.out.println("gerente = " + gerente.getDepartamento());
            // ((Gerente) empleado).getDepartamento(); -> Esta es otra forma de convertir el tipo a Gerente
            // Si la linea de arriba se pone en el siguiente if va a marcar un error: Porque un tipo padre no puede acceder a atributos de una hija si no es del tipo dado
        } else if(empleado instanceof Empleado){
            System.out.println("Es un empleado");
            // Gerente gerente = (Gerente)empleado; -> Va a dar error porque cuando sea tipo empleado no va a tener getDepartamento()
            // System.out.println("gerente = " + gerente.getDepartamento());
        } else if(empleado instanceof Object){
            // Aca no tendria acceso a los metodos de empleado o gerente
            System.out.println("Es un objeto");
        }
    }
}
