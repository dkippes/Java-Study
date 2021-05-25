package domain;

// Empleado no puede heredar la clase persona al escribir FINAL
// No puede tener clases hijas
public final class Persona {
    // Esta convinacion es una practica para generar constates
    public final static int MI_CONSTANTE = 1;
    
    // Las clases hijas no van a poder modificar el comportamiento
    public final imprimir(){
        System.out.println("Metodo imprimir desde persona");
    }
}
