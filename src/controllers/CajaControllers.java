package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.AperturaCierre;
import models.Cajas;
import models.CajasDao;
import models.Combo;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.PanelAdmin;

public class CajaControllers implements ActionListener, MouseListener, KeyListener {
    
    private Cajas cajas;
    private CajasDao cajasDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public CajaControllers(Cajas cajas, CajasDao cajasDao, PanelAdmin views) {
        this.cajas = cajas;
        this.cajasDao = cajasDao;
        this.views = views;
        this.views.btnRegistrarCaja.addActionListener(this);
        this.views.btnModificarCaja.addActionListener(this);
        this.views.btnNuevoCaja.addActionListener(this);
        this.views.tableCaja.addMouseListener(this);
        this.views.jLabelCaja.addMouseListener(this);
        this.views.jMenuEliminarCaja.addActionListener(this);
        this.views.jMenuReingresarCaja.addActionListener(this);
        this.views.txtBuscarCaja.addKeyListener(this);
        this.views.btnCajas.addActionListener(this);
        this.views.btnAbrirCaja.addActionListener(this);
        this.views.btnCerrarCaja.addActionListener(this);
        this.views.btnNuevoApertura.addActionListener(this);
        llenarCajas();
        AutoCompleteDecorator.decorate(views.cbxCajaUser);
        listarApertura();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCaja) {
            RegistrarCaja();
            
        } else if (e.getSource() == views.btnModificarCaja) {
            ModificarCaja();
            
        } else if (e.getSource() == views.jMenuEliminarCaja) {
            EliminarCaja();
            
        } else if (e.getSource() == views.jMenuReingresarCaja) {
            ReingresarCaja();
            
        } else if (e.getSource() == views.btnNuevoCaja) {
            limpiar();
            
        } else if (e.getSource() == views.btnCajas) {
            views.jTabbedPane1.setSelectedIndex(11);
            limpiarTable();
            listarCajas();
            
        } // Apertura y Cierre 
        if (e.getSource() == views.btnAbrirCaja) {
            AbrirCaja();
            
        } else if (e.getSource() == views.btnCerrarCaja) {
            CerrarCaja();
            
        } else if (e.getSource() == views.btnNuevoApertura) {
            NuevoApertura();
            
        }
    }
    
    public void listarCajas() {
        Tables color = new Tables();
        views.tableCaja.setDefaultRenderer(views.tableCaja.getColumnClass(0), color);
        List<Cajas> lista = cajasDao.ListarCajas(views.txtBuscarCaja.getText());
        modelo = (DefaultTableModel) views.tableCaja.getModel();
        Object[] ob = new Object[3];
        
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableCaja.setModel(modelo);
        JTableHeader header = views.tableCaja.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }
    
    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = - 1;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tableCaja) {
            int fila = views.tableCaja.rowAtPoint(e.getPoint());
            views.txtIdCaja.setText(views.tableCaja.getValueAt(fila, 0).toString());
            views.txtNombreCaja.setText(views.tableCaja.getValueAt(fila, 1).toString());
            
        } else if (e.getSource() == views.jLabelCaja) {
            views.jTabbedPane1.setSelectedIndex(11);
            limpiarTable();
            listarCajas();
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarCaja) {
            limpiarTable();
            listarCajas();
        }
    }
    
    private void limpiar() {
        views.txtNombreCaja.setText("");
        views.txtIdCaja.setText("");
    }

    // Cajas
    private void llenarCajas() {
        List<Cajas> lista = cajasDao.ListarCajas(views.txtBuscarCaja.getText());
        
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxCajaUser.addItem(new Combo(id, nombre));
        }
    }
    
    private void RegistrarCaja() {
        if (views.txtNombreCaja.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
        } else {
            cajas.setNombre(views.txtNombreCaja.getText());
            
            if (cajasDao.registrar(cajas)) {
                limpiarTable();
                listarCajas();
                limpiar();
                JOptionPane.showMessageDialog(null, "Caja Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar");
            }
        }
    }
    
    private void ModificarCaja() {
        if (views.txtIdCaja.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            if (views.txtNombreCaja.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
            } else {
                cajas.setNombre(views.txtNombreCaja.getText());
                cajas.setId(Integer.parseInt(views.txtIdCaja.getText()));
                if (cajasDao.modificar(cajas)) {
                    limpiarTable();
                    listarCajas();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Caja Modificada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                }
            }
        }
    }
    
    private void EliminarCaja() {
        if (views.txtIdCaja.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        } else {
            int id = Integer.parseInt(views.txtIdCaja.getText());
            if (cajasDao.accion("Inactivo", id)) {
                limpiarTable();
                listarCajas();
                limpiar();
                JOptionPane.showMessageDialog(null, "Caja eliminada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la Caja");
            }
        }
    }
    
    private void ReingresarCaja() {
        if (views.txtIdCaja.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
        } else {
            int id = Integer.parseInt(views.txtIdCaja.getText());
            if (cajasDao.accion("Activo", id)) {
                limpiarTable();
                listarCajas();
                limpiar();
                JOptionPane.showMessageDialog(null, "Caja reingresada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al reingresar la Caja");
            }
        }
    }

    // Apertura y cierra
    private void AbrirCaja() {
        if (views.txtMontoInicial.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el monto inicial");
        } else {
            double monto = Double.parseDouble(views.txtMontoInicial.getText());
            int id_user = Integer.parseInt(views.txtIdUsuario.getText());
            String resultado = cajasDao.AbrirCaja(monto, id_user);
            if ("Existe".equalsIgnoreCase(resultado)) {
                JOptionPane.showMessageDialog(null, "La caja ya fue Abierta");
                limpiarTable();
                listarApertura();
                NuevoApertura();
                
            } else if ("Registrado".equalsIgnoreCase(resultado)) {
                JOptionPane.showMessageDialog(null, "Caja Abierta");
                limpiarTable();
                listarApertura();
                NuevoApertura();
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al abrir la Caja");
            }
        }
    }
    
    private void CerrarCaja() {
        int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de cerrar la caja?");
        System.out.println(pregunta);
        if (pregunta == 0) {
            double monto_final = cajasDao.montoFinal(Integer.parseInt(views.txtIdUsuario.getText()));
            int total_ventas = cajasDao.totalVentas(Integer.parseInt(views.txtIdUsuario.getText()));
            AperturaCierre apert = new AperturaCierre();
            apert.setFecha_cierre("2024-03-12 21:31:58");
            apert.setMonto_final(monto_final);
            apert.setTotal_ventas(total_ventas);
            apert.setId_usuario(Integer.parseInt(views.txtIdUsuario.getText()));
            
            if (cajasDao.cerrarCaja(apert)) {
                JOptionPane.showMessageDialog(null, "Caja Cerrada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al cerrar la caja");
            }
        }
    }
    
    private void NuevoApertura() {
        views.txtMontoInicial.setText("");
        views.txtBuscarApertura.setText("");
    }
    
    public void listarApertura() {
//        Tables color = new Tables();
//        views.tableApertura.setDefaultRenderer(views.tableApertura.getColumnClass(0), color);
        List<AperturaCierre> lista = cajasDao.ListarApertura(views.txtBuscarApertura.getText());
        modelo = (DefaultTableModel) views.tableApertura.getModel();
        Object[] ob = new Object[6];
        
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getFecha_apertura();
            ob[1] = lista.get(i).getFecha_cierre();
            ob[2] = lista.get(i).getMonto_inicial();
            ob[3] = lista.get(i).getMonto_final();
            ob[4] = lista.get(i).getTotal_ventas();
            ob[5] = lista.get(i).getNombre_usuario();
            modelo.addRow(ob);
        }
        views.tableApertura.setModel(modelo);
        JTableHeader header = views.tableApertura.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }
}
