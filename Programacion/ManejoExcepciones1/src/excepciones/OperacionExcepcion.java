// Puede extenderse de 
package excepciones;

public class OperacionExcepcion extends Exception {
    // Si hago extends RuntimeException no hace falta poner el try catch y es mas recomendable para mejor codigo limpio
    // Para definir nuestra propia clase de Exception
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
