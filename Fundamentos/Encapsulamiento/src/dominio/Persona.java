package dominio;

public class Persona {
    // La mejor practica es con private
    // Si no se pone private, se dice que son de tipo default o package
    // Si la clase esta en una package y se quiere usar en otro va a dar error ya que esta definido fuera del package
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double  sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    // get y set siempre son publicos
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){ // Modifica
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){ // En boolean se pone is, no get
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    // toString, es comun definirlo asi se puede usar para que mande a imprimir todo el objeto
    public String toString(){
        return "Persona [ nombre: " + this.nombre + 
                " , sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + " ]";
    }
}
