
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
import models.ProductosDao;
import models.Ventas;
import models.VentasDao;
import views.PanelAdmin;

public class VentasControllers implements KeyListener, ActionListener, MouseListener{

    private Ventas vent;
    private VentasDao ventDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public VentasControllers(Ventas vent, VentasDao ventDao, PanelAdmin views) {
        this.vent = vent;
        this.ventDao = ventDao;
        this.views = views;
        this.views.txtBuscarVentas.addKeyListener(this);
        this.views.btnHistorialVentas.addActionListener(this);
        this.views.tableVentas.addMouseListener(this);
        listarVentas();
    }

    public void listarVentas() {
        List<Ventas> lista = ventDao.ListaVentas(views.txtBuscarVentas.getText());
        modelo = (DefaultTableModel) views.tableVentas.getModel();
        Object[] ob = new Object[4];
        
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombreCliente();
            ob[2] = lista.get(i).getTotal();
            ob[3] = lista.get(i).getFecha();
            modelo.addRow(ob);
        }
        views.tableVentas.setModel(modelo);
        JTableHeader header = views.tableVentas.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }
    
    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i =- 1;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == views.txtBuscarVentas) {
            limpiarTable();
            listarVentas();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnHistorialVentas) {           
            if (views.txtIdVenta.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila");
            } else {
                int id_venta = Integer.parseInt(views.txtIdVenta.getText());
                ProductosDao proDao = new ProductosDao();
                proDao.generarReporteVenta(id_venta);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tableVentas) {
            int fila = views.tableVentas.rowAtPoint(e.getPoint());
            views.txtIdVenta.setText(views.tableVentas.getValueAt(fila, 0).toString());
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
}

