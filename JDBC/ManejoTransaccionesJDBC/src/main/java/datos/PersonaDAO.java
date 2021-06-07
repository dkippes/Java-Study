package datos;

// Una transacciones permite hacer rollback de varias sentencias sql, para eso se tiene que tener una sola conexion y no cerrar todo el tiempo
// Sino no se puede hacer rollback
import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    // El ?, son parametros
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    
    public PersonaDAO() {
        
    }
    
    // Esta conexion no se va cerrar al ejecutar uno de los metodos siguientes, se mantiene abierta
    public PersonaDAO(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    public List<Persona> seleccionar() throws SQLException{ // throws SQLException Al poner esto avisa que puede haber un error, pero aca no se procesa
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection(); // Activamos conexion a la db
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while( rs.next() ){
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                persona = new Persona();
                persona.setIdPersona(idPersona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);
                
                personas.add(persona);
            }
        } finally {
            try {
                close(rs);
                close(stmt);
                if( this.conexionTransaccional == null ){
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return personas;
    }
    
    public int insertar(Persona persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            // Con esto le paso los valores a los parametros 
            stmt.setString(1, persona.getNombre()); // El 1 en parametro es para indicar que es el parametro 1
            stmt.setString(2, persona.getApellido()); // El 2 es el segundo parametro etc..
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();
        } finally {
            try {
                close(stmt);
                if( this.conexionTransaccional == null ){
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Persona persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            // Con esto le paso los valores a los parametros 
            stmt.setString(1, persona.getNombre()); // El 1 en parametro es para indicar que es el parametro 1
            stmt.setString(2, persona.getApellido()); // El 2 es el segundo parametro etc..
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                if( this.conexionTransaccional == null ){
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int eliminar(Persona persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            // Con esto le paso los valores a los parametros 
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                if( this.conexionTransaccional == null ){
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
}
