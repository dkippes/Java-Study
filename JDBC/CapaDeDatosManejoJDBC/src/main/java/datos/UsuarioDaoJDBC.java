package datos;

import static datos.Conexion.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class UsuarioDaoJDBC implements UsuarioDao{
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_usuario, username, password FROM usuario";
    // El ?, son parametros
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    
    public UsuarioDaoJDBC() {
        
    }
    
    // Esta conexion no se va cerrar al ejecutar uno de los metodos siguientes, se mantiene abierta
    public UsuarioDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    public List<UsuarioDTO> select() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection(); // Activamos conexion a la db
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while( rs.next() ){
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
                
                usuario = new UsuarioDTO();
                usuario.setIdUsuario(idUsuario);
                usuario.setUsername(username);
                usuario.setPassword(password);
                
                usuarios.add(usuario);
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
        
        return usuarios;
    }
    
    public int insert(UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            // Con esto le paso los valores a los parametros 
            System.out.println("ejecutando query: " + SQL_INSERT);
            stmt.setString(1, usuario.getUsername()); // El 1 en parametro es para indicar que es el parametro 1
            stmt.setString(2, usuario.getPassword()); // El 2 es el segundo parametro etc..
            
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados: " + registros);

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
    
    public int update(UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            System.out.println("ejecutando query: " + SQL_UPDATE);
            // Con esto le paso los valores a los parametros 
            stmt.setString(1, usuario.getUsername()); // El 1 en parametro es para indicar que es el parametro 1
            stmt.setString(2, usuario.getPassword()); // El 2 es el segundo parametro etc..
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados: " + registros);

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
    
    public int delete(UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            System.out.println("ejecutando query: " + SQL_UPDATE);
            // Con esto le paso los valores a los parametros 
            stmt.setInt(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados: " + registros);

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
