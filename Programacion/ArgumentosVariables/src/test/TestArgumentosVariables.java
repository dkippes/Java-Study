package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 6, 10);
        
        System.out.println("Impresion nueva");
        imprimirNumeros(7, 220);
        
        System.out.println("Impresion nueva 2");
        variosParametros("Diego", 6, 33);
    }
    
    // No sabemos cuantos argumentos va a recibir, n cantidad de int
    // Se convierte en un arreglo
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
    
    // El argvar tiene que ser el ultimo en pasarse
    private static void variosParametros(String nombre, int ... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}
