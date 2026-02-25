package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL =
        "jdbc:postgresql://localhost:5432/BD_GestionVivienda";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Contraseña del PostgreSQL";

    public static Connection getConexion() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a PostgreSQL");
        } catch (SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
        return conn;
    }
}
