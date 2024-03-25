
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CajasDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(Cajas cajas) {
        String sql = "INSERT INTO cajas (nombre) VALUES (?)";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cajas.getNombre());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListarCajas(String valor) {
        List<Cajas> listaCajas = new ArrayList();
        String sql = "SELECT * FROM cajas ORDER BY estado ASC";
        String buscar = "SELECT * FROM cajas WHERE nombre LIKE '%"+valor+"%'";
        
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
                Cajas cajas = new Cajas();
                cajas.setId(rs.getInt("id"));
                cajas.setNombre(rs.getString("nombre"));
                cajas.setEstado(rs.getString("estado"));
                listaCajas.add(cajas);
            }
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaCajas;
    }
    
    public boolean modificar(Cajas cajas) {
        String sql = "UPDATE cajas SET nombre = ? WHERE id = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cajas.getNombre());
            ps.setInt(2, cajas.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return false;
    }
    
    public boolean accion(String estado, int id) {
        String sql = "UPDATE cajas SET estado = ? WHERE id = ?";
        
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
    
    // Apertura y Cierre de caja
    
    public String AbrirCaja(double monto, int id_user) {
        String sql = "INSERT INTO detalle_cajas (monto_inicial, id_user) VALUES (?, ?)";
        String consulta = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id WHERE d.estado = 1";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return "Existe";
            } else {
                ps = con.prepareStatement(sql);
                ps.setDouble(1, monto);
                ps.setInt(2, id_user);
                ps.execute();
                return "Registrado";
            }

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return "Error";
        }
    }
    
    public List ListarApertura(String valor) {
        List<AperturaCierre> lista = new ArrayList();
  
        String sql = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id ORDER BY d.fecha_apertura DESC";
        String buscar = "SELECT d.*, u.nombre FROM detalle_cajas d INNER JOIN usuarios u ON d.id_user = u.id WHERE u.nombre LIKE '%"+valor+"%' OR d.fecha_apertura LIKE '%"+valor+"%'";
        
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
                AperturaCierre apert = new AperturaCierre();
                apert.setFecha_apertura(rs.getString("fecha_apertura"));
                apert.setFecha_cierre(rs.getString("fecha_cierre"));
                apert.setMonto_inicial(rs.getDouble("monto_inicial"));
                apert.setMonto_final(rs.getDouble("monto_final"));
                apert.setTotal_ventas(rs.getInt("total_ventas"));
                apert.setNombre_usuario(rs.getString("nombre"));
                lista.add(apert);
            }
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;
    }
    
    public double montoFinal(int id_user) {
        String sql = "SELECT SUM(total) AS monto_total FROM ventas WHERE id_user = ?";
        double monto = 0.00;
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_user);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                monto = rs.getDouble("monto_total");               
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return monto;
    }
    
    public int totalVentas(int id_user)  {
        String sql = "SELECT COUNT(*) AS total FROM ventas WHERE id_user = ?";
        int total = 0;
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_user);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt("total");               
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return total;
    }
    
    public boolean cerrarCaja(AperturaCierre apert) {
        String sql = "UPDATE detalle_cajas SET fecha_cierre = ?, monto_final = ?, total_ventas = ?, estado = ? WHERE id_user = ? AND estado = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, apert.getFecha_cierre());
            ps.setDouble(2, apert.getMonto_final());
            ps.setInt(3, apert.getTotal_ventas());
            ps.setInt(4, 0);
            ps.setInt(5, apert.getId_usuario());
            ps.setInt(6, 1);
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
