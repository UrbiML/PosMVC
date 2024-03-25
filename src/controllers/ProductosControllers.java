package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Combo;
import models.Productos;
import models.ProductosDao;
import models.Tables;
import models.VentasDao;
import views.PanelAdmin;

public class ProductosControllers implements ActionListener, MouseListener, KeyListener {

    private Productos pro;
    private ProductosDao proDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp;

    public ProductosControllers(Productos pro, ProductosDao proDao, PanelAdmin views) {
        this.pro = pro;
        this.proDao = proDao;
        this.views = views;
        this.views.btnRegistrarPro.addActionListener(this);
        this.views.btnModificarPro.addActionListener(this);
        this.views.btnNuevoPro.addActionListener(this);
        this.views.jMenuEliminarProducto.addActionListener(this);
        this.views.jMenuReingresarProducto.addActionListener(this);
        this.views.txtBuscarProducto.addKeyListener(this);
        this.views.tableProductos.addMouseListener(this);
        this.views.jLabelProductos.addMouseListener(this);

        this.views.txtCodigoNuevaCompra.addKeyListener(this);
        this.views.txtCantidadNuevaCompra.addKeyListener(this);
        this.views.txtPagarConNuevaCompra.addKeyListener(this);
        this.views.btnGenerarNuevaCompra.addActionListener(this);
        this.views.jLabelNuevaCompra.addMouseListener(this);
        this.views.jLabelNuevaVenta.addMouseListener(this);

        this.views.txtCodigoNV.addKeyListener(this);
        this.views.txtCantidadNV.addKeyListener(this);
        this.views.btnGenerarNV.addActionListener(this);
        
        this.views.txtBuscarProducto.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarPro) {
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.cbxProveedorPro.getSelectedItem().equals("")
                    || views.cbxMedidaPro.getSelectedItem().equals("")
                    || views.cbxCategoriaPro.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                pro.setCodigo(views.txtCodigoPro.getText());
                pro.setDescripcion(views.txtDescripcionPro.getText());
                pro.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                pro.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                Combo itemP = (Combo) views.cbxProveedorPro.getSelectedItem();
                Combo itemC = (Combo) views.cbxCategoriaPro.getSelectedItem();
                Combo itemM = (Combo) views.cbxMedidaPro.getSelectedItem();
                pro.setId_proveedor(itemP.getId());
                pro.setId_categoria(itemC.getId());
                pro.setId_medida(itemM.getId());
                if (proDao.registrar(pro)) {
                    limpiarTable();
                    listarProductos();
                    JOptionPane.showMessageDialog(null, "Producto registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el Producto");
                }
            }
        } else if (e.getSource() == views.btnModificarPro) {
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.cbxProveedorPro.getSelectedItem().equals("")
                    || views.cbxMedidaPro.getSelectedItem().equals("")
                    || views.cbxCategoriaPro.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                pro.setCodigo(views.txtCodigoPro.getText());
                pro.setDescripcion(views.txtDescripcionPro.getText());
                pro.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                pro.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                Combo itemP = (Combo) views.cbxProveedorPro.getSelectedItem();
                Combo itemC = (Combo) views.cbxCategoriaPro.getSelectedItem();
                Combo itemM = (Combo) views.cbxMedidaPro.getSelectedItem();
                pro.setId_proveedor(itemP.getId());
                pro.setId_categoria(itemC.getId());
                pro.setId_medida(itemM.getId());
                pro.setId(Integer.parseInt(views.txtIdPro.getText()));
                if (proDao.modificar(pro)) {
                    limpiarTable();
                    listarProductos();
                    JOptionPane.showMessageDialog(null, "Producto modificado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el producto");
                }
            }
        } else if (e.getSource() == views.jMenuEliminarProducto) {
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                if (proDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarProductos();
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
                }
            }
        } else if (e.getSource() == views.jMenuReingresarProducto) {
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para Reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                if (proDao.accion("Activo", id)) {
                    limpiarTable();
                    listarProductos();
                    JOptionPane.showMessageDialog(null, "Producto reingresado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el producto");
                }
            }
        } else if (e.getSource() == views.btnGenerarNuevaCompra) {
            insertarCompra();
        } else if (e.getSource() == views.btnGenerarNV) {
            VentasDao vDao = new VentasDao();
            String respuesta = vDao.verificarCaja(Integer.parseInt(views.txtIdUsuario.getText()));
            switch (respuesta) {
                case "existe" -> insertarVenta();
                case "no" -> JOptionPane.showMessageDialog(null, "La caja esta cerrada");
                default -> JOptionPane.showMessageDialog(null, "Error al generar Nueva Venta");
            }
        }
    }

    public void listarProductos() {
        Tables color = new Tables();
        views.tableProductos.setDefaultRenderer(views.tableProductos.getColumnClass(0), color);
        List<Productos> lista = proDao.ListaProductos(views.txtBuscarProducto.getText());
        modelo = (DefaultTableModel) views.tableProductos.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCodigo();
            ob[2] = lista.get(i).getDescripcion();
            ob[3] = lista.get(i).getPrecio_venta();
            ob[4] = lista.get(i).getCantidad();
            ob[5] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.tableProductos.setModel(modelo);
        JTableHeader header = views.tableProductos.getTableHeader();
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

    public void limpiarTableDetalle() {
        for (int i = 0; i < tmp.getRowCount(); i++) {
            tmp.removeRow(i);
            i = - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tableProductos) {
            int fila = views.tableProductos.rowAtPoint(e.getPoint());
            views.txtIdPro.setText(views.tableProductos.getValueAt(fila, 0).toString());
            pro = proDao.buscarPro(Integer.parseInt(views.txtIdPro.getText()));
            views.txtCodigoPro.setText(pro.getCodigo());
            views.txtDescripcionPro.setText(pro.getDescripcion());
            views.txtPrecioCompraPro.setText("" + pro.getPrecio_compra());
            views.txtPrecioVentaPro.setText("" + pro.getPrecio_venta());
            views.cbxProveedorPro.setSelectedItem(new Combo(pro.getId_proveedor(), pro.getProveedor()));
            views.cbxMedidaPro.setSelectedItem(new Combo(pro.getId_medida(), pro.getMedida()));
            views.cbxCategoriaPro.setSelectedItem(new Combo(pro.getId_categoria(), pro.getCategoria()));
        } else if (e.getSource() == views.jLabelProductos) {
            views.jTabbedPane1.setSelectedIndex(0);
            limpiarTable();
            listarProductos();
        } else if (e.getSource() == views.jLabelNuevaCompra) {
            views.jTabbedPane1.setSelectedIndex(10);
        } else if (e.getSource() == views.jLabelNuevaVenta) {
            views.jTabbedPane1.setSelectedIndex(6);
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
        if (e.getSource() == views.txtCodigoNuevaCompra) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String cod = views.txtCodigoNuevaCompra.getText();
                buscarProducto(views.txtCodigoNuevaCompra, cod, views.txtIdNuevaCompra, views.txtProductoNuevaCompra, views.txtPrecioNuevaCompra, views.txtCantidadNuevaCompra, 0);
            }
        } // buscar y agregar producto temp a la venta
        else if (e.getSource() == views.txtCodigoNV) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String cod = views.txtCodigoNV.getText();
                buscarProducto(views.txtCodigoNV, cod, views.txtIdNV, views.txtProductoNV, views.txtPrecioNV, views.txtCantidadNV, 1);
            }
        } else if (e.getSource() == views.txtCantidadNuevaCompra) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                int cant = Integer.parseInt(views.txtCantidadNuevaCompra.getText());
                String desc = views.txtProductoNuevaCompra.getText();
                double precio = Double.parseDouble(views.txtPrecioNuevaCompra.getText());
                int id = Integer.parseInt(views.txtIdNuevaCompra.getText());
                agregarTemp(cant, desc, precio, id, views.tableNuevaCompra, views.txtCodigoNuevaCompra);
                limpiarCompras();
                calcularTotal(views.tableNuevaCompra, views.jLabelTotalCompra);
            }
        } else if (e.getSource() == views.txtCantidadNV) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (views.txtCantidadNV.getText().equals("")) {
                    JOptionPane.showMessageDialog(views, "Ingrese la cantidad");
                } else {
                    int cant = Integer.parseInt(views.txtCantidadNV.getText());
                    int stock = Integer.parseInt(views.txtStockNV.getText());
                    if (cant > stock) {
                        JOptionPane.showMessageDialog(views, "Stock no disponible");
                    } else {
                        String desc = views.txtProductoNV.getText();
                        double precio = Double.parseDouble(views.txtPrecioNV.getText());
                        int id = Integer.parseInt(views.txtIdNV.getText());
                        agregarTemp(cant, desc, precio, id, views.tableNV, views.txtCodigoNV);
                        limpiarVentas();
                        calcularTotal(views.tableNV, views.jLabelTotalPagar);
                    }
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtCantidadNuevaCompra) {
            int cantidad;
            double precio = Double.parseDouble(views.txtPrecioNuevaCompra.getText());
            if (views.txtCantidadNuevaCompra.getText().equals("")) {
                cantidad = 1;
                views.txtTotalNuevaCompra.setText("" + cantidad * precio);
            } else {
                cantidad = Integer.parseInt(views.txtCantidadNuevaCompra.getText());
                views.txtTotalNuevaCompra.setText("" + cantidad * precio);
            }
        } else if (e.getSource() == views.txtPagarConNuevaCompra) {
            int pagar;
            if (views.txtPagarConNuevaCompra.getText().equals("")) {
                views.txtVueltoNuevaCompra.setText("");
            } else {
                pagar = Integer.parseInt(views.txtPagarConNuevaCompra.getText());
                double total = Double.parseDouble(views.jLabelTotalCompra.getText());
                views.txtVueltoNuevaCompra.setText("" + (pagar - total));
            }
        } else if (e.getSource() == views.txtBuscarProducto) {
            views.jTabbedPane1.setSelectedIndex(0);
            limpiarTable();
            listarProductos();
        }
    }

    private void limpiarCompras() {
        views.txtCodigoNuevaCompra.setText("");
        views.txtIdNuevaCompra.setText("");
        views.txtProductoNuevaCompra.setText("");
        views.txtCantidadNuevaCompra.setText("");
        views.txtPrecioNuevaCompra.setText("");
        views.txtTotalNuevaCompra.setText("");
    }

    private void limpiarVentas() {
        views.txtCodigoNV.setText("");
        views.txtIdNV.setText("");
        views.txtProductoNV.setText("");
        views.txtCantidadNV.setText("");
        views.txtPrecioNV.setText("");
        views.txtTotalNV.setText("");
        views.txtStockNV.setText("");
    }

    private void calcularTotal(JTable table, JLabel totalPagar) {
        double total = 0.00;
        int numFila = table.getRowCount();
        for (int i = 0; i < numFila; i++) {
            total = total + Double.parseDouble(String.valueOf(table.getValueAt(i, 4)));
        }
        totalPagar.setText("" + total);
    }

    private void insertarCompra() {
        Combo id_p = (Combo) views.cbxProveedorNuevaCompra.getSelectedItem();
        int id_proveedor = id_p.getId();
        String total = views.jLabelTotalCompra.getText();

        if (proDao.registrarCompra(id_proveedor, total)) {
            int id_compra = proDao.getUltimoId("compras");
            for (int i = 0; i < views.tableNuevaCompra.getRowCount(); i++) {
                double precio = Double.parseDouble(views.tableNuevaCompra.getValueAt(i, 3).toString());
                int cant = Integer.parseInt(views.tableNuevaCompra.getValueAt(i, 2).toString());
                int id_producto = Integer.parseInt(views.tableNuevaCompra.getValueAt(i, 0).toString());
                double sub_total = precio * cant;
                proDao.registrarCompraDetalle(id_compra, id_producto, precio, cant, sub_total);
                pro = proDao.buscarId(id_producto);
                int stockActual = pro.getCantidad() + cant;
                proDao.ActualizarStock(stockActual, id_producto);
            }
            limpiarTableDetalle();
            JOptionPane.showMessageDialog(null, "Compra generada");
            proDao.generarReporte(id_compra);
        }
    }

    // Agregar productos para la compra
    private void agregarTemp(int cant, String desc, double precio, int id, JTable table, JTextField codigo) {
        if (cant > 0) {
            tmp = (DefaultTableModel) table.getModel();
            ArrayList lista = new ArrayList();
            int item = 1;
            lista.add(item);
            lista.add(id);
            lista.add(desc);
            lista.add(cant);
            lista.add(precio);
            lista.add(cant * precio);
            Object[] obj = new Object[5];
            obj[0] = lista.get(1);
            obj[1] = lista.get(2);
            obj[2] = lista.get(3);
            obj[3] = lista.get(4);
            obj[4] = lista.get(5);
            tmp.addRow(obj);
            table.setModel(tmp);

            codigo.requestFocus();
        }
    }

    // buscar productos para la compra y venta
    private void buscarProducto(JTextField campo, String cod, JTextField id, JTextField producto, JTextField precio, JTextField cantidad, int accion) {
        if (campo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo");
        } else {
            pro = proDao.buscarCodigo(cod);
            if (pro.getId() > 0) {
                id.setText("" + pro.getId());
                producto.setText(pro.getDescripcion());
                if (accion == 0) {
                    precio.setText("" + pro.getPrecio_compra());
                } else {
                    precio.setText("" + pro.getPrecio_venta());
                    views.txtStockNV.setText("" + pro.getCantidad());
                }
                cantidad.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe o esta inactivo");
            }
        }
    }

    // insertar venta
    private void insertarVenta() {
        Combo id_cli = (Combo) views.cbxClienteVenta.getSelectedItem();
        int id_cliente = id_cli.getId();
        int id_user = Integer.parseInt(views.txtIdUsuario.getText());
        String total = views.jLabelTotalPagar.getText();

        if (proDao.registrarVentas(id_cliente, total, id_user)) {
            int id_venta = proDao.getUltimoId("ventas");
            for (int i = 0; i < views.tableNV.getRowCount(); i++) {
                double precio = Double.parseDouble(views.tableNV.getValueAt(i, 3).toString());
                int cant = Integer.parseInt(views.tableNV.getValueAt(i, 2).toString());
                int id_producto = Integer.parseInt(views.tableNV.getValueAt(i, 0).toString());
                double sub_total = precio * cant;
                proDao.registrarVentaDetalle(id_venta, id_producto, precio, cant, sub_total);
                pro = proDao.buscarId(id_producto);
                int stockActual = pro.getCantidad() - cant;
                proDao.ActualizarStock(stockActual, id_producto);
            }
            limpiarTableDetalle();
            JOptionPane.showMessageDialog(null, "Venta generada");
            proDao.generarReporteVenta(id_venta);
        }
    }
}