/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmPrincipal.java
 *
 * Created on 25-may-2012, 20:05:41
 */
package Vistas;

import Modelo.Gestores.GestorTipoUsuario;
import Modelo.Gestores.GestorUsuario;
import Modelo.TipoUsuario;
import Modelo.Usuario;
import Vistas.ABMPacientes.FrmAdministrarPaciente;
import Vistas.ABMPacientes.FrmRegistrarEditarPaciente;
import Vistas.ABMUsuario.FrmRegistrarUsuario;
import Vistas.ABMUsuario.FrmTipoUsuario;
import Vistas.General.GestorABM;
import Vistas.Permisos.GestorSeguridad;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Lisandro
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /** Creates new form FrmPrincipal */
    public FrmPrincipal() {  
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); //Obtiene el tamaño de la pantalla.
        this.setSize((int) d.getWidth() , (int) d.getHeight()); //Establece el tanaño de la ventana (frame) a un tamaño que deseo, teniendo en cuenta a d, que es el tamaño de la ventana.
        this.setLocation(0,0); //Establece la ventana enm la esquina superior ixquierda.
        this.setExtendedState(MAXIMIZED_BOTH); 
        GestorSeguridad.getInstance();
        GestorUsuario gestorUsuario=new GestorUsuario();
        int alto = Toolkit.getDefaultToolkit().getScreenSize().height;
        int ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
        escritorio.setSize(ancho,alto);
//       Usuario usuario=new Usuario();
//       usuario.setNombre("Administrador");
//        GestorTipoUsuario gestorTipoUsuario=new GestorTipoUsuario();
//        TipoUsuario tipoUsuario= new TipoUsuario();
//        tipoUsuario.setNombre("Administrador");
//        usuario.setTipoUsuario(tipoUsuario);
//        gestorUsuario.guardarObjeto(usuario);
        
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(escritorio);
        escritorio.setBounds(0, 0, 780, 600);

        jMenu2.setText("Archivo");

        jMenuItem3.setText("Usuarios");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Tipo Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Paciente");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Administrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Agregar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 799, 555);
    }// </editor-fold>//GEN-END:initComponents

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    // TODO add your handling code here:
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    openAdmPaciente();
   // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    openRegPaciente();
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        openRegUsuario();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        openRegTipoUsuario();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

    private void openAdmPaciente() {
        FrmAdministrarPaciente frmAdminPaciente=new FrmAdministrarPaciente();
        escritorio.add(frmAdminPaciente);
        frmAdminPaciente.setVisible(true);
    }

    private void openRegPaciente() {
        FrmRegistrarEditarPaciente frmRegistrarEditarPaciente=new FrmRegistrarEditarPaciente();
        escritorio.add(frmRegistrarEditarPaciente);
        frmRegistrarEditarPaciente.setVisible(true);
    }

    private void openRegUsuario() {
        FrmRegistrarUsuario frmRegistrarUsuario = new FrmRegistrarUsuario();
        escritorio.add(frmRegistrarUsuario);
        frmRegistrarUsuario.setVisible(true);     
    }
    
    private void openRegTipoUsuario() {
        FrmTipoUsuario frmTipoUsuario = new FrmTipoUsuario();
        escritorio.add(frmTipoUsuario);
        frmTipoUsuario.setVisible(true);     
    }
}