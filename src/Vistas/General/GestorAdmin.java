/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.General;

import Hibernate.IPersistencia;

/**
 *
 * @author Lisandro
 */
public abstract class GestorAdmin {
    private IPersistencia persistencia;
    private IVistaAdmin vistaAdmin;
    private IVistaABM vistaABM;
    private PnlAdmin panelAdm;
    private Object objeto;
    
    public GestorAdmin(IVistaAdmin vistaAdmin, IPersistencia persistencia,Object objeto) {
        this.persistencia = persistencia;
        this.vistaAdmin = vistaAdmin;
        this.objeto= objeto;
        inicializar();
    }

    public IVistaAdmin getVistaAdmin() {
        return vistaAdmin;
    }


    public void setVistaAdmin(IVistaAdmin vistaAdmin) {
        this.vistaAdmin = vistaAdmin;
    }


    public IPersistencia getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(IPersistencia persistencia) {
        this.persistencia = persistencia;
    }

    public PnlAdmin getPanelAdm() {
        return panelAdm;
    }

    public void setPanelAdm(PnlAdmin panelAdm) {
        this.panelAdm = panelAdm;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    
    public void inicializar(){
        inicializarVentana();
    }
    
    public void agregar(){
        this.getVistaABM().getGestor().setModo(Modo.Agregar);
        this.setObjeto(null);
        modoAgregar();
    }
    
    public void modificar(){
        this.getVistaABM().getGestor().setModo(Modo.Modificar);
        modoModificar();
    }
    
    public void consultar(){
        this.getVistaABM().getGestor().setModo(Modo.Consultar);
    }
    
    public void eliminar(){
    }

    public IVistaABM getVistaABM() {
        return vistaABM;
    }

    public void setVistaABM(IVistaABM vistaABM) {
        this.vistaABM = vistaABM;
    }
    
    protected abstract void modoAgregar(); 

    protected abstract void modoModificar();
    
    protected abstract void inicializarVentana(); 
    
    protected  abstract void agregarFila();
    
    protected  abstract void modificarFila();
}
