package paquete1;

public class ClasePrivada {
    private String atributoPrivado = "Valor atributo privado";
    
    // Si tuviera clase  hija no se puede usar super()
    private ClasePrivada(){
        System.out.println("Constructor privado");
    }
    
    public ClasePrivada(String argumento){
        System.out.println("Constructor publico del privado");
    }
    
    private void metodoPrivado(){
            System.out.println("Metodo privado");
    }
}
