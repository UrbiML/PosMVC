package models;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class ProductosDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Productos pro) {
        String sql = "INSERT INTO productos (codigo, descripcion, precio_compra, precio_venta, id_proveedor, id_medida, id_categoria) VALUES (?,?,?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getDescripcion());
            ps.setDouble(3, pro.getPrecio_compra());
            ps.setDouble(4, pro.getPrecio_venta());
            ps.setInt(5, pro.getId_proveedor());
            ps.setInt(6, pro.getId_medida());
            ps.setInt(7, pro.getId_categoria());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public List ListaProductos(String valor) {
        List<Productos> listaProductos = new ArrayList();
        String sql = "SELECT * FROM productos ORDER BY estado ASC";
        String buscar = "SELECT * FROM productos WHERE codigo LIKE '%" + valor + "%' OR descripcion LIKE '%" + valor + "%'";

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
                Productos pro = new Productos();
                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio_venta(rs.getInt("precio_venta"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setEstado(rs.getString("estado"));
                listaProductos.add(pro);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProductos;
    }

    public boolean modificar(Productos pro) {
        String sql = "UPDATE productos SET codigo = ?, descripcion = ?, precio_compra = ?, precio_venta = ?, id_proveedor = ?, id_medida = ?, id_categoria = ?  WHERE id = ?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getDescripcion());
            ps.setDouble(3, pro.getPrecio_compra());
            ps.setDouble(4, pro.getPrecio_venta());
            ps.setInt(5, pro.getId_proveedor());
            ps.setInt(6, pro.getId_medida());
            ps.setInt(7, pro.getId_categoria());
            ps.setInt(8, pro.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE productos SET estado = ? WHERE id = ?";

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

    public Productos buscarPro(int id) {
        String sql = "SELECT p.*, pr.id, pr.proveedor, m.id, m.medida, c.id, c.categoria FROM productos p INNER JOIN proveedores pr ON p.id_proveedor = pr.id INNER JOIN medidas m ON p.id_medida = m.id INNER JOIN categorias c ON p.id_categoria = c.id WHERE p.id = ?;";
        Productos pro = new Productos();

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setCodigo(rs.getString("codigo"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio_compra(rs.getDouble("precio_compra"));
                pro.setPrecio_venta(rs.getDouble("precio_venta"));
                pro.setId_proveedor(rs.getInt("id_proveedor"));
                pro.setId_medida(rs.getInt("id_medida"));
                pro.setId_categoria(rs.getInt("id_categoria"));
                pro.setProveedor(rs.getString("proveedor"));
                pro.setMedida(rs.getString("medida"));
                pro.setCategoria(rs.getString("categoria"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pro;
    }

    public Productos buscarCodigo(String codigo) {
        String sql = "SELECT * FROM productos WHERE codigo = ? AND estado = 'Activo' ";
        Productos pro = new Productos();

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio_compra(rs.getDouble("precio_compra"));
                pro.setPrecio_venta(rs.getDouble("precio_venta"));
                pro.setCantidad(rs.getInt("cantidad"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pro;
    }

    public boolean registrarCompra(int id, String total) {
        String sql = "INSERT INTO compras (id_proveedor, total) VALUES (?, ?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, total);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public boolean registrarCompraDetalle(int id_compra, int id_producto, double precio, int cant, double sub_total) {
        String sql = "INSERT INTO detalle_compra (id_compra, id_producto, precio, cantidad, subtotal) VALUES (?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_compra);
            ps.setInt(2, id_producto);
            ps.setDouble(3, precio);
            ps.setInt(4, cant);
            ps.setDouble(5, sub_total);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public Productos buscarId(int id) {
        String sql = "SELECT * FROM productos WHERE id = ?";
        Productos pro = new Productos();

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setCantidad(rs.getInt("cantidad"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pro;
    }

    public boolean ActualizarStock(int cant, int id) {
        String sql = "UPDATE productos SET cantidad = ? WHERE id = ?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public int getUltimoId(String tabla) {
        String sql = "SELECT MAX(id) AS id FROM "+ tabla;
        int id = 0;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return id;
    }

    public List ListaDetalle(int id_compra) {
        List<Productos> listaProductos = new ArrayList();
        String sql = "SELECT c.*, d.*, p.id, p.descripcion FROM compras c INNER JOIN detalle_compra d ON d.id_compra = c.id INNER JOIN productos p ON p.id = d.id_producto WHERE c.id = ?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_compra);
            rs = ps.executeQuery();

            while (rs.next()) {
                Productos pro = new Productos();
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio_compra(rs.getDouble("precio"));
                pro.setPrecio_venta(rs.getDouble("subtotal"));
                listaProductos.add(pro);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProductos;
    }

    public void generarReporte(int id_compra) {
        double totalGeneral = 0.00;
        String fecha = "";
        String nomProveedor = "";
        String telProveedor = "";
        String dirProveedor = "";
        String mensaje = "";
        try {
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);
            String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            FileOutputStream archivo;
            File salida = new File(url + File.separator + "compra.pdf");
            archivo = new FileOutputStream(salida);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            // Contenido del documento
            PdfPTable empresa = new PdfPTable(4);
            empresa.setWidthPercentage(100);
            float[] tamanioEncabezado = new float[]{15f, 15f, 40f, 30f};
            empresa.setWidths(tamanioEncabezado);
            empresa.setHorizontalAlignment(Element.ALIGN_LEFT);
            empresa.getDefaultCell().setBorder(0);
            // Agregar logo
            Image img = Image.getInstance(getClass().getResource("/Img/logo.png"));
            empresa.addCell(img);
            empresa.addCell("");
            // Consulta los datos de las empresa
            String sql = "SELECT * FROM configuracion";
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    empresa.addCell("Ruc: " + rs.getString("ruc") + "\nNombre: " + rs.getString("nombre") + 
                            "\nTelefono: " + rs.getString("telefono") + "\nDireccion: " + rs.getString("direccion"));
                    mensaje = rs.getString("mensaje");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            // Consulta los datos del proveedor
            String consultaProveedor = "SELECT p.proveedor, p.telefono, p.direccion, c.fecha, c.total FROM compras c INNER JOIN proveedores p On c.id_proveedor = p.id WHERE c.id = " + id_compra;
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(consultaProveedor);
                rs = ps.executeQuery();

                if (rs.next()) {
                    nomProveedor = rs.getString("proveedor");
                    telProveedor = rs.getString("telefono");
                    dirProveedor = rs.getString("direccion");
                    totalGeneral = rs.getDouble("total");
                    fecha = rs.getString("fecha");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            // Datos del vendedor
            Paragraph vendedor = new Paragraph();
            empresa.addCell("N° Compra: " + id_compra + "\nComprador: " + "Nombre Comprador" + 
                            "\nFecha: " + fecha);
            // Agregar contenido al documento
            doc.add(empresa);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar datos del proveedor
            //Titulo proveedor
            Paragraph titProveedor = new Paragraph();
            titProveedor.add("Datos del Proveedor");
            titProveedor.setAlignment(Element.ALIGN_CENTER);
            doc.add(titProveedor);
            doc.add(Chunk.NEWLINE);
            
            PdfPTable proveedor = new PdfPTable(3);
            proveedor.setWidthPercentage(100);
            float[] tamanioProveedor = new float[]{40f, 20f, 40f};
            proveedor.setWidths(tamanioProveedor);
            proveedor.setHorizontalAlignment(Element.ALIGN_LEFT);
            proveedor.getDefaultCell().setBorder(0);
            // Encabezado proveedor
            PdfPCell nomPr = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell telPr = new PdfPCell(new Phrase("Telefono", negrita));
            PdfPCell dirPr = new PdfPCell(new Phrase("Direccion", negrita));
            // Quitar Bordes del encabezado
            nomPr.setBorder(0);
            telPr.setBorder(0);
            dirPr.setBorder(0);
            // Background del encabezado
            nomPr.setBackgroundColor(BaseColor.DARK_GRAY);
            telPr.setBackgroundColor(BaseColor.DARK_GRAY);
            dirPr.setBackgroundColor(BaseColor.DARK_GRAY);
            // Agregar los encabezados del Proveedor
            proveedor.addCell(nomPr);
            proveedor.addCell(telPr);
            proveedor.addCell(dirPr);
            // Agregar datos del proveedor
            proveedor.addCell(nomProveedor);
            proveedor.addCell(telProveedor);
            proveedor.addCell(dirProveedor);
            
            doc.add(proveedor);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar datos del Producto
            //Titulo producto
            Paragraph titProducto = new Paragraph();
            titProducto.add("Detalle de la compra");
            titProducto.setAlignment(Element.ALIGN_CENTER);
            doc.add(titProducto);
            doc.add(Chunk.NEWLINE);
            
            PdfPTable producto = new PdfPTable(4);
            producto.setWidthPercentage(100);
            float[] tamanioProducto = new float[]{50f, 10f, 20f, 20f};
            producto.setWidths(tamanioProducto);
            producto.setHorizontalAlignment(Element.ALIGN_LEFT);
            producto.getDefaultCell().setBorder(0);
            // Encabezado productos
            PdfPCell desPro = new PdfPCell(new Phrase("Descripcion", negrita));
            PdfPCell cantPro = new PdfPCell(new Phrase("Cant", negrita));
            PdfPCell precioPro = new PdfPCell(new Phrase("Precio", negrita));
            PdfPCell subPro = new PdfPCell(new Phrase("SubTotal", negrita));
            // Quitar Bordes de los productos
            desPro.setBorder(0);
            cantPro.setBorder(0);
            precioPro.setBorder(0);
            subPro.setBorder(0);
            // Background de los productos
            desPro.setBackgroundColor(BaseColor.DARK_GRAY);
            cantPro.setBackgroundColor(BaseColor.DARK_GRAY);
            precioPro.setBackgroundColor(BaseColor.DARK_GRAY);
            subPro.setBackgroundColor(BaseColor.DARK_GRAY);
            // Agregar los encabezados de los productos
            producto.addCell(desPro);
            producto.addCell(cantPro);
            producto.addCell(precioPro);
            producto.addCell(subPro);
            // Consulta los datos de los productos
            String consultaProducto = "SELECT d.precio, d.cantidad, d.subtotal, p.descripcion FROM compras c INNER JOIN detalle_compra d ON c.id = d.id_compra INNER JOIN productos p ON d.id_producto = p.id WHERE c.id = " + id_compra;
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(consultaProducto);
                rs = ps.executeQuery();

                while (rs.next()) {
                    producto.addCell(rs.getString("descripcion"));
                    producto.addCell(rs.getString("cantidad"));
                    producto.addCell(rs.getString("precio"));
                    producto.addCell(rs.getString("subtotal"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            doc.add(producto);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar total a pagar
            Paragraph totalPagar = new Paragraph();
            totalPagar.add("Total a pagar: " + totalGeneral);
            totalPagar.setAlignment(Element.ALIGN_RIGHT);
            doc.add(totalPagar);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar mensaje
            Paragraph saludo = new Paragraph();
            saludo.add(mensaje);
            saludo.setAlignment(Element.ALIGN_CENTER);
            doc.add(saludo);
            doc.add(Chunk.NEWLINE);
            
            // Cerrar archivos
            doc.close();
            archivo.close();
            
            Desktop.getDesktop().open(salida);

        } catch (DocumentException | HeadlessException | IOException  e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // modulos ventas
    public boolean registrarVentas(int id, String total, int id_user) {
        String sql = "INSERT INTO ventas (id_cliente, total, id_user) VALUES (?, ?, ?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, total);
            ps.setInt(3, id_user);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public boolean registrarVentaDetalle(int id_venta, int id_producto, double precio, int cant, double sub_total) {
        String sql = "INSERT INTO detalle_ventas (id_venta, id_producto, precio, cantidad, subtotal) VALUES (?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_venta);
            ps.setInt(2, id_producto);
            ps.setDouble(3, precio);
            ps.setInt(4, cant);
            ps.setDouble(5, sub_total);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public void generarReporteVenta(int id_venta) {
        double totalGeneral = 0.00;
        String fecha = "";
        String nomCliente = "";
        String telCliente = "";
        String dirCliente = "";
        String mensaje = "";
        try {
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);
            String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            FileOutputStream archivo;
            File salida = new File(url + File.separator + "venta.pdf");
            archivo = new FileOutputStream(salida);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            // Contenido del documento
            PdfPTable empresa = new PdfPTable(4);
            empresa.setWidthPercentage(100);
            float[] tamanioEncabezado = new float[]{15f, 15f, 40f, 30f};
            empresa.setWidths(tamanioEncabezado);
            empresa.setHorizontalAlignment(Element.ALIGN_LEFT);
            empresa.getDefaultCell().setBorder(0);
            // Agregar logo
            Image img = Image.getInstance(getClass().getResource("/Img/logo.png"));
            empresa.addCell(img);
            empresa.addCell("");
            // Consulta los datos de las empresa
            String sql = "SELECT * FROM configuracion";
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    empresa.addCell("Ruc: " + rs.getString("ruc") + "\nNombre: " + rs.getString("nombre") + 
                            "\nTelefono: " + rs.getString("telefono") + "\nDireccion: " + rs.getString("direccion"));
                    mensaje = rs.getString("mensaje");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            // Consulta los datos del cliente
            String consultaCliente = "SELECT c.nombre, c.telefono, c.direccion, v.fecha, v.total FROM ventas v INNER JOIN clientes c On v.id_cliente = c.id WHERE v.id = " + id_venta;
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(consultaCliente);
                rs = ps.executeQuery();

                if (rs.next()) {
                    nomCliente = rs.getString("nombre");
                    telCliente= rs.getString("telefono");
                    dirCliente = rs.getString("direccion");
                    totalGeneral = rs.getDouble("total");
                    fecha = rs.getString("fecha");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            // Datos del vendedor
            Paragraph vendedor = new Paragraph();
            empresa.addCell("N° Venta: " + id_venta+ "\nVendedor: " + "Nombre Vendedor" + 
                            "\nFecha: " + fecha);
            // Agregar contenido al documento
            doc.add(empresa);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar datos del Cliente
            //Titulo Cliente
            Paragraph titCliente = new Paragraph();
            titCliente.add("Datos del Cliente");
            titCliente.setAlignment(Element.ALIGN_CENTER);
            doc.add(titCliente);
            doc.add(Chunk.NEWLINE);
            
            PdfPTable cliente = new PdfPTable(3);
            cliente.setWidthPercentage(100);
            float[] tamanioCliente = new float[]{40f, 20f, 40f};
            cliente.setWidths(tamanioCliente);
            cliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            cliente.getDefaultCell().setBorder(0);
            // Encabezado cliente
            PdfPCell nomCli = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell telCli = new PdfPCell(new Phrase("Telefono", negrita));
            PdfPCell dirCli = new PdfPCell(new Phrase("Direccion", negrita));
            // Quitar Bordes del encabezado
            nomCli.setBorder(0);
            telCli.setBorder(0);
            dirCli.setBorder(0);
            // Background del encabezado
            nomCli.setBackgroundColor(BaseColor.DARK_GRAY);
            telCli.setBackgroundColor(BaseColor.DARK_GRAY);
            dirCli.setBackgroundColor(BaseColor.DARK_GRAY);
            // Agregar los encabezados del cliente
            cliente.addCell(nomCli);
            cliente.addCell(telCli);
            cliente.addCell(dirCli);
            // Agregar datos del cliente
            cliente.addCell(nomCliente);
            cliente.addCell(telCliente);
            cliente.addCell(dirCliente);
            
            doc.add(cliente);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar datos del Producto
            //Titulo producto
            Paragraph titProducto = new Paragraph();
            titProducto.add("Detalle de la venta");
            titProducto.setAlignment(Element.ALIGN_CENTER);
            doc.add(titProducto);
            doc.add(Chunk.NEWLINE);
            
            PdfPTable producto = new PdfPTable(4);
            producto.setWidthPercentage(100);
            float[] tamanioProducto = new float[]{50f, 10f, 20f, 20f};
            producto.setWidths(tamanioProducto);
            producto.setHorizontalAlignment(Element.ALIGN_LEFT);
            producto.getDefaultCell().setBorder(0);
            // Encabezado productos
            PdfPCell desPro = new PdfPCell(new Phrase("Descripcion", negrita));
            PdfPCell cantPro = new PdfPCell(new Phrase("Cant", negrita));
            PdfPCell precioPro = new PdfPCell(new Phrase("Precio", negrita));
            PdfPCell subPro = new PdfPCell(new Phrase("SubTotal", negrita));
            // Quitar Bordes de los productos
            desPro.setBorder(0);
            cantPro.setBorder(0);
            precioPro.setBorder(0);
            subPro.setBorder(0);
            // Background de los productos
            desPro.setBackgroundColor(BaseColor.DARK_GRAY);
            cantPro.setBackgroundColor(BaseColor.DARK_GRAY);
            precioPro.setBackgroundColor(BaseColor.DARK_GRAY);
            subPro.setBackgroundColor(BaseColor.DARK_GRAY);
            // Agregar los encabezados de los productos
            producto.addCell(desPro);
            producto.addCell(cantPro);
            producto.addCell(precioPro);
            producto.addCell(subPro);
            // Consulta los datos de los productos
            String consultaProducto = "SELECT d.precio, d.cantidad, d.subtotal, p.descripcion FROM ventas v INNER JOIN detalle_ventas d ON v.id = d.id_venta INNER JOIN productos p ON d.id_producto = p.id WHERE v.id = " + id_venta;
            try {
                con = cn.getConexion();
                ps = con.prepareStatement(consultaProducto);
                rs = ps.executeQuery();

                while (rs.next()) {
                    producto.addCell(rs.getString("descripcion"));
                    producto.addCell(rs.getString("cantidad"));
                    producto.addCell(rs.getString("precio"));
                    producto.addCell(rs.getString("subtotal"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            doc.add(producto);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar total a pagar
            Paragraph totalPagar = new Paragraph();
            totalPagar.add("Total a pagar: " + totalGeneral);
            totalPagar.setAlignment(Element.ALIGN_RIGHT);
            doc.add(totalPagar);
            doc.add(Chunk.NEWLINE);
            
            //Mostrar mensaje
            Paragraph saludo = new Paragraph();
            saludo.add(mensaje);
            saludo.setAlignment(Element.ALIGN_CENTER);
            doc.add(saludo);
            doc.add(Chunk.NEWLINE);
            
            // Cerrar archivos
            doc.close();
            archivo.close();
            
            Desktop.getDesktop().open(salida);

        } catch (DocumentException | HeadlessException | IOException  e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
