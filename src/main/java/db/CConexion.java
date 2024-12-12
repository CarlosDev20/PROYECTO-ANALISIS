package db;

import java.sql.*;

public class CConexion {

    // URL de la base de datos que se va a conectar
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/analisis?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    // Almacena el nombre de usuario para conectarse a la base de datos
    private static final String JDBC_USER = "root";
    // Almacena la contraseña del usuario para la conexion,
    private static final String JDBC_PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
