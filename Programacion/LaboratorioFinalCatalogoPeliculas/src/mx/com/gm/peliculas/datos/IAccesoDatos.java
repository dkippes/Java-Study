package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

// Una interface es como una clase abastracta, pero abstrae los metodos para que sea utilizable por otras clases
public interface IAccesoDatos {

    /**
     * Es un metodo que se usa para saber si existe un recurso, en este caso un archivo
     * @param nombreRecurso
     * @return Un boolano
     * @throws AccesoDatosEx -> Firmamos el metodo diciendo que puede arrojar una excepcion
     */
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    /**
     * Lista una lista de tipo Pelicula de un archivo dado
     * @param nombreRecurso
     * @return una lista de tipo Pelicula
     * @throws LecturaDatosEx
     */
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    /**
     * No devuelve nada, permite escribir sobre un recurso
     * @param pelicula
     * @param nombreRecurso
     * @param anexar
     * @throws EscrituraDatosEx
     */
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    /**
     * Busca una cadena dentro de un recurso dado
     * @param nombreRecurso
     * @param buscar
     * @return Retorna un String
     * @throws LecturaDatosEx
     */
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    /**
     * Crea un recurso que es una cadena
     * @param nombreRecurso
     * @throws AccesoDatosEx
     */
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    /**
     * Borra un recurso que es una cadena
     * @param nombreRecurso
     * @throws AccesoDatosEx
     */
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
