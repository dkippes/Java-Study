package domain;

public class Persona {
    // this es para atributos que son dinamicos
    // el nombre de la clase ej: Persona, para atributos que on estaticos 
    private int idPersona; // Se incrementa la variable automaticamente
    private String nombre;
    
    // No conviene usar this con una variable estatica ya que...
    private static int contadorPersonas; // Esta variable se asocia con la clase
    
    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementa el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        // Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    // Metodos dinamicos -> Cuando ya se carga el objeto y empezamos a trabajar con los objectos, puede acceder al contexto estatico porque puede acceder a la clase
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodos estaticos -> Cuando se trabaja con la clase, no puede acceder al contexto dinamico (objectos)
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override // Anotacion
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
