package pasoporreferencia;

// Se importa la clase Persona
import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Se extiende de tipo Object
        persona1.nombre = "Diego";
        System.out.println("persona1 nombre: " +  persona1.nombre);
        
        persona1 = cambiarValor(persona1); // Aca si le pasa la referencia, y toma el nombre de Karla por ser memoria HEAP
        System.out.println("persona1 nombre: " +  persona1.nombre);
        
        Persona persona2 = null;
        persona2 = cambiarValor(persona2);
    }
    
    public static Persona cambiarValor(Persona persona) { // El tipo, y el argumento
        if(persona == null) {
            System.out.println("valor de persona invalido");
            return null;
        }
        persona.nombre = "Karla";
        return persona; // Si es void, hace un return ;
    }
}
