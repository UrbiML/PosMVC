
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.Configuracion;
import models.UsuariosDao;
import views.PanelAdmin;


public class ConfigControllers implements MouseListener{
    
    private Configuracion config;
    private UsuariosDao configDao;
    private PanelAdmin views;
   

    public ConfigControllers(Configuracion config, UsuariosDao configDao, PanelAdmin views) {
        this.config = config;
        this.configDao = configDao;
        this.views = views;
        this.views.jLabelCategorias.addMouseListener(this);
        this.views.jLabelClientes.addMouseListener(this);
        this.views.jLabelConfig.addMouseListener(this);
        this.views.jLabelMedidas.addMouseListener(this);
        this.views.jLabelNuevaCompra.addMouseListener(this);
        this.views.jLabelNuevaVenta.addMouseListener(this);
        this.views.jLabelUsers.addMouseListener(this);
        this.views.jLabelProveedores.addMouseListener(this);
        this.views.jLabelProductos.addMouseListener(this);
        this.views.jLabelCaja.addMouseListener(this);
        config = configDao.getConfig();
        views.txtIdEmpresa.setText("" + config.getId());
        views.txtRucEmpresa.setText(config.getRuc());
        views.txtNombreEmpresa.setText(config.getNombre());
        views.txtTelefonoEmpresa.setText(config.getTelefono());
        views.txtDireccionEmpresa.setText(config.getDireccion());
        views.txtMensajeEmpresa.setText(config.getMensaje());
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jLabelConfig) {
            views.jTabbedPane1.setSelectedIndex(9);
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
        if (e.getSource() == views.jLabelCategorias) {
            views.JPanelCategorias.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelClientes) {
            views.JPanelClientes.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelMedidas) {
            views.JPanelMedidas.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelNuevaCompra) {
            views.JPanelNuevaCompra.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelProveedores) {
            views.JPanelProveedor.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelUsers) {
            views.JPanelUsers.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelProductos) {
            views.JPanelProductos.setBackground(new Color(255, 51, 51));
        } else if(e.getSource() == views.jLabelCaja) {
            views.JPanelCaja.setBackground(new Color(255, 51, 51));
        } else {
            views.JPanelConfig.setBackground(new Color(255, 51, 51));
        }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.jLabelCategorias) {
            views.JPanelCategorias.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelClientes) {
            views.JPanelClientes.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelMedidas) {
            views.JPanelMedidas.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelNuevaCompra) {
            views.JPanelNuevaCompra.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelProveedores) {
            views.JPanelProveedor.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelUsers) {
            views.JPanelUsers.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelProductos) {
            views.JPanelProductos.setBackground(new Color(51, 51, 51));
        } else if(e.getSource() == views.jLabelCaja) {
            views.JPanelCaja.setBackground(new Color(51, 51, 51));
        } else {
            views.JPanelConfig.setBackground(new Color(51, 51, 51));
        }
    }
    
}
