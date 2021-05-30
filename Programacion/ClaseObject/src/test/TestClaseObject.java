package test;

import domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        // El hashCode y el equals van de la mano, cuando se tiene que hacer algoritmos de ordenamiento con objectos hay que rearmarlass
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if( empleado1.equals(empleado2) ){
            System.out.println("Tienen mismo contenido");
        } else {
            System.out.println("Tienen distinto contenido");
        }
        
        // Si equals es verdadero, entonces el hashCode es verdadero
        if( empleado1.hashCode() == empleado2.hashCode() ){
            System.out.println("Tienen el mismo hashCode");
        } else {
            System.out.println("Tienen distinto hashCode");
        }
    }
}
