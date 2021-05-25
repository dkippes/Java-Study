package domain;

// Si Persona tiene final no puede hederar de esa clase
public class Empleado extends Persona {
    // El metodo no puede sobreescribirse de la clase padre si esta marcado como final
    public void imprimir(){
        System.out.println("Metodo imprimir desde clase hija");
    }
}
