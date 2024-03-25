package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Proveedor pr) {
        String sql = "INSERT INTO proveedores (ruc, proveedor, telefono, direccion) VALUES (?, ?, ?, ?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRuc());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }        
    }

    public List ListaProveedores(String valor) {

        List<Proveedor> listaProveedores = new ArrayList();
        String sql = "SELECT * FROM proveedores ORDER BY estado ASC";
        String buscar = "SELECT * FROM proveedores WHERE ruc LIKE '%"+valor+"%' OR proveedor LIKE '%"+valor+"%'";

        try {
            con = cn.getConexion();

            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                ps = con.prepareStatement(buscar);
                rs = ps.executeQuery();
            }

            while (rs.next()) {
                Proveedor pr = new Proveedor();
                pr.setId(rs.getInt("id"));
                pr.setRuc(rs.getString("ruc"));
                pr.setNombre(rs.getString("proveedor"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setEstado(rs.getString("estado"));
                listaProveedores.add(pr);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProveedores;
    }

    public boolean modificar(Proveedor pr) {
        String sql = "UPDATE proveedores SET ruc = ?, proveedor = ?, telefono = ?, direccion = ? WHERE id = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);   
            ps.setString(1, pr.getRuc());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setInt(5, pr.getId());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean accion(String estado, int id) {
        String sql = "UPDATE proveedores SET estado = ? WHERE id = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id);
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public Proveedor getDatos(int id_compras) {
        String sql = "SELECT p.*, c.id, c.id_proveedor FROM proveedores p INNER JOIN compras c ON p.id = c.id_proveedor WHERE c.id = ?";
        Proveedor pro = new Proveedor();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_compras);
            rs = ps.executeQuery();
            
            if (rs.next()) {

                pro.setNombre(rs.getString("proveedor"));
                pro.setDireccion(rs.getString("direccion"));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pro;
    }
}
