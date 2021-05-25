
import java.util.Scanner;

// Mi clase en Java
/*

*/
public class TareaLibro {
    public static void main(String args[]) {
        System.out.println("Proporcione el titulo del libro: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        
        System.out.println("Proporcione el autor del libro: ");
        var autor = consola.nextLine();
        
        System.out.println("El " + titulo + " fue escrito por " + autor);
    }
}
