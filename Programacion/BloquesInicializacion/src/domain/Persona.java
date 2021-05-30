package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // NO ES COMUN DE USAR
    
    // Bloque de inicializacion estatico, se pone antes del constructor y bloque no estatico
    // Se crea la primera vez, se ejecuta una sola vez
    static {
        System.out.println("Ejecucion bloque estatico");
        // No se puede usar this, porque es contexto estatico
        ++Persona.contadorPersonas;
    }
    
    // Bloque de inicializacion no estatico - Se ejecuta antes del constructor de nuestra clase
    // Se ejecuta cada vez que se crea un nuevo objeto
    {
        System.out.println("Ejecucion bloque NO estatico"); // Contexto dinamico
        this.idPersona =  Persona.contadorPersonas++;
    }
    
    // Constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    // Metodo
    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
}
