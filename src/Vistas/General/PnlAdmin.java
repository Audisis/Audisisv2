/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PnlAdmin.java
 *
 * Created on 07/06/2012, 19:17:21
 */
package Vistas.General;

import javax.swing.JButton;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Nico
 */
public class PnlAdmin extends javax.swing.JPanel {
    private GestorAdmin gestor;
    
    /** Creates new form PnlAdmin */
    public PnlAdmin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new org.jdesktop.swingx.JXTable();

        setLayout(null);

        jXPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jXPanel1.setLayout(null);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jXPanel1.add(btnNuevo);
        btnNuevo.setBounds(20, 13, 70, 25);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jXPanel1.add(btnEditar);
        btnEditar.setBounds(20, 50, 70, 25);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jXPanel1.add(btnEliminar);
        btnEliminar.setBounds(20, 90, 70, 25);

        add(jXPanel1);
        jXPanel1.setBounds(580, 10, 110, 130);

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAdmin);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 550, 240);
    }// </editor-fold>//GEN-END:initComponents

private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    gestor.agregar();
}//GEN-LAST:event_btnNuevoActionPerformed

private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   gestor.modificar();
}//GEN-LAST:event_btnEditarActionPerformed

private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   gestor.eliminar();
}//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTable tblAdmin;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JXTable getTblAdmin() {
        return tblAdmin;
    }

    public void setTblAdmin(JXTable tblAdmin) {
        this.tblAdmin = tblAdmin;
    }

    public GestorAdmin getGestor() {
        return gestor;
    }

    public void setGestor(GestorAdmin gestor) {
        this.gestor = gestor;
    }
    

}
