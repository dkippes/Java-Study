package clases;

public class Persona {
    // Atributos de la clase
    public String nombre; // No es buena practica, pero se pone para poder acceder estos valores desde otro paquete
    public String apellido;
    
    // Metodos de la clase
    public void desplegarInformacion() { // Public quiere decir que cualquiera puede usarla, y void indica que no retorna nada
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}

