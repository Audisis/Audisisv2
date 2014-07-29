/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audisisv2;

import Hibernate.HibernateUtil;
import Vistas.FrmInicioSesion;
import Vistas.FrmPrincipal;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.hibernate.Session;

/**
 *
 * @author Lisandro
 */
public class AudisisV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             try {
             JFrame.setDefaultLookAndFeelDecorated(true);
             JDialog.setDefaultLookAndFeelDecorated(true);
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e) {             
         }
        try{
        HibernateUtil.inicializar();
        } catch(Exception e){
        }
        try{
            Session s = HibernateUtil.getSession();
        }catch(Exception e){
        }
        FrmInicioSesion frmInicioSesion=new FrmInicioSesion();
        frmInicioSesion.setEnabled(true);
        frmInicioSesion.setVisible(true);
    }
  }

