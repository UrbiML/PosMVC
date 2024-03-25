
package views;

import controllers.CajaControllers;
import controllers.CategoriasControllers;
import controllers.ClientesControllers;
import controllers.ComprasControllers;
import controllers.ConfigControllers;
import controllers.MedidasControllers;
import controllers.ProductosControllers;
import controllers.ProveedorControllers;
import controllers.UsuariosControllers;
import controllers.VentasControllers;
import models.Cajas;
import models.CajasDao;
import models.Categorias;
import models.CategoriasDao;
import models.Clientes;
import models.ClientesDao;
import models.Compras;
import models.ComprasDao;
import models.Configuracion;
import models.Medidas;
import models.MedidasDao;
import models.Productos;
import models.ProductosDao;
import models.Proveedor;
import models.ProveedorDao;
import models.Usuarios;
import models.UsuariosDao;
import models.Ventas;
import models.VentasDao;



public class PanelAdmin extends javax.swing.JFrame {
    
    Usuarios us = new Usuarios();
    UsuariosDao usDao = new UsuariosDao();
    Clientes cl = new Clientes();
    ClientesDao clDao = new ClientesDao();
    Proveedor pr = new Proveedor();
    ProveedorDao prDao = new ProveedorDao();
    Categorias cat = new Categorias();
    CategoriasDao catDao = new CategoriasDao();
    Medidas med = new Medidas();
    MedidasDao medDao = new MedidasDao();
    Productos pro = new Productos();
    ProductosDao proDao = new ProductosDao();
    Configuracion conf = new Configuracion();
    Compras comp = new Compras();
    ComprasDao compDao = new ComprasDao();
    Cajas caja = new Cajas();
    CajasDao cajasDao = new CajasDao();
    Ventas vent = new Ventas();
    VentasDao ventDao = new VentasDao();
 
    public PanelAdmin() {
    }

    public PanelAdmin(int id, String nombre) {
        initComponents();
        ConfigControllers config = new ConfigControllers(conf, usDao, this);
        CajaControllers cajas = new CajaControllers(caja, cajasDao, this);
        UsuariosControllers users = new UsuariosControllers(us, usDao, this);
        ClientesControllers clientes = new ClientesControllers(cl, clDao, this);
        CategoriasControllers categorias = new CategoriasControllers(cat, catDao, this);
        MedidasControllers medidas = new MedidasControllers(med, medDao, this);
        ProveedorControllers proveedores = new ProveedorControllers(pr, prDao, this);
        ProductosControllers productos = new ProductosControllers(pro, proDao, this);
        ComprasControllers compras = new ComprasControllers(comp, compDao, this);
        VentasControllers ventas = new VentasControllers(vent, ventDao, this);
        
        this.setLocationRelativeTo(null);
        
        txtIdUsuario.setText(""+id);
        btnUsers.setText(nombre);
        jTabbedPane1.setSelectedIndex(6);
        jTabbedPane1.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupUsuario = new javax.swing.JPopupMenu();
        jMenuEliminarUser = new javax.swing.JMenuItem();
        jMenuReingresarUser = new javax.swing.JMenuItem();
        jPopupCliente = new javax.swing.JPopupMenu();
        jMenuEliminarCliente = new javax.swing.JMenuItem();
        jMenuReingresarCliente = new javax.swing.JMenuItem();
        jPopupCategoria = new javax.swing.JPopupMenu();
        jMenuEliminarCategoria = new javax.swing.JMenuItem();
        jMenuReingresarCategoria = new javax.swing.JMenuItem();
        jPopupMedida = new javax.swing.JPopupMenu();
        jMenuEliminarMedida = new javax.swing.JMenuItem();
        jMenuReingresarMedida = new javax.swing.JMenuItem();
        jPopupProveedor = new javax.swing.JPopupMenu();
        jMenuEliminarProveedor = new javax.swing.JMenuItem();
        jMenuReingresarProveedor = new javax.swing.JMenuItem();
        jPopupProducto = new javax.swing.JPopupMenu();
        jMenuEliminarProducto = new javax.swing.JMenuItem();
        jMenuReingresarProducto = new javax.swing.JMenuItem();
        jPopupCaja = new javax.swing.JPopupMenu();
        jMenuEliminarCaja = new javax.swing.JMenuItem();
        jMenuReingresarCaja = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        JPanelProductos = new javax.swing.JPanel();
        jLabelProductos = new javax.swing.JLabel();
        JPanelNuevaCompra = new javax.swing.JPanel();
        jLabelNuevaCompra = new javax.swing.JLabel();
        JPanelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        JPanelProveedor = new javax.swing.JPanel();
        jLabelProveedores = new javax.swing.JLabel();
        JPanelMedidas = new javax.swing.JPanel();
        jLabelMedidas = new javax.swing.JLabel();
        JPanelUsers = new javax.swing.JPanel();
        jLabelUsers = new javax.swing.JLabel();
        JPanelNuevaVenta = new javax.swing.JPanel();
        jLabelNuevaVenta = new javax.swing.JLabel();
        JPanelCategorias = new javax.swing.JPanel();
        jLabelCategorias = new javax.swing.JLabel();
        JPanelConfig = new javax.swing.JPanel();
        jLabelConfig = new javax.swing.JLabel();
        JPanelCaja = new javax.swing.JPanel();
        jLabelCaja = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnUsers = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtDescripcionPro = new javax.swing.JTextField();
        txtPrecioCompraPro = new javax.swing.JTextField();
        txtPrecioVentaPro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxProveedorPro = new javax.swing.JComboBox<>();
        cbxMedidaPro = new javax.swing.JComboBox<>();
        cbxCategoriaPro = new javax.swing.JComboBox<>();
        btnNuevoPro = new javax.swing.JButton();
        btnRegistrarPro = new javax.swing.JButton();
        btnModificarPro = new javax.swing.JButton();
        txtIdPro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        paginadorPro = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccionCliente = new javax.swing.JTextPane();
        txtIdCliente = new javax.swing.JTextField();
        txtBuscarCliente = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        paginadorCliente = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        paginadorProveedor = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        btnNuevoProveedor = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDireccionProveedor = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        txtBuscarProveedor = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        btnNuevoUser = new javax.swing.JButton();
        btnRegistrarUser = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtUsuarioUser = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbxCajaUser = new javax.swing.JComboBox<>();
        cbxRolUser = new javax.swing.JComboBox<>();
        txtClaveUser = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        txtBuscarUser = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        paginadorUser = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        btnNuevoCategoria = new javax.swing.JButton();
        btnRegistrarCategoria = new javax.swing.JButton();
        btnModificarCategoria = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JTextField();
        txtBuscarCategoria = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableCategoria = new javax.swing.JTable();
        paginadorCategoria = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        btnNuevoMedida = new javax.swing.JButton();
        btnRegistrarMedida = new javax.swing.JButton();
        btnModificarMedida = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtNombreMedida = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNombreCortoMedida = new javax.swing.JTextField();
        txtIdMedida = new javax.swing.JTextField();
        txtBuscarMedida = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableMedida = new javax.swing.JTable();
        paginadorMedida = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtTotalNV = new javax.swing.JTextField();
        txtCodigoNV = new javax.swing.JTextField();
        txtProductoNV = new javax.swing.JTextField();
        txtCantidadNV = new javax.swing.JTextField();
        txtPrecioNV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtStockNV = new javax.swing.JTextField();
        btnGenerarNV = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        cbxClienteVenta = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabelTotalPagar = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtIdNV = new javax.swing.JTextField();
        btnCajas = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        paginadorVentas = new javax.swing.JPanel();
        btnHistorialVentas = new javax.swing.JButton();
        txtBuscarVentas = new javax.swing.JTextField();
        txtIdVenta = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableCompras = new javax.swing.JTable();
        txtBuscarCompras = new javax.swing.JTextField();
        btnHistorialCompra = new javax.swing.JButton();
        txtIdCompra = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        btnModificarEmpresa = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtDireccionEmpresa = new javax.swing.JTextPane();
        txtRucEmpresa = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtMensajeEmpresa = new javax.swing.JTextPane();
        txtIdEmpresa = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableNuevaCompra = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTotalNuevaCompra = new javax.swing.JTextField();
        txtCodigoNuevaCompra = new javax.swing.JTextField();
        txtProductoNuevaCompra = new javax.swing.JTextField();
        txtCantidadNuevaCompra = new javax.swing.JTextField();
        txtPrecioNuevaCompra = new javax.swing.JTextField();
        btnGenerarNuevaCompra = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        cbxProveedorNuevaCompra = new javax.swing.JComboBox<>();
        txtPagarConNuevaCompra = new javax.swing.JTextField();
        txtVueltoNuevaCompra = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabelTotalCompra = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtIdNuevaCompra = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btnNuevoCaja = new javax.swing.JButton();
        btnRegistrarCaja = new javax.swing.JButton();
        btnModificarCaja = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        txtNombreCaja = new javax.swing.JTextField();
        txtIdCaja = new javax.swing.JTextField();
        txtBuscarCaja = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tableCaja = new javax.swing.JTable();
        paginadorCaja = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        btnNuevoApertura = new javax.swing.JButton();
        btnAbrirCaja = new javax.swing.JButton();
        btnCerrarCaja = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        txtIdApertura = new javax.swing.JTextField();
        txtBuscarApertura = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tableApertura = new javax.swing.JTable();

        jMenuEliminarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarUser.setText("Eliminar");
        JPopupUsuario.add(jMenuEliminarUser);

        jMenuReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarUser.setText("Reingresar");
        JPopupUsuario.add(jMenuReingresarUser);

        jMenuEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarCliente.setText("Eliminar");
        jPopupCliente.add(jMenuEliminarCliente);

        jMenuReingresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarCliente.setText("Reingresar");
        jPopupCliente.add(jMenuReingresarCliente);

        jMenuEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarCategoria.setText("Eliminar");
        jPopupCategoria.add(jMenuEliminarCategoria);

        jMenuReingresarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarCategoria.setText("Reingresar");
        jPopupCategoria.add(jMenuReingresarCategoria);

        jMenuEliminarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarMedida.setText("Eliminar");
        jPopupMedida.add(jMenuEliminarMedida);

        jMenuReingresarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarMedida.setText("Reingresar");
        jPopupMedida.add(jMenuReingresarMedida);

        jMenuEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarProveedor.setText("Eliminar");
        jPopupProveedor.add(jMenuEliminarProveedor);

        jMenuReingresarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarProveedor.setText("Reingresar");
        jPopupProveedor.add(jMenuReingresarProveedor);

        jMenuEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarProducto.setText("Eliminar");
        jPopupProducto.add(jMenuEliminarProducto);

        jMenuReingresarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarProducto.setText("Reingresar");
        jPopupProducto.add(jMenuReingresarProducto);

        jMenuEliminarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jMenuEliminarCaja.setText("Eliminar");
        jMenuEliminarCaja.setToolTipText("");
        jPopupCaja.add(jMenuEliminarCaja);

        jMenuReingresarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarCaja.setText("Reingresar");
        jPopupCaja.add(jMenuReingresarCaja);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelProductos.setBackground(new java.awt.Color(51, 51, 51));

        jLabelProductos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jLabelProductos.setText("Productos");
        jLabelProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProductosLayout = new javax.swing.GroupLayout(JPanelProductos);
        JPanelProductos.setLayout(JPanelProductosLayout);
        JPanelProductosLayout.setHorizontalGroup(
            JPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProductosLayout.setVerticalGroup(
            JPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        JPanelNuevaCompra.setBackground(new java.awt.Color(51, 51, 51));

        jLabelNuevaCompra.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito-de-compras.png"))); // NOI18N
        jLabelNuevaCompra.setText("Nueva Compra");
        jLabelNuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelNuevaCompraLayout = new javax.swing.GroupLayout(JPanelNuevaCompra);
        JPanelNuevaCompra.setLayout(JPanelNuevaCompraLayout);
        JPanelNuevaCompraLayout.setHorizontalGroup(
            JPanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelNuevaCompraLayout.setVerticalGroup(
            JPanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        JPanelClientes.setBackground(new java.awt.Color(51, 51, 51));

        jLabelClientes.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        jLabelClientes.setText("Clientes");
        jLabelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelClientesLayout = new javax.swing.GroupLayout(JPanelClientes);
        JPanelClientes.setLayout(JPanelClientesLayout);
        JPanelClientesLayout.setHorizontalGroup(
            JPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelClientesLayout.setVerticalGroup(
            JPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        JPanelProveedor.setBackground(new java.awt.Color(51, 51, 51));

        jLabelProveedores.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        jLabelProveedores.setText("Proveedores");
        jLabelProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProveedorLayout = new javax.swing.GroupLayout(JPanelProveedor);
        JPanelProveedor.setLayout(JPanelProveedorLayout);
        JPanelProveedorLayout.setHorizontalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProveedorLayout.setVerticalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        JPanelMedidas.setBackground(new java.awt.Color(51, 51, 51));

        jLabelMedidas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelMedidas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMedidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detallista.png"))); // NOI18N
        jLabelMedidas.setText("Medidas");
        jLabelMedidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelMedidasLayout = new javax.swing.GroupLayout(JPanelMedidas);
        JPanelMedidas.setLayout(JPanelMedidasLayout);
        JPanelMedidasLayout.setHorizontalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelMedidasLayout.setVerticalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        JPanelUsers.setBackground(new java.awt.Color(51, 51, 51));

        jLabelUsers.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jLabelUsers.setText("Usuarios");
        jLabelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelUsersLayout = new javax.swing.GroupLayout(JPanelUsers);
        JPanelUsers.setLayout(JPanelUsersLayout);
        JPanelUsersLayout.setHorizontalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelUsersLayout.setVerticalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 40));

        JPanelNuevaVenta.setBackground(new java.awt.Color(51, 51, 51));

        jLabelNuevaVenta.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nventa.png"))); // NOI18N
        jLabelNuevaVenta.setText("Nueva Venta");
        jLabelNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelNuevaVentaLayout = new javax.swing.GroupLayout(JPanelNuevaVenta);
        JPanelNuevaVenta.setLayout(JPanelNuevaVentaLayout);
        JPanelNuevaVentaLayout.setHorizontalGroup(
            JPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelNuevaVentaLayout.setVerticalGroup(
            JPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        JPanelCategorias.setBackground(new java.awt.Color(51, 51, 51));

        jLabelCategorias.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box.png"))); // NOI18N
        jLabelCategorias.setText("Categorias");
        jLabelCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelCategoriasLayout = new javax.swing.GroupLayout(JPanelCategorias);
        JPanelCategorias.setLayout(JPanelCategoriasLayout);
        JPanelCategoriasLayout.setHorizontalGroup(
            JPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelCategoriasLayout.setVerticalGroup(
            JPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        JPanelConfig.setBackground(new java.awt.Color(51, 51, 51));

        jLabelConfig.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jLabelConfig.setText("Configuración");
        jLabelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelConfigLayout = new javax.swing.GroupLayout(JPanelConfig);
        JPanelConfig.setLayout(JPanelConfigLayout);
        JPanelConfigLayout.setHorizontalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelConfigLayout.setVerticalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        JPanelCaja.setBackground(new java.awt.Color(51, 51, 51));

        jLabelCaja.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelCaja.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cajero.png"))); // NOI18N
        jLabelCaja.setText("Caja");
        jLabelCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelCajaLayout = new javax.swing.GroupLayout(JPanelCaja);
        JPanelCaja.setLayout(JPanelCajaLayout);
        JPanelCajaLayout.setHorizontalGroup(
            JPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelCajaLayout.setVerticalGroup(
            JPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 610));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pos Venta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 194, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 250, 35));

        btnUsers.setText("Users");
        jPanel3.add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 140, 35));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultas.png"))); // NOI18N
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 40));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Sistema de Ventas");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 380, -1));

        txtIdUsuario.setText("1");
        jPanel3.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 20, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1200, 110));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Producto"));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio Compra:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio Venta:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Medida:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Categoria:");

