
package views;

import controllers.LoginControllers;
import models.Usuarios;
import models.UsuariosDao;

public class FLogin extends javax.swing.JFrame {
    
    Usuarios us = new Usuarios();
    UsuariosDao usDao = new UsuariosDao();
    
    public FLogin() {
        initComponents();
        LoginControllers users = new LoginControllers(us, usDao, this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtClave = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 78));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 30, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 30, 30));

        txtClave.setText("admin");
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 190, 30));

        txtUsuario.setText("admin");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, 30));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setFocusable(false);
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 100, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPasswordField txtClave;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
