package operaciones;

public class Operaciones {
    // SOBRECARGA DE METODOS -> Definir dos o mas veces al metodo a utilizar pero poniendo el mismo nombre, la diferencia es la cantidad de argumentos    
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a + b;
    }
    
    public static double sumar(double a, double b) {
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
