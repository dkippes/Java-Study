package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt"; // Se puede poner rutas "c:\\carpeta\\prueba.txt"; -> Windows, "carpeta/prueba.txt" -> Linux
        // crearArchivo(nombreArchivo); // -> Se comento porque el archivo ya fue creado, si se vuelve a crear se pone en blanco
        
        // escribirArchivo(nombreArchivo, "Hola desde Java");
        // escribirArchivo(nombreArchivo, "adios"); -> Sobreescribe al enterior
        
        // anexarArchivo(nombreArchivo, "Mas informacion"); -> Agrega mas informacion sin pisarla
        // anexarArchivo(nombreArchivo, "Adiosss");
        
        leerArchivo(nombreArchivo); // Lee todo el archivo
    }
}
