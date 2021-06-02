package genericos;

// Entre <> Se pone el tipo Generico
public class ClaseGenerica<T> {
    T objecto; // No sabemos de que tipo va a ser
    
    public ClaseGenerica(T objecto){
        this.objecto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objecto.getClass().getSimpleName());
    }
}
