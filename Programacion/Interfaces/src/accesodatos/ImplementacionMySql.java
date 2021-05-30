package accesodatos;

// Si queremos implementar una Interface en una clase ->
public class ImplementacionMySql implements IAccesoDatos {
    // Si queremos usar esta clase, no se puede dejar como abstracta.
    // La interface permite cambiar el comportamiento manteniendo una modularidad
    // Tanto en MySql y Oracle usan las mismas operaciones de base de datos
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }
    
}
