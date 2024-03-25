
package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection con;
    public Connection getConexion() {
        try {
            String db = "jdbc:mysql://localhost:3306/posventa_mvc";
            con = DriverManager.getConnection(db, "root", "");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } 
        return null;
    }
}
