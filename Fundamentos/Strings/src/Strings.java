
public class Strings {

    public static void main(String args[]) {
        var usuario = "Diego";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println(i + j); // Realiza la suma de numeros
        System.out.println(i + j + usuario); // Se realiza primero la suma y luego concatena
        System.out.println(usuario + i + j); // Primero concatena y luego agrega el resto como una cadena
        System.out.println(usuario + (i + j)); // Primero realiza lo dentro del parentesis y luego lo agrega a la cadena
    }
}
