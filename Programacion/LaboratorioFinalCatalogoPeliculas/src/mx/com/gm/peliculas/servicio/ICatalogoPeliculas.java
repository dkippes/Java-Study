package mx.com.gm.peliculas.servicio;

// Esto se llama capa de negocio o logica de negocio
public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
