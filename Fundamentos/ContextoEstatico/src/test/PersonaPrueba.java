package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    // El main es static porque no va a crear un metodo de nuestra clase
    //  Lo que hace es usar el nombre de la clase, y luego el nombre del metodo main. Accede directamente a la clase
    public static void main(String[] args) {
        Persona persona1 = new Persona("Diego");       
        Persona persona2 = new Persona("Carlos");
        
        // Desde un metodo estatico si o si se debe llamar a otro metodo estatico
        imprimir(persona1);
        imprimir(persona2);
        
        // contador = 10; -> Tampoco se puede usar THIS en un contexto estatico
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    // Pero si el contexto es dinamico si puede acceder al metodo THIS e incluso acceder a un metodo estatico
    public int getContador() {
        imprimir(new Persona("Roberto"));
        return this.contador;
    }
}
