package accesodatos;

public interface IAccesoDatos {
    /*
    Una interface es muy parecido a una clase abstracta pero si el comportamiento es lo que cambia y no tanto sus atributos,
    entonces lo correcto es usar una interface.
    Una interface es estatica, final y publica.
    No hereda de un Object
    Existe la herencia para subinterfaces
    Las clases abstractas es mejor usarlas para atributos en comun
    Las interfaces son mejores para usarlas en comportamientos en comun
    */
    int MAX_REGISTRO = 10; // Es public static final, la interface tiene solo atributos constantes
    
    // Cualquier metodo que agregemos va a ser public abstract
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
