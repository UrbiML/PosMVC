
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ComprasDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListaCompras(String valor) {
        List<Compras> listaCompras = new ArrayList();
        String sql = "SELECT c.*, p.proveedor FROM compras c INNER JOIN proveedores p ON c.id_proveedor = p.id ORDER BY c.id DESC";
        String buscar = "SELECT c.*, p.proveedor FROM compras c INNER JOIN proveedores p ON c.id_proveedor = p.id WHERE p.proveedor LIKE '%"+valor+"%' OR c.fecha LIKE '%"+valor+"%'";
        
        try {
            con = cn.getConexion();
            
            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
            } else {
                ps = con.prepareStatement(buscar);               
            }
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Compras com = new Compras();
                com.setId(rs.getInt("id"));
                com.setId_proveedor(rs.getInt("id_proveedor"));
                com.setTotal(rs.getDouble("total"));
                com.setFecha(rs.getString("fecha"));
                com.setNombreProveedor(rs.getString("proveedor"));
                listaCompras.add(com);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaCompras;
    }
}
