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
import models.Categorias;
import models.CategoriasDao;
import models.Combo;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.PanelAdmin;

public class CategoriasControllers implements ActionListener, MouseListener, KeyListener {

    private Categorias cat;
    private CategoriasDao catDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriasControllers(Categorias cat, CategoriasDao catDao, PanelAdmin views) {
        this.cat = cat;
        this.catDao = catDao;
        this.views = views;
        this.views.btnRegistrarCategoria.addActionListener(this);
        this.views.btnModificarCategoria.addActionListener(this);
        this.views.btnNuevoCategoria.addActionListener(this);
        this.views.tableCategoria.addMouseListener(this);
        this.views.jLabelCategorias.addMouseListener(this);
        this.views.jMenuEliminarCategoria.addActionListener(this);
        this.views.jMenuReingresarCategoria.addActionListener(this);
        this.views.txtBuscarCategoria.addKeyListener(this);
        listarCategoria();
        llenarCategorias();
        AutoCompleteDecorator.decorate(views.cbxCategoriaPro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCategoria) {
            if (views.txtNombreCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
            } else {
                cat.setNombre(views.txtNombreCategoria.getText());

                if (catDao.registrar(cat)) {
                    limpiarTable();
                    listarCategoria();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria Registrada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            }
        } else if (e.getSource() == views.btnModificarCategoria) {
            if (views.txtIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtNombreCategoria.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son necesarios");
                } else {
                    cat.setNombre(views.txtNombreCategoria.getText());
                    cat.setId(Integer.parseInt(views.txtIdCategoria.getText()));
                    if (catDao.modificar(cat)) {
                        limpiarTable();
                        listarCategoria();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Categoria Modificada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar");
                    }
                }
            }
        } else if (e.getSource() == views.jMenuEliminarCategoria) {
            if (views.txtIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdCategoria.getText());
                if (catDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarCategoria();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Caja eliminado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la categoria");
                }
            }
        } else if (e.getSource() == views.jMenuReingresarCategoria) {
            if (views.txtIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdCategoria.getText());
                if (catDao.accion("Activo", id)) {
                    limpiarTable();
                    listarCategoria();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria reingresada con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la categoria");
                }
            }
        } else {
            limpiar();
        }
    }

    public void listarCategoria() {
        Tables color = new Tables();
        views.tableCategoria.setDefaultRenderer(views.tableCategoria.getColumnClass(0), color);
        List<Categorias> lista = catDao.ListaCategorias(views.txtBuscarCategoria.getText());
        modelo = (DefaultTableModel) views.tableCategoria.getModel();
        Object[] ob = new Object[3];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableCategoria.setModel(modelo);
        JTableHeader header = views.tableCategoria.getTableHeader();
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
        if (e.getSource() == views.tableCategoria) {
            int fila = views.tableCategoria.rowAtPoint(e.getPoint());
            views.txtIdCategoria.setText(views.tableCategoria.getValueAt(fila, 0).toString());
            views.txtNombreCategoria.setText(views.tableCategoria.getValueAt(fila, 1).toString());

        } else if (e.getSource() == views.jLabelCategorias) {
            views.jTabbedPane1.setSelectedIndex(4);
            limpiarTable();
            listarCategoria();
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
        if (e.getSource() == views.txtBuscarCategoria) {
            limpiarTable();
            listarCategoria();
        }
    }

    private void limpiar() {
        views.txtNombreCategoria.setText("");
        views.txtIdCategoria.setText("");
    }
    
    private void llenarCategorias() {
        List<Categorias> lista = catDao.ListaCategorias(views.txtBuscarCategoria.getText());
       
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            views.cbxCategoriaPro.addItem(new Combo(id, nombre));
        }
    }
}
