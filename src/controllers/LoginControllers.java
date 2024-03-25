
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Usuarios;
import models.UsuariosDao;
import views.FLogin;
import views.PanelAdmin;


public class LoginControllers implements ActionListener{
    private Usuarios us;
    private UsuariosDao usDao;
    private FLogin views;

    public LoginControllers(Usuarios us, UsuariosDao usDao, FLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnLogin.addActionListener(this);
        this.views.btnCancelar.addActionListener(this);
        this.views.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnLogin) {
            if (views.txtUsuario.getText().equals("") || String.valueOf(views.txtClave.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            } else {
                String usuario = views.txtUsuario.getText();
                String clave = String.valueOf(views.txtClave.getPassword());
                us = usDao.login(usuario, clave);
                
                if (us.getUsuario() != null) {
                    PanelAdmin admin = new PanelAdmin(us.getId(), us.getNombre());
                    admin.setVisible(true);
                    this.views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
                }
            }
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (pregunta == 0) {
                System.exit(0);
                
            }
        }
    } 
    
}
