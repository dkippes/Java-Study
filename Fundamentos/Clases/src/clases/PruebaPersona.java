package clases;

public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Instancia
        persona1.nombre = "Diego";
        persona1.desplegarInformacion();
        
        System.out.println("persona1(direccion de memoria) = " + persona1);
    }
}
