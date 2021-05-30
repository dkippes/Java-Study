package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        // No se puede crear la clase hija para trabajar creamos la clase hija
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
