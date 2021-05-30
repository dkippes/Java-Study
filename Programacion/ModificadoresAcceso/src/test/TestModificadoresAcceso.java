package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

/*
public -> Poco restrictivo
protected -> Solo restinge si no es una clase hija o extends
default o package (no se agrega nada adelante) -> Solo se puede usar en el mismo package, no fuera de el
private -> No funciona en clases, solo variables, metodos y atributos
*/

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        System.out.println("");
        
        // A la clase, atributo o metodo que tenga protected si no es extended no se puede usar
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}
