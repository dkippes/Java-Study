package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        // Con esto creamos un archivo en memoria, pero no se guarda
        File archivo = new File(nombreArchivo);
        // Como el PrintWriter puede fallar se agrega en un bloque try / catch
        try {
            PrintWriter salida = new PrintWriter(archivo); // Solo abrimos el archivo para escribir si deaseamps
            salida.close(); // Con esto se guarda el archivo y cierra el archivo
            System.out.println("Se ha creado el archivo");
        } catch(FileNotFoundException error) {
            error.printStackTrace(System.out); // Mandamos el error en consola
        }
    }
    
    // Si se llama diferenes veces este metodo el archivo va a ser sobreescrito, y no anexa la informacion
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido); // Aca podemos escribir en el archivo
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch(FileNotFoundException error) {
            error.printStackTrace(System.out);
        }
    }
    
    public static void anexarArchivo(String nombreArchivo, String contenido) throws IOException{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); // El FileWriter permite anexar mas informacion, el true indica que va agregar mas info
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion el archivo");
        } catch(FileNotFoundException error) {
            error.printStackTrace(System.out);
        } catch(IOException error){
            error.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            // Con esto lee lineas completas del archivo
            var entrada = new BufferedReader( new FileReader(archivo) );
            var lectura = entrada.readLine(); // Con esto solo lee la primera linea
            while(lectura != null){ // Mientras no lea una linea en blanco
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException error) {
            error.printStackTrace(System.out);
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }
}
