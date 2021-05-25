package palabrathis;

public class PalabraThis {
    // THIS va apuntando a los objectos segun el objecto que se va ejecutando en ese momento
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona nombre: " + persona.apellido);
    }
}

class Persona { // Si no se le pone "public", es default o package, se puede acceder desde cualquier archivo que este dentro del package
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        // super(); Llama implicitamente al constructor de la clase Padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    // Este codigo no es necesario
    public Imprimir(){
        super(); // el constructor de la clase object (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual(this): " + this); // this hace referencia a la clase Imprimir
    }
}