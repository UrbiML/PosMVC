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
import models.Medidas;
import models.MedidasDao;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.PanelAdmin;

public class MedidasControllers implements ActionListener, MouseListener, KeyListener {

    private Medidas med;
    private MedidasDao medDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public MedidasControllers(Medidas med, MedidasDao medDao, PanelAdmin views) {
        this.med = med;
        this.medDao = medDao;
        this.views = views;
        this.views.btnRegistrarMedida.addActionListener(this);
        this.views.btnModificarMedida.addActionListener(this);
        this.views.btnNuevoMedida.addActionListener(this);
        this.views.tableMedida.addMouseListener(this);
        this.views.jLabelMedidas.addMouseListener(this);
        this.views.jMenuEliminarMedida.addActionListener(this);
        this.views.jMenuReingresarMedida.addActionListener(this);
        this.views.txtBuscarMedida.addKeyListener(this);
        listarMedida();
        llenarMedidas();
        AutoCompleteDecorator.decorate(views.cbxMedidaPro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarMedida) {
            if (views.txtNombreMedida.getText().equals("") || views.txtNombreCortoMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
            } else {
                med.setNombre(views.txtNombreMedida.getText());
                med.setNombre_corto(views.txtNombreCortoMedida.getText());

                if (medDao.registrar(med)) {
                    limpiarTable();
                    listarMedida();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Medida Registrada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            }
        } else if (e.getSource() == views.btnModificarMedida) {
            if (views.txtIdMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtNombreMedida.getText().equals("") || views.txtNombreCortoMedida.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
                } else {
                    med.setNombre(views.txtNombreMedida.getText());
                    med.setNombre_corto(views.txtNombreCortoMedida.getText());
                    med.setId(Integer.parseInt(views.txtIdMedida.getText()));
                    if (medDao.modificar(med)) {
                        limpiarTable();
                        listarMedida();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Medida modifica con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar");
                    }
                }
            }
        } else if (e.getSource() == views.jMenuEliminarMedida) {
            if (views.txtIdMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdMedida.getText());
                if (medDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarMedida();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Medida eliminada con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Medida");
                }
            }
        } else if (e.getSource() == views.jMenuReingresarMedida) {
            if (views.txtIdMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdMedida.getText());
                if (medDao.accion("Activo", id)) {
                    limpiarTable();
                    listarMedida();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Medida reingresada con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la Medida");
                }
            }
        } else {
            limpiar();
        }
    }

    public void listarMedida() {
        Tables color = new Tables();
        views.tableMedida.setDefaultRenderer(views.tableMedida.getColumnClass(0), color);
        List<Medidas> lista = medDao.ListaMedidas(views.txtBuscarMedida.getText());
        modelo = (DefaultTableModel) views.tableMedida.getModel();
        Object[] ob = new Object[4];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getNombre_corto();
            ob[3] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableMedida.setModel(modelo);
        JTableHeader header = views.tableMedida.getTableHeader();
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
        if (e.getSource() == views.tableMedida) {
            int fila = views.tableMedida.rowAtPoint(e.getPoint());
            views.txtIdMedida.setText(views.tableMedida.getValueAt(fila, 0).toString());
            views.txtNombreMedida.setText(views.tableMedida.getValueAt(fila, 1).toString());
            views.txtNombreCortoMedida.setText(views.tableMedida.getValueAt(fila, 2).toString());

        } else if (e.getSource() == views.jLabelMedidas) {
            views.jTabbedPane1.setSelectedIndex(5);
            limpiarTable();
            listarMedida();
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
        if (e.getSource() == views.txtBuscarMedida) {
            limpiarTable();
            listarMedida();
        }
    }
    
    private void limpiar() {
        views.txtNombreMedida.setText("");
        views.txtNombreCortoMedida.setText("");
        views.txtIdMedida.setText("");
    }
    
    private void llenarMedidas() {
        List<Medidas> lista = medDao.ListaMedidas(views.txtBuscarMedida.getText());
       
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxMedidaPro.addItem(new Combo(id, nombre));
        }
    }
}
