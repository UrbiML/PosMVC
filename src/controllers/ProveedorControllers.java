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
import models.Combo;
import models.Proveedor;
import models.ProveedorDao;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.PanelAdmin;

public class ProveedorControllers implements ActionListener, MouseListener, KeyListener {

    private Proveedor pr;
    private ProveedorDao prDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProveedorControllers(Proveedor pr, ProveedorDao prDao, PanelAdmin views) {
        this.pr = pr;
        this.prDao = prDao;
        this.views = views;
        this.views.btnRegistrarProveedor.addActionListener(this);
        this.views.btnModificarProveedor.addActionListener(this);
        this.views.btnNuevoProveedor.addActionListener(this);
        this.views.tableProveedor.addMouseListener(this);
        this.views.jLabelProveedores.addMouseListener(this);
        this.views.jMenuEliminarProveedor.addActionListener(this);
        this.views.jMenuReingresarProveedor.addActionListener(this);
        this.views.txtBuscarProveedor.addKeyListener(this);        
        listarProveedores();
        llenarProveedor();
        
        AutoCompleteDecorator.decorate(views.cbxProveedorPro);
        AutoCompleteDecorator.decorate(views.cbxProveedorNuevaCompra);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarProveedor) {
            if (views.txtRucProveedor.getText().equals("") || views.txtNombreProveedor.getText().equals("") || views.txtTelefonoProveedor.getText().equals("") || views.txtDireccionProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                pr.setRuc(views.txtRucProveedor.getText());
                pr.setNombre(views.txtNombreProveedor.getText());
                pr.setTelefono(views.txtTelefonoProveedor.getText());
                pr.setDireccion(views.txtDireccionProveedor.getText());

                if (prDao.registrar(pr)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            }
        } else if (e.getSource() == views.btnModificarProveedor) {
            if (views.txtIdProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtRucProveedor.getText().equals("") || views.txtNombreProveedor.getText().equals("") || views.txtTelefonoProveedor.getText().equals("") || views.txtDireccionProveedor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    pr.setRuc(views.txtRucProveedor.getText());
                    pr.setNombre(views.txtNombreProveedor.getText());
                    pr.setTelefono(views.txtTelefonoProveedor.getText());
                    pr.setDireccion(views.txtDireccionProveedor.getText());
                    pr.setId(Integer.parseInt(views.txtIdProveedor.getText()));
                    if (prDao.modificar(pr)) {
                        limpiarTable();
                        listarProveedores();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Proveedor Modificado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Modificar");
                    }
                }
            }
        } else if (e.getSource() == views.jMenuEliminarProveedor) {
            if (views.txtIdProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdProveedor.getText());
                if (prDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor");
                }
            }
        } else if (e.getSource() == views.jMenuReingresarProveedor) {
            if (views.txtIdProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdProveedor.getText());
                if (prDao.accion("Activo", id)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor reingresado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el proveedor");
                }
            }
        } else {
            limpiar();
        }
    }

    public void listarProveedores() {
        Tables color = new Tables();
        views.tableProveedor.setDefaultRenderer(views.tableProveedor.getColumnClass(0), color);
        List<Proveedor> lista = prDao.ListaProveedores(views.txtBuscarProveedor.getText());
        modelo = (DefaultTableModel) views.tableProveedor.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getRuc();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getDireccion();
            ob[5] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableProveedor.setModel(modelo);
        JTableHeader header = views.tableProveedor.getTableHeader();
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
        if (e.getSource() == views.tableProveedor) {
            int fila = views.tableProveedor.rowAtPoint(e.getPoint());
            views.txtIdProveedor.setText(views.tableProveedor.getValueAt(fila, 0).toString());
            views.txtRucProveedor.setText(views.tableProveedor.getValueAt(fila, 1).toString());
            views.txtNombreProveedor.setText(views.tableProveedor.getValueAt(fila, 2).toString());
            views.txtTelefonoProveedor.setText(views.tableProveedor.getValueAt(fila, 3).toString());
            views.txtDireccionProveedor.setText(views.tableProveedor.getValueAt(fila, 4).toString());
        } else if (e.getSource() == views.jLabelProveedores) {
            views.jTabbedPane1.setSelectedIndex(2);
            limpiarTable();
            listarProveedores();
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
        if (e.getSource() == views.txtBuscarProveedor) {
            limpiarTable();
            listarProveedores();
        }
    }

    private void limpiar() {
        views.txtRucProveedor.setText("");
        views.txtNombreProveedor.setText("");
        views.txtTelefonoProveedor.setText("");
        views.txtDireccionProveedor.setText("");
        views.txtIdProveedor.setText("");
    }
    
    private void llenarProveedor() {
        List<Proveedor> lista = prDao.ListaProveedores(views.txtBuscarProveedor.getText());
       
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxProveedorPro.addItem(new Combo(id, nombre));
            views.cbxProveedorNuevaCompra.addItem(new Combo(id, nombre));
        }
    }
}
