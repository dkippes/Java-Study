package test;

import domain.*;

public class TestConversionObjectos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        // System.out.println("empleado = " + empleado);
        
        // Al tener 3 agumentos y uno de tipo escritura nos devuelve el tipo Escritor - Polimorfismo
        System.out.println(empleado.obtenerDetalles());
        
        // Si queremos acceder a getTipoEscritura() de Escritor no podemos, necesitamos convertirlo
        // Downcasting accede de la clase padre Empleado a Escritor
        ((Escritor)empleado).getTipoEscritura();
        
        // Upcasting -> Convierte de hijo a padre, Escritor a Empleado - No es necesario hacer una conversion explicita
    }
}
