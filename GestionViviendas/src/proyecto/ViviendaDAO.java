/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViviendaDAO {

    public static void listarViviendas() {

        String sql = "SELECT * FROM vivienda";

        try (
            Connection conn = ConexionBD.getConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {

            System.out.println("VIVIENDAS DESDE LA BD:");

            while (rs.next()) {
                System.out.println(
                    rs.getString("id_vivienda") + " | " +
                    rs.getString("direccion") + " | " +
                    rs.getString("tipo") + " | " +
                    rs.getString("estado") + " | Disponible: " +
                    rs.getBoolean("disponible")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
