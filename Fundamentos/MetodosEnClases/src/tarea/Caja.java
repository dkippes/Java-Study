package tarea;

public class Caja {
    // Atributos
    int ancho, alto, profundo;
    
    public Caja() {
        System.out.println("Ejecutando constructor vacio de Caja");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        System.out.println("Ejecutando caja con argumentos");
        this.ancho  = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // Metodos
    public int calcularVolumen(int ancho, int alto, int profundo) {
        return (ancho * alto * profundo);
    }
}
