package paquete1;

// se puede usar en todos lados, no hay restriccion
public class Clase1 {
    // Atributo publico
    public String atributoPublico = "Valor atributo publico";
    
    protected String atributoProtected = "Valor atributo protected";
    
    // Constructor publico -> No hay problema en usarlo
    public Clase1(){
        System.out.println("Constructor publico");
    }
    
    // Constructor protected -> No hay problema en usarlo
    // Solo se puede usar desde clases hijas o que tengan extended, sino marca error
    // Se usa super() en la clase hija
    protected Clase1(String protegido){
        System.out.println("Constructor " + protegido);
    }
    
    // metodos publicos -> No hay problema en usarlo
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    // metodos protected
    // Solo se puede usar desde clases hijas o que tengan extended, sino marca error
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
