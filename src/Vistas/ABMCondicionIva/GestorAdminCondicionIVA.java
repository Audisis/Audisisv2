/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMCondicionIva;

import Hibernate.IPersistencia;
import Vistas.General.GestorAdmin;
import Vistas.General.IVistaAdmin;
import Vistas.General.PnlAdmin;
import Vistas.TipoVista;

/**
 *
 * @author Lisandro
 */
public class GestorAdminCondicionIVA extends GestorAdmin{
        public GestorAdminCondicionIVA(IVistaAdmin vistaAdmin, IPersistencia persistencia, PnlAdmin panelAdm,Object objeto) {
        super(vistaAdmin, persistencia, panelAdm,objeto);
        this.setTipoVista(TipoVista.ABMCondicionIVA);
    }

    @Override
    protected void modoAgregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void modoModificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void inicializarVentana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void agregarFila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void modificarFila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
