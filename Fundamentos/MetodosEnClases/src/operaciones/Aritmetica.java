package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a, b; // Valor por default es 0 -> NO  SE PUEDE USAR VAR EN CLASES
    
    // Constructor vacio
    public  Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    // Sobrecarga de constructores -> Agregar mas de 1 constructor
    public Aritmetica(int a, int b)  {
        this.a  = a;
        this.b  = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    // Metodos de la clase
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado de la suma = " + resultado);
    }
    
    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }
    
    public int sumarConArgumentos(int a, int b) {
        // this permite diferencia argumentos de  clases, si pongo this.a se que se refiere al atributo de la clase
        this.a = a; // El argumento a, se asigna al atriburo this.a
        this.b = b;
        return sumarConRetorno(); // Se puede reutilizar un metodo ya armado
    }
}
