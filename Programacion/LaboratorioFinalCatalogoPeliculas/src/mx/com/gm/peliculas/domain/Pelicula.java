package mx.com.gm.peliculas.domain;

// Clase del dominio del problema o Entidad
public class Pelicula {
    // Java Bean
    private String nombre;
    
    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
