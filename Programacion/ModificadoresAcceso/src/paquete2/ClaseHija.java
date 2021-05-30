package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        // Accedemos al los atributos protegidos
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtected();
    }
}
