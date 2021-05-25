
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]) {
        /* Tipos Primitivos Eteros
        byte: 8 bits, estos 8 bits se almacenan en una estructura  de 32 o 64 bits (-128 a 127)
        short: 16 bits (-32.768 a 32.767)
        int:  32 bits -> El mas comun porque los cpu son de 32 o 64 bits (-2 elevado a 31 a 2 elevado a 31 - 1)
        long: 64 bits (-2 elevado a 63 a 2 elevado a 63 - 1)
        */
        // Si se pasa de su rango hay perdida de precision.
        byte numeroByte = (byte)129; // Como el rango es hasta 127 hay problemas, pero de esta forma convierte el 129 a bytes
        System.out.println(numeroByte);
        System.out.println("Rango Byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);

        short numeroShort = (short)32768; 
        System.out.println(numeroShort);
        System.out.println("Rango Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L; // Se tiene que poner la L al final para convertilo a tipo Long
        System.out.println(numeroInt);
        System.out.println("Rango Integer: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println(numeroLong);
        System.out.println("Rango Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        
        /* Tipos Primitivos Flotantes
        float: 32bits
        double: 64bits -> Es el valor maximo en java
        */
        float numeroFloat = 10.0F;
        System.out.println(numeroFloat);
        System.out.println("Rango Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println(numeroDouble);
        System.out.println("Rango Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        
        /* Inferencia de Tipos con Var y tipos Primitivos */
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble2 = 10.0;
        System.out.println("numeroDouble2 = " + numeroDouble2);
        
        var numeroFloat2 = 10.0F;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        
        
        /* Tipos Primitivos Char
        char: 16bits
        */
        char miCaracter = 'a'; // Caracter unicode
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021'; // Ingresa un caracter unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; // Ingresa un caracter unicode
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var miCaracter1 = 'a'; // Con tipo var
        System.out.println("miCaracter1 = " + miCaracter1);
        
        var varChar1 = '\u0021'; // Ingresa un caracter unicode
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal1 = 33; // Ingresa un caracter unicode
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        
        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
        
        /* Tipo primitivo Booleano */
        boolean varBoolean = false;
        boolean varBoolean1 = true;
        System.out.println("varBoolean = " + varBoolean);
        System.out.println("varBoolean1 = " + varBoolean1);
        
        var esAdulto = 30 >= 18;
        System.out.println("esAdulto = " + esAdulto);
        
        /* Convertir tipo String a tipo Int */
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporcioa tu edad: ");
        edad = Integer.parseInt( consola.nextLine() );
        System.out.println("edad: " + edad);
        
        /* Convertir tipo Int a String */
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporcioa un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracters5: " + caracter);
    }
}
