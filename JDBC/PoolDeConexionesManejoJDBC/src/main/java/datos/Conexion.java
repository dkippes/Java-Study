package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

// Clase de conexion para ser reutilizada
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?userSSL=false&&useTimezone=true&&serverTimezone=UTC&&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    // Pool de conexiones, se instalo Apache en las dependencias
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        // Definimos el tamano inicial del pool de conexiones - un tamaño grande puede bloquear la app
        ds.setInitialSize(5);
        return ds;
    }
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection(); // Ya no hace falta pasarle la url, user, pass porque la tiene el dataSource
    }
    
    public static void close(ResultSet rs) throws SQLException{
            rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
