package pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        // Estamos pasando el valor de x - Aunque l0 cambie dentro no afecta a la variable X
        cambioValor(x);
        
        System.out.println("x nuevo valor = " + x);
    }
    
    public static void cambioValor(int arg1) {
        // Recibe una copia, pero no puede cambiar el valor de x
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
