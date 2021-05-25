
import java.util.Scanner;

// Mi clase en Java
/*

*/
public class Scanners {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        
        System.out.println("Escribe tu titulo:");
        var titulo = consola.nextLine();
        
        var tituloUsuario = titulo + ". " + usuario;
        System.out.println("Bienvenido usuario: " + tituloUsuario);
    }
}
