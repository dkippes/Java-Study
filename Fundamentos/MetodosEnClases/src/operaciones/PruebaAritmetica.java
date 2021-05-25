package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        /*
        MEMORIA STACK -> Espacio de memoria para variables locales
        MEMORIA  HEAP -> Espacio de memoria para  variables tipo Object
        
        El heap queda  en memoria hasta que termina el programa.
        System.gc(); -> Se ocupa de borrar todos los objetos, no es comun que se use porque es bastante pesado
        */
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        miMetodo();
        
        int resultadoConRetorno = aritmetica1.sumarConRetorno();
        System.out.println("resultadoConRetorno = " + resultadoConRetorno);
        
        int sumarConArgumentos = aritmetica1.sumarConArgumentos(335, 10);
        System.out.println("sumarConArgumentos = " + sumarConArgumentos);
        
        Aritmetica aritmetica2 = new Aritmetica(3, 15); // Constructor con argumentos
        
    }
    
    public static void miMetodo() {
        //La variable a esta fuera del alcance donde fue definida
        //a= 10
        System.out.println("Otro  metodo");
    }
}
