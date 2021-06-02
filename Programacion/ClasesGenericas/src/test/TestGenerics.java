package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        // De esta forma creamos una clase con el tipo generico
        ClaseGenerica<Integer> objectoInt = new ClaseGenerica(15);
        objectoInt.obtenerTipo();
        
        // Debe ser un tipo compatible
        ClaseGenerica<String> objetoString = new ClaseGenerica("Diego");
        objetoString.obtenerTipo();
    }
}
