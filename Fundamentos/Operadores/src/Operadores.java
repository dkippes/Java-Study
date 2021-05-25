/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Operadores {
    public static void main(String args[]) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultados suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a / b; // Si alguna de estas es de tipo flotante devuelve tipo flotante
        System.out.println("resultado division entero = " + resultado); // Es es tipo entero entonces no da un tipo flotante
        
        resultado = a % b; // Modulo
        System.out.println("resultado modulo = " + resultado);
        
        
        /************************************* OPERADORES DE ASIGNACION *************************************/
        System.out.println("************************************* OPERADORES DE ASIGNACION *************************************");
        int c = a + 5 - b;
        System.out.println("c es: " + c);
        
        // a -= 2;
        // System.out.println("a - 2: " + a);
        
        /************************************* OPERADORES UNARIOS *************************************/
        System.out.println("************************************* OPERADORES UNARIOS *************************************");
        b = -a;
        System.out.println("b esta invertido -a: " + b);
        
        var d = true;
        var e = !d;
        System.out.println("d es: " + d + " | e es: " + e);
        
        var f = 3;
        var g = ++f; // primero se incrementa la variable y despues se usa su valor
        System.out.println("f es: " + f + " | g es: " + g);
        
        // PostIncremento
        var h = 5;
        var i = h++; // primero se utiliza el valor y despues se incrementa
        System.out.println("h es: " + h + " | i es: " + i);
        
        // Predecremento
        var j = 2;
        var k = --j;
        System.out.println("j = " + j); // Ya esta decrementada
        System.out.println("k = " + k);
        
        var l = 2;
        var m = --l;
        System.out.println("l = " + l); // primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("m = " + m); // teia pendiente un decremento
        
        
        /************************************* OPERADORES DE IGUALDAD Y RELACIONALES *************************************/
        System.out.println("************************************* OPERADORES DE IGUALDAD Y RELACIONALES *************************************");
        var n = (a == b); // !=, 
        System.out.println("n es: " + n);
        
        // Se puede usar >, >=, <,  <=
        
        // USO DE CADENAS
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var compararReferenciaCadena = (cadena1 == cadena2); // compara referencias de objetos
        System.out.println("compararReferenciaCadena = " + compararReferenciaCadena);
        
        var compararContenidoCadena = cadena1.equals(cadena2); // comparamos contenido de cadenas
        System.out.println("compararContenidoCadena = " + compararContenidoCadena);
        
        
        /************************************* OPERADORES CODICIONALES *************************************/
        System.out.println("************************************* OPERADORES CODICIONALES *************************************");
        var numero =  10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultadoCondicionalAnd = numero >= valorMinimo && numero <= valorMaximo; // AND
        if(resultadoCondicionalAnd) {
            System.out.println("numero: "+ numero + " Dentro de rango");
        } else {
            System.out.println("numero: "+ numero + " Fuera de rango");
        }
        
        var vaciaciones = false;
        var diaDescanso = false;
        
        if( vaciaciones || diaDescanso ) { // OR
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta  ocupado");
        }
        
        
        /************************************* OPERADOR TERNARIO *************************************/
        System.out.println("************************************* OPERADOR TERNARIO *************************************");
        var resultadoTernario = (3 > 2)
                                    ? "verdadero" 
                                    : "false" ;
        System.out.println("resultadoTernario (3>2): " + resultadoTernario);
    }
}