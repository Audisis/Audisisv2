    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.General;

import Hibernate.IPersistencia;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisandro
 */
public abstract class GestorABM {
    private IPersistencia persistencia;
    private Object objeto;
    private IVistaABM vistaABM;
    private GestorAdmin gestorAdmin;
    private Modo modo;

    public GestorABM(IVistaABM vistaABM, GestorAdmin gestorAdmin, IPersistencia persistencia,Object objeto) {
        this.setVistaABM(vistaABM);
        this.setPersistencia(persistencia);
        this.setObjeto(objeto);
        this.setGestorAdmin(gestorAdmin);
    }

    public Object getObjeto() {
        return objeto;
    }

    private void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public IPersistencia getPersistencia() {
        return persistencia;
    }

    private void setPersistencia(IPersistencia persistencia) {
        this.persistencia = persistencia;
    }


    public GestorAdmin getGestorAdmin() {
        return gestorAdmin;
    }

    private void setGestorAdmin(GestorAdmin gestorAdmin) {
        this.gestorAdmin = gestorAdmin;
    }

    public IVistaABM getVistaABM() {
        return vistaABM;
    }

    private void setVistaABM(IVistaABM vistaABM) {
        this.vistaABM = vistaABM;
    }
   
    public void inicializar() {
        inicializarVentana();
    }
     
    public void aceptar() {
        if (isDatosValidos())
            {
                if (modo == Modo.Agregar){
                 setObjeto(crearObjeto());
                    try {
                        getPersistencia().guardarObjeto(getObjeto());
                        if(this.getGestorAdmin()!=null)this.getGestorAdmin().agregarFila();
                         } catch (Exception ex) {
                           Logger.getLogger(GestorABM.class.getName()).log(Level.SEVERE, null, ex);
                           }
                }
                if (modo == Modo.Modificar){
                try {
                           setObjeto(modificarObjeto());
                           getPersistencia().actualizarObjeto(getObjeto());
                           if(this.getGestorAdmin()!=null)this.getGestorAdmin().modificarFila();
                    } catch (Exception ex) {
                           Logger.getLogger(GestorABM.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            else
                JOptionPane.showMessageDialog(null, "Los datos son inválidos", "Error", JOptionPane.OK_OPTION);
    }
    
    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }
    
    public void cargarCmbLocalidad()
    {
    
    }        
    
    protected abstract void inicializarVentana();
    
    protected abstract Object crearObjeto();
    
    protected abstract Object modificarObjeto();
    
    protected abstract Boolean isDatosValidos();       
    
}
