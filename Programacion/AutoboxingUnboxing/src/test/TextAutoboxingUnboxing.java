package test;

public class TextAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases Envolmentes (Class Wrapper) de tipos primitivos
        // Conviene un tipo primitivo al hacer muchos calculos, para converciones el tipo Object
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        // AUTOBOXING
        Integer entero = 10; // Se puede asignar directamente al tipo Object
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString()); // Se puede hacer mas operaciones, como obtener el tipo string
        System.out.println("entero double = " + entero.doubleValue()); // A tipo flotante
        
        // UNBOXING
        int entero2 = entero; // Se le extrae la literal, y tiene el valor de 10
        System.out.println("entero2 = " + entero2); // Ya no es un object, sino tipo primitivo
    }
}
