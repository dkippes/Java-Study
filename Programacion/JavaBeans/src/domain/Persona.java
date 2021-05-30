package domain;

// Para que esta clase sea un Java Beans, tiene que implementar la interface Serializable
// Un JavaBeans es lo que utilizan tecnologias mas avanzadas
// Si hay que mandarlo por red, entonces es necesario que sea Serializable porque convierte los objetos a 0 y 1
// Deserializacion convierte los 0 y 1 a Objectos

import java.io.Serializable;

public class Persona implements Serializable {
    // Es REQUERIDO: Los atributos tienen que ser privados para que se considero un Java Beans
    private String nombre;
    private String apellido;
    
    // Es REQUERIDO: Debe tener un constructor vacio y publico para que sea un Java Beans, Spring y diferentes frameworks usan de esta forma
    public Persona() {
        
    }
    
    // Se puede crear otros constructores si asi se necesita
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Es REQUERIDO: tener un getter y setter para cada atributo privado
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // No es necesario tener hashCode, equals o toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