        cbxProveedorPro.setEditable(true);

        cbxMedidaPro.setEditable(true);

        cbxCategoriaPro.setEditable(true);

        btnNuevoPro.setText("Nuevo");

        btnRegistrarPro.setText("Registrar");

        btnModificarPro.setText("Modificar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecioVentaPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txtPrecioCompraPro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDescripcionPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigoPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbxCategoriaPro, 0, 169, Short.MAX_VALUE)
                                                .addComponent(cbxMedidaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 13, Short.MAX_VALUE))))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxMedidaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxCategoriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Descripcion", "Precio", "Stock", "Estado"
            }
        ));
        tableProductos.setComponentPopupMenu(jPopupProducto);
        tableProductos.setRowHeight(23);
        jScrollPane1.setViewportView(tableProductos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorProLayout = new javax.swing.GroupLayout(paginadorPro);
        paginadorPro.setLayout(paginadorProLayout);
        paginadorProLayout.setHorizontalGroup(
            paginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorProLayout.setVerticalGroup(
            paginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel4.add(paginadorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 710, 90));

        jTabbedPane1.addTab("Productos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Direccion");

        btnNuevoCliente.setText("Nuevo");

        btnRegistrarCliente.setText("Registrar");

        btnModificarCliente.setText("Modificar");

        jScrollPane3.setViewportView(txtDireccionCliente);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion", "Estado"
            }
        ));
        tableCliente.setComponentPopupMenu(jPopupCliente);
        jScrollPane2.setViewportView(tableCliente);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 720, 380));

        javax.swing.GroupLayout paginadorClienteLayout = new javax.swing.GroupLayout(paginadorCliente);
        paginadorCliente.setLayout(paginadorClienteLayout);
        paginadorClienteLayout.setHorizontalGroup(
            paginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        paginadorClienteLayout.setVerticalGroup(
            paginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel5.add(paginadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 720, 90));

        jTabbedPane1.addTab("Clientes", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 255, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ruc", "Nombre", "Telefono", "Direccion", "Estado"
            }
        ));
        tableProveedor.setComponentPopupMenu(jPopupProveedor);
        jScrollPane4.setViewportView(tableProveedor);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorProveedorLayout = new javax.swing.GroupLayout(paginadorProveedor);
        paginadorProveedor.setLayout(paginadorProveedorLayout);
        paginadorProveedorLayout.setHorizontalGroup(
            paginadorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorProveedorLayout.setVerticalGroup(
            paginadorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel6.add(paginadorProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 710, 90));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Proveedor"));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Telefono:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Direccion:");

        btnNuevoProveedor.setText("Nuevo");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        btnRegistrarProveedor.setText("Registrar");

        btnModificarProveedor.setText("Modificar");

        jScrollPane5.setViewportView(txtDireccionProveedor);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ruc:");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel52)))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        jTabbedPane1.addTab("Proveedores", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Usuario"));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nombre:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Contraseña:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Caja:");

        btnNuevoUser.setText("Nuevo");

        btnRegistrarUser.setText("Registrar");

        btnModificarUser.setText("Modificar");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Usuario:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Rol:");

        cbxCajaUser.setEditable(true);

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxCajaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtUsuarioUser, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                .addComponent(txtNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                .addComponent(txtBuscarUser)))
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtClaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtUsuarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtClaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(cbxCajaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel20))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel7.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Rol", "", "Caja", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.setComponentPopupMenu(JPopupUsuario);
        jScrollPane7.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(4).setResizable(false);
            tableUser.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorUserLayout = new javax.swing.GroupLayout(paginadorUser);
        paginadorUser.setLayout(paginadorUserLayout);
        paginadorUserLayout.setHorizontalGroup(
            paginadorUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorUserLayout.setVerticalGroup(
            paginadorUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel7.add(paginadorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 710, 90));

        jTabbedPane1.addTab("Usuarios", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 51, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Categoria"));

        btnNuevoCategoria.setText("Nuevo");

        btnRegistrarCategoria.setText("Registrar");

        btnModificarCategoria.setText("Modificar");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Nombre:");

        txtBuscarCategoria.setVerifyInputWhenFocusTarget(false);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnNuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBuscarCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
        );

        jPanel8.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        tableCategoria.setComponentPopupMenu(jPopupCategoria);
        jScrollPane8.setViewportView(tableCategoria);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorCategoriaLayout = new javax.swing.GroupLayout(paginadorCategoria);
        paginadorCategoria.setLayout(paginadorCategoriaLayout);
        paginadorCategoriaLayout.setHorizontalGroup(
            paginadorCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorCategoriaLayout.setVerticalGroup(
            paginadorCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel8.add(paginadorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 710, 90));

        jTabbedPane1.addTab("Categorias", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Medida"));

        btnNuevoMedida.setText("Nuevo");

        btnRegistrarMedida.setText("Registrar");

        btnModificarMedida.setText("Modificar");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Nombre:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Nombre corto:");

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnNuevoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBuscarMedida, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombreCortoMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtNombreMedida))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtNombreMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNombreCortoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(txtIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jPanel9.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableMedida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Corto", "Estado"
            }
        ));
        tableMedida.setComponentPopupMenu(jPopupMedida);
        jScrollPane9.setViewportView(tableMedida);

        jPanel9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorMedidaLayout = new javax.swing.GroupLayout(paginadorMedida);
        paginadorMedida.setLayout(paginadorMedidaLayout);
        paginadorMedidaLayout.setHorizontalGroup(
            paginadorMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorMedidaLayout.setVerticalGroup(
            paginadorMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel9.add(paginadorMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 710, 80));

        jTabbedPane1.addTab("Medidas", jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 204, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane6.setViewportView(tableNV);

        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1050, 320));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Código:");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Producto:");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Cantidad:");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Precio:");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Total:");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
        jPanel10.add(txtTotalNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 70, 30));
        jPanel10.add(txtCodigoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));
        jPanel10.add(txtProductoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, 30));
        jPanel10.add(txtCantidadNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 30));
        jPanel10.add(txtPrecioNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 70, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Stock:");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));
        jPanel10.add(txtStockNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 70, 30));

        btnGenerarNV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGenerarNV.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarNV.setText("Generar Venta");
        jPanel10.add(btnGenerarNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 130, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Cliente:");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jPanel10.add(cbxClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 180, -1));
        jPanel10.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 150, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 160, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Total Pagar:");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, -1, -1));

        jLabelTotalPagar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTotalPagar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotalPagar.setText("-----------");
        jPanel10.add(jLabelTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Pagar con:");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 80, 20));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Vuelto:");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 50, 20));
        jPanel10.add(txtIdNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 20, 20));

        btnCajas.setText("Cajas");
        jPanel10.add(btnCajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 90, 30));

        jTabbedPane1.addTab("Nueva Venta", jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 153, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Total", "Fecha"
            }
        ));
        jScrollPane11.setViewportView(tableVentas);
        if (tableVentas.getColumnModel().getColumnCount() > 0) {
            tableVentas.getColumnModel().getColumn(0).setMinWidth(80);
            tableVentas.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableVentas.getColumnModel().getColumn(0).setMaxWidth(120);
            tableVentas.getColumnModel().getColumn(2).setMinWidth(150);
            tableVentas.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableVentas.getColumnModel().getColumn(2).setMaxWidth(200);
            tableVentas.getColumnModel().getColumn(3).setMinWidth(200);
            tableVentas.getColumnModel().getColumn(3).setPreferredWidth(200);
            tableVentas.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1050, 370));

        javax.swing.GroupLayout paginadorVentasLayout = new javax.swing.GroupLayout(paginadorVentas);
        paginadorVentas.setLayout(paginadorVentasLayout);
        paginadorVentasLayout.setHorizontalGroup(
            paginadorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        paginadorVentasLayout.setVerticalGroup(
            paginadorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(paginadorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 1050, -1));

        btnHistorialVentas.setText("Generar Reporte");
        jPanel11.add(btnHistorialVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 140, 30));
        jPanel11.add(txtBuscarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 30));
        jPanel11.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 20, -1));

        jTabbedPane1.addTab("ventas", jPanel11);

        jPanel12.setBackground(new java.awt.Color(153, 204, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Proveedor", "Total", "Fecha"
            }
        ));
        tableCompras.setRowHeight(23);
        jScrollPane12.setViewportView(tableCompras);
        if (tableCompras.getColumnModel().getColumnCount() > 0) {
            tableCompras.getColumnModel().getColumn(0).setMinWidth(80);
            tableCompras.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableCompras.getColumnModel().getColumn(0).setMaxWidth(120);
            tableCompras.getColumnModel().getColumn(2).setMinWidth(150);
            tableCompras.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableCompras.getColumnModel().getColumn(2).setMaxWidth(200);
            tableCompras.getColumnModel().getColumn(3).setMinWidth(200);
            tableCompras.getColumnModel().getColumn(3).setPreferredWidth(200);
            tableCompras.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jPanel12.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1060, 400));
        jPanel12.add(txtBuscarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 40));

        btnHistorialCompra.setText("Generar Reporte");
        jPanel12.add(btnHistorialCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, 40));
        jPanel12.add(txtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 20, -1));

        jTabbedPane1.addTab("compras", jPanel12);

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Empresa"));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Nombre");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Telefono");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Direccion");

        btnModificarEmpresa.setText("Modificar");

        jScrollPane13.setViewportView(txtDireccionEmpresa);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Ruc:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Mensaje:");

        jScrollPane14.setViewportView(txtMensajeEmpresa);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addGap(30, 30, 30)))
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(txtRucEmpresa))))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel22Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane14)
                                        .addComponent(jScrollPane13)))
                                .addGroup(jPanel22Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnModificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(txtRucEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel13.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        jTabbedPane1.addTab("Configuracion", jPanel13);

        jPanel16.setBackground(new java.awt.Color(153, 204, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableNuevaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        tableNuevaCompra.setRowHeight(23);
        jScrollPane10.setViewportView(tableNuevaCompra);

        jPanel16.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1050, 320));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Código:");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Producto:");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Cantidad:");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Precio:");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Total:");
        jPanel16.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
        jPanel16.add(txtTotalNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 70, 30));
        jPanel16.add(txtCodigoNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));
        jPanel16.add(txtProductoNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, 30));
        jPanel16.add(txtCantidadNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 30));
        jPanel16.add(txtPrecioNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 70, 30));

        btnGenerarNuevaCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGenerarNuevaCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarNuevaCompra.setText("Generar Compra");
        jPanel16.add(btnGenerarNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 150, 30));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Proveedor:");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jPanel16.add(cbxProveedorNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 200, -1));

        txtPagarConNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagarConNuevaCompraActionPerformed(evt);
            }
        });
        jPanel16.add(txtPagarConNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 150, -1));

        txtVueltoNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVueltoNuevaCompraActionPerformed(evt);
            }
        });
        jPanel16.add(txtVueltoNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 160, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Total Pagar:");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, -1, -1));

        jLabelTotalCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTotalCompra.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotalCompra.setText("-----------");
        jPanel16.add(jLabelTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Pagar con:");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 80, 20));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Vuelto:");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 50, 20));
        jPanel16.add(txtIdNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 30, -1));

        jTabbedPane1.addTab("Nueva Compra", jPanel16);

        jPanel24.setBackground(new java.awt.Color(204, 51, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Caja"));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoCaja.setText("Nuevo");
        jPanel25.add(btnNuevoCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 273, 86, 30));

        btnRegistrarCaja.setText("Registrar");
        jPanel25.add(btnRegistrarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 273, 94, 30));

        btnModificarCaja.setText("Modificar");
        jPanel25.add(btnModificarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 273, 94, 30));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Nombre:");
        jPanel25.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 144, -1, -1));
        jPanel25.add(txtNombreCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 137, 199, 30));
        jPanel25.add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 199, 32, -1));

        txtBuscarCaja.setVerifyInputWhenFocusTarget(false);
        jPanel25.add(txtBuscarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 67, 199, 30));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel25.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 36, 30));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 480));

        tableCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        tableCaja.setComponentPopupMenu(jPopupCaja);
        jScrollPane16.setViewportView(tableCaja);

        jPanel24.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 710, 380));

        javax.swing.GroupLayout paginadorCajaLayout = new javax.swing.GroupLayout(paginadorCaja);
        paginadorCaja.setLayout(paginadorCajaLayout);
        paginadorCajaLayout.setHorizontalGroup(
            paginadorCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        paginadorCajaLayout.setVerticalGroup(
            paginadorCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel24.add(paginadorCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 710, 90));

        jTabbedPane1.addTab("Cajas", jPanel24);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Apertura y Cierre"));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoApertura.setText("Nuevo");
        jPanel26.add(btnNuevoApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 273, 86, 30));

        btnAbrirCaja.setText("Abrir");
        jPanel26.add(btnAbrirCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 273, 94, 30));

        btnCerrarCaja.setText("Cerrar");
        jPanel26.add(btnCerrarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 273, 94, 30));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Monto Incial:");
        jPanel26.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 144, -1, -1));
        jPanel26.add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, 30));
        jPanel26.add(txtIdApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 199, 32, -1));

        txtBuscarApertura.setVerifyInputWhenFocusTarget(false);
        jPanel26.add(txtBuscarApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 67, 180, 30));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel26.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 36, 30));

        jPanel14.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 480));

        tableApertura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Apertura", "Fecha Cierre", "Monto Inicial", "Monto Final", "Total Ventas", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(tableApertura);
        if (tableApertura.getColumnModel().getColumnCount() > 0) {
            tableApertura.getColumnModel().getColumn(4).setMinWidth(60);
            tableApertura.getColumnModel().getColumn(4).setPreferredWidth(60);
            tableApertura.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel14.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 760, 470));

        jTabbedPane1.addTab("Apertura y Cierre", jPanel14);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1200, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtVueltoNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVueltoNuevaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVueltoNuevaCompraActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void txtPagarConNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagarConNuevaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagarConNuevaCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPanelCaja;
    public javax.swing.JPanel JPanelCategorias;
    public javax.swing.JPanel JPanelClientes;
    public javax.swing.JPanel JPanelConfig;
    public javax.swing.JPanel JPanelMedidas;
    public javax.swing.JPanel JPanelNuevaCompra;
    public javax.swing.JPanel JPanelNuevaVenta;
    public javax.swing.JPanel JPanelProductos;
    public javax.swing.JPanel JPanelProveedor;
    public javax.swing.JPanel JPanelUsers;
    private javax.swing.JPopupMenu JPopupUsuario;
    public javax.swing.JButton btnAbrirCaja;
    public javax.swing.JButton btnCajas;
    public javax.swing.JButton btnCerrarCaja;
    public javax.swing.JButton btnGenerarNV;
    public javax.swing.JButton btnGenerarNuevaCompra;
    public javax.swing.JButton btnHistorialCompra;
    public javax.swing.JButton btnHistorialVentas;
    public javax.swing.JButton btnModificarCaja;
    public javax.swing.JButton btnModificarCategoria;
    public javax.swing.JButton btnModificarCliente;
    public javax.swing.JButton btnModificarEmpresa;
    public javax.swing.JButton btnModificarMedida;
    public javax.swing.JButton btnModificarPro;
    public javax.swing.JButton btnModificarProveedor;
    public javax.swing.JButton btnModificarUser;
    public javax.swing.JButton btnNuevoApertura;
    public javax.swing.JButton btnNuevoCaja;
    public javax.swing.JButton btnNuevoCategoria;
    public javax.swing.JButton btnNuevoCliente;
    public javax.swing.JButton btnNuevoMedida;
    public javax.swing.JButton btnNuevoPro;
    public javax.swing.JButton btnNuevoProveedor;
    public javax.swing.JButton btnNuevoUser;
    public javax.swing.JButton btnRegistrarCaja;
    public javax.swing.JButton btnRegistrarCategoria;
    public javax.swing.JButton btnRegistrarCliente;
    public javax.swing.JButton btnRegistrarMedida;
    public javax.swing.JButton btnRegistrarPro;
    public javax.swing.JButton btnRegistrarProveedor;
    public javax.swing.JButton btnRegistrarUser;
    private javax.swing.JButton btnUsers;
    public javax.swing.JComboBox<Object> cbxCajaUser;
    public javax.swing.JComboBox<Object> cbxCategoriaPro;
    public javax.swing.JComboBox<Object> cbxClienteVenta;
    public javax.swing.JComboBox<Object> cbxMedidaPro;
    public javax.swing.JComboBox<Object> cbxProveedorNuevaCompra;
    public javax.swing.JComboBox<Object> cbxProveedorPro;
    public javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCaja;
    public javax.swing.JLabel jLabelCategorias;
    public javax.swing.JLabel jLabelClientes;
    public javax.swing.JLabel jLabelConfig;
    public javax.swing.JLabel jLabelMedidas;
    public javax.swing.JLabel jLabelNuevaCompra;
    public javax.swing.JLabel jLabelNuevaVenta;
    public javax.swing.JLabel jLabelProductos;
    public javax.swing.JLabel jLabelProveedores;
    public javax.swing.JLabel jLabelTotalCompra;
    public javax.swing.JLabel jLabelTotalPagar;
    public javax.swing.JLabel jLabelUsers;
    public javax.swing.JMenuItem jMenuEliminarCaja;
    public javax.swing.JMenuItem jMenuEliminarCategoria;
    public javax.swing.JMenuItem jMenuEliminarCliente;
    public javax.swing.JMenuItem jMenuEliminarMedida;
    public javax.swing.JMenuItem jMenuEliminarProducto;
    public javax.swing.JMenuItem jMenuEliminarProveedor;
    public javax.swing.JMenuItem jMenuEliminarUser;
    public javax.swing.JMenuItem jMenuReingresarCaja;
    public javax.swing.JMenuItem jMenuReingresarCategoria;
    public javax.swing.JMenuItem jMenuReingresarCliente;
    public javax.swing.JMenuItem jMenuReingresarMedida;
    public javax.swing.JMenuItem jMenuReingresarProducto;
    public javax.swing.JMenuItem jMenuReingresarProveedor;
    public javax.swing.JMenuItem jMenuReingresarUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupCaja;
    private javax.swing.JPopupMenu jPopupCategoria;
    private javax.swing.JPopupMenu jPopupCliente;
    private javax.swing.JPopupMenu jPopupMedida;
    private javax.swing.JPopupMenu jPopupProducto;
    private javax.swing.JPopupMenu jPopupProveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JPanel paginadorCaja;
    private javax.swing.JPanel paginadorCategoria;
    private javax.swing.JPanel paginadorCliente;
    private javax.swing.JPanel paginadorMedida;
    private javax.swing.JPanel paginadorPro;
    private javax.swing.JPanel paginadorProveedor;
    private javax.swing.JPanel paginadorUser;
    private javax.swing.JPanel paginadorVentas;
    public javax.swing.JTable tableApertura;
    public javax.swing.JTable tableCaja;
    public javax.swing.JTable tableCategoria;
    public javax.swing.JTable tableCliente;
    public javax.swing.JTable tableCompras;
    public javax.swing.JTable tableMedida;
    public javax.swing.JTable tableNV;
    public javax.swing.JTable tableNuevaCompra;
    public javax.swing.JTable tableProductos;
    public javax.swing.JTable tableProveedor;
    public javax.swing.JTable tableUser;
    public javax.swing.JTable tableVentas;
    public javax.swing.JTextField txtBuscarApertura;
    public javax.swing.JTextField txtBuscarCaja;
    public javax.swing.JTextField txtBuscarCategoria;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscarCompras;
    public javax.swing.JTextField txtBuscarMedida;
    public javax.swing.JTextField txtBuscarProducto;
    public javax.swing.JTextField txtBuscarProveedor;
    public javax.swing.JTextField txtBuscarUser;
    public javax.swing.JTextField txtBuscarVentas;
    public javax.swing.JTextField txtCantidadNV;
    public javax.swing.JTextField txtCantidadNuevaCompra;
    public javax.swing.JPasswordField txtClaveUser;
    public javax.swing.JTextField txtCodigoNV;
    public javax.swing.JTextField txtCodigoNuevaCompra;
    public javax.swing.JTextField txtCodigoPro;
    public javax.swing.JTextField txtDescripcionPro;
    public javax.swing.JTextPane txtDireccionCliente;
    public javax.swing.JTextPane txtDireccionEmpresa;
    public javax.swing.JTextPane txtDireccionProveedor;
    public javax.swing.JTextField txtIdApertura;
    public javax.swing.JTextField txtIdCaja;
    public javax.swing.JTextField txtIdCategoria;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdCompra;
    public javax.swing.JTextField txtIdEmpresa;
    public javax.swing.JTextField txtIdMedida;
    public javax.swing.JTextField txtIdNV;
    public javax.swing.JTextField txtIdNuevaCompra;
    public javax.swing.JTextField txtIdPro;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtIdUsuario;
    public javax.swing.JTextField txtIdVenta;
    public javax.swing.JTextPane txtMensajeEmpresa;
    public javax.swing.JTextField txtMontoInicial;
    public javax.swing.JTextField txtNombreCaja;
    public javax.swing.JTextField txtNombreCategoria;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreCortoMedida;
    public javax.swing.JTextField txtNombreEmpresa;
    public javax.swing.JTextField txtNombreMedida;
    public javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtNombreUser;
    public javax.swing.JTextField txtPagarConNuevaCompra;
    public javax.swing.JTextField txtPrecioCompraPro;
    public javax.swing.JTextField txtPrecioNV;
    public javax.swing.JTextField txtPrecioNuevaCompra;
    public javax.swing.JTextField txtPrecioVentaPro;
    public javax.swing.JTextField txtProductoNV;
    public javax.swing.JTextField txtProductoNuevaCompra;
    public javax.swing.JTextField txtRucEmpresa;
    public javax.swing.JTextField txtRucProveedor;
    public javax.swing.JTextField txtStockNV;
    public javax.swing.JTextField txtTelefonoCliente;
    public javax.swing.JTextField txtTelefonoEmpresa;
    public javax.swing.JTextField txtTelefonoProveedor;
    public javax.swing.JTextField txtTotalNV;
    public javax.swing.JTextField txtTotalNuevaCompra;
    public javax.swing.JTextField txtUsuarioUser;
    public javax.swing.JTextField txtVueltoNuevaCompra;
    // End of variables declaration//GEN-END:variables
}
