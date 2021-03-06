
/**
 *
 * @author toño
 */

package com.dulcestintin.principal;

import com.dulcestintin.controller.Conexion;
import com.dulcestintin.principal.Interface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
public class Altas extends javax.swing.JFrame {
    Conexion con;
    ResultSet rs;

    /** Creates new form Altas */
    public Altas() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTap = new javax.swing.JTextField();
        jTam = new javax.swing.JTextField();
        jTuser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCnivel = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTpass2 = new javax.swing.JPasswordField();
        jTpass = new javax.swing.JPasswordField();
        jBagregar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Agregar Usuario");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Nombre: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 40, 61, 16);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 80, 114, 16);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Apellido Materno:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 120, 116, 16);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Nombre de Usuario:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 160, 132, 16);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 200, 80, 16);

        jTnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTnombre);
        jTnombre.setBounds(180, 40, 250, 29);

        jTap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTapActionPerformed(evt);
            }
        });
        jPanel1.add(jTap);
        jTap.setBounds(180, 80, 250, 28);

        jTam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTamActionPerformed(evt);
            }
        });
        jPanel1.add(jTam);
        jTam.setBounds(180, 120, 252, 23);

        jTuser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTuserActionPerformed(evt);
            }
        });
        jPanel1.add(jTuser);
        jTuser.setBounds(180, 160, 252, 28);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Tipo de Usuario:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 290, 110, 16);

        jCnivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCnivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Vendedor", "Capturista" }));
        jPanel1.add(jCnivel);
        jCnivel.setBounds(200, 290, 120, 21);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Repetir Contraseña:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 240, 132, 16);

        jTpass2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTpass2);
        jTpass2.setBounds(180, 240, 250, 30);

        jTpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpassActionPerformed(evt);
            }
        });
        jPanel1.add(jTpass);
        jTpass.setBounds(180, 200, 250, 30);

        jBagregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar);
        jBagregar.setBounds(160, 375, 170, 36);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo azul.jpg"))); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel35);
        jLabel35.setBounds(0, 10, 460, 450);

        jLabel30.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel30.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel30.setName(""); // NOI18N
        jPanel1.add(jLabel30);
        jLabel30.setBounds(10, 10, 460, 450);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cancelar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTnombreActionPerformed

private void jTapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTapActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTapActionPerformed

private void jTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTamActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTamActionPerformed

private void jTuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTuserActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTuserActionPerformed

private void jTpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpassActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTpassActionPerformed

private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed

    if(jTnombre.getText().equals("") ||jTap.getText().equals("") || jTam.getText().equals("")
            ||jTuser.getText().equals("") ||jTpass.getText().equals("") ||jTpass2.getText().equals("") ) {
    
        JOptionPane.showMessageDialog(null,"No puede dejar espacios sin llenar");
    }
    else{
        
      
            String aux="";  
            String nom=jTnombre.getText();
            String ap=jTap.getText();
            String am=jTam.getText();
            String user=jTuser.getText();
            String pass1=jTpass.getText();
            String pass2=jTpass2.getText();
            int nivel = jCnivel.getSelectedIndex();
            
            if(!pass1.equals(pass2)) {
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                jTpass.setText("");
                jTpass2.setText("");
            }
            else {
            
              try {
            
            // se hace la conexion con la base de datos
            con = new Conexion();

               //metodo para encriptar la contraseña insertada en MD5
               
//             
                
                String sql = "INSERT INTO `usuarios`(`nombre`, `apellido_paterno`, `apellido_materno`, `user`, `password`, `nivel`) VALUES ('"+nom+"','"+ap+"','"+am+"','"+user+"','"+pass1+"','"+nivel+"')";
                
                con.ejecutar(sql);
                if(nivel==0)
                    aux="Administrador(a)";
                if(nivel==1)
                    aux="Vendedor(a)";
                if(nivel==2)
                    aux="Capturista";
                JOptionPane.showMessageDialog(null,"Usuario: [ "+user+" ] agregado como "+aux+" ");
                // se compara que el usuario de la base de datos es el mismo que el insertado
                //se comparan ambas contraseñas encriptadas
                
                jTnombre.setText("");
                jTap.setText("");
                jTam.setText("");
                jTuser.setText("");
                jTpass.setText("");
                jTpass2.setText("");
                this.dispose();
                
                   
                   
                        
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
     }
    
    
    
    
    
    }
        
    
    
    
    
}//GEN-LAST:event_jBagregarActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrarla?","Cerrar aplicación",1)==0){
       
            this.hide();
        }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Realizado por:\n\n ANTONIO VAZQUEZ, RUBEN SUCIL, JOSE DE JESUS  ");
}//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Altas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JComboBox jCnivel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTam;
    private javax.swing.JTextField jTap;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JPasswordField jTpass;
    private javax.swing.JPasswordField jTpass2;
    private javax.swing.JTextField jTuser;
    // End of variables declaration//GEN-END:variables
}
