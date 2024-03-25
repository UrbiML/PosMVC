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
import models.Clientes;
import models.ClientesDao;
import models.Combo;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.PanelAdmin;

public class ClientesControllers implements ActionListener, MouseListener, KeyListener {

    private Clientes cl;
    private ClientesDao clDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ClientesControllers(Clientes cl, ClientesDao clDao, PanelAdmin views) {
        this.cl = cl;
        this.clDao = clDao;
        this.views = views;
        this.views.btnRegistrarCliente.addActionListener(this);
        this.views.btnModificarCliente.addActionListener(this);
        this.views.btnNuevoCliente.addActionListener(this);
        this.views.tableCliente.addMouseListener(this);
        this.views.jMenuEliminarCliente.addActionListener(this);
        this.views.jMenuReingresarCliente.addActionListener(this);
        this.views.txtBuscarCliente.addKeyListener(this);
        this.views.jLabelClientes.addMouseListener(this);
        listarClientes();
        llenarClientes();
        AutoCompleteDecorator.decorate(views.cbxClienteVenta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCliente) {
            if (views.txtNombreCliente.getText().equals("") || views.txtTelefonoCliente.getText().equals("") || views.txtDireccionCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                cl.setNombre(views.txtNombreCliente.getText());
                cl.setTelefono(views.txtTelefonoCliente.getText());
                cl.setDireccion(views.txtDireccionCliente.getText());

                String respuesta = clDao.registrar(cl);
                switch (respuesta) {
                    case "existe" ->
                        JOptionPane.showMessageDialog(null, "El telefono del cliente debe ser unico");
                    case "registrado" -> {
                        limpiarTable();
                        listarClientes();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Cliente Registrado");
                    }
                    default ->
                        JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            }
        } else if (e.getSource() == views.btnModificarCliente) {
            if (views.txtIdCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una la fila");
            } else {
                if (views.txtNombreCliente.getText().equals("") || views.txtTelefonoCliente.getText().equals("") || views.txtDireccionCliente.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    cl.setNombre(views.txtNombreCliente.getText());
                    cl.setTelefono(views.txtTelefonoCliente.getText());
                    cl.setDireccion(views.txtDireccionCliente.getText());
                    cl.setId(Integer.parseInt(views.txtIdCliente.getText()));

                    String respuesta = clDao.modificar(cl);
                    switch (respuesta) {
                        case "existe" ->
                            JOptionPane.showMessageDialog(null, "El telefono del cliente debe ser unico");
                        case "modificado" -> {
                            limpiarTable();
                            listarClientes();
                            limpiar();
                            JOptionPane.showMessageDialog(null, "Cliente Modificado");
                        }
                        default ->
                            JOptionPane.showMessageDialog(null, "Error al Modificar");
                    }
                }
            }
        } else if (e.getSource() == views.jMenuEliminarCliente) {
            if (views.txtIdCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdCliente.getText());
                if (clDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarClientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
                }
            }
        } else if (e.getSource() == views.jMenuReingresarCliente) {
            if (views.txtIdCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdCliente.getText());
                if (clDao.accion("Activo", id)) {
                    limpiarTable();
                    listarClientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente reingresado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el cliente");
                }
            }
        } else {
            limpiar();
        }
    }

    public void listarClientes() {
        Tables color = new Tables();
        views.tableCliente.setDefaultRenderer(views.tableCliente.getColumnClass(0), color);
        List<Clientes> lista = clDao.ListaClientes(views.txtBuscarCliente.getText());
        modelo = (DefaultTableModel) views.tableCliente.getModel();
        Object[] ob = new Object[5];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getTelefono();
            ob[3] = lista.get(i).getDireccion();
            ob[4] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableCliente.setModel(modelo);
        JTableHeader header = views.tableCliente.getTableHeader();
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
        if (e.getSource() == views.tableCliente) {
            int fila = views.tableCliente.rowAtPoint(e.getPoint());
            views.txtIdCliente.setText(views.tableCliente.getValueAt(fila, 0).toString());
            views.txtNombreCliente.setText(views.tableCliente.getValueAt(fila, 1).toString());
            views.txtTelefonoCliente.setText(views.tableCliente.getValueAt(fila, 2).toString());
            views.txtDireccionCliente.setText(views.tableCliente.getValueAt(fila, 3).toString());

        } else if (e.getSource() == views.jLabelClientes) {
            views.jTabbedPane1.setSelectedIndex(1);
            limpiarTable();
            listarClientes();
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
        if (e.getSource() == views.txtBuscarCliente) {
            limpiarTable();
            listarClientes();
        }
    }

    private void limpiar() {
        views.txtNombreCliente.setText("");
        views.txtTelefonoCliente.setText("");
        views.txtDireccionCliente.setText("");
        views.txtIdCliente.setText("");
    }

    private void llenarClientes() {
        List<Clientes> lista = clDao.ListaClientes(views.txtBuscarCliente.getText());

        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxClienteVenta.addItem(new Combo(id, nombre));
        }
    }
}
