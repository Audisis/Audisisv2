/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMPacientes;

import Hibernate.IPersistencia;
import Modelo.Domicilio;
import Modelo.Gestores.GestorLocalidad;
import Modelo.Gestores.GestorProvincia;
import Modelo.Gestores.GestorSexo;
import Modelo.Gestores.GestorTipoDocumento;
import Modelo.Localidad;
import Vistas.General.GestorABM;
import Modelo.Paciente;
import Modelo.Provincia;
import Modelo.TipoDocumento;
import Vistas.ABMDomicilio.FrmDomicilio;
import Vistas.General.GestorAdmin;
import Vistas.General.IVistaABM;
import Vistas.General.IVistaDomicilio;

/**
 *
 * @author Lisandro
 */
public class GestorABMPaciente extends GestorABM {
    private IVistaDomicilio vistaDomicilio;
    
    public GestorABMPaciente(IVistaABM vistaABM, GestorAdmin gestorAdmin,IPersistencia persistencia,Object objeto,IVistaDomicilio vistaDomicilio) {
        super(vistaABM, gestorAdmin,persistencia,objeto);
        this.setVistaDomicilio(vistaDomicilio);     
    }

    @Override
    protected void inicializarVentana() {
        getVistaABM().getApellidoPaciente().setText("");
        getVistaABM().getNombrePaciente().setText("");
        getVistaABM().getNumeroDocumento().setText("");
        getVistaDomicilio().getCalle().setText("");
        getVistaDomicilio().getDpto().setText("");
        getVistaDomicilio().getPiso().setText("");
        getVistaDomicilio().getNumeroCalle().setText("");
        cargarCombos();
    }
    
    @Override
    public Paciente getObjeto(){
        return (Paciente)super.getObjeto();
    }
    
    @Override
    public GestorAdminPaciente getGestorAdmin(){
        return (GestorAdminPaciente)super.getGestorAdmin();
    }

    public FrmDomicilio getVistaDomicilio() {
        return (FrmDomicilio) this.vistaDomicilio;
    }

    private void setVistaDomicilio(IVistaDomicilio vistaDomicilio) {
        this.vistaDomicilio = vistaDomicilio;
    }
    
    @Override
    public FrmRegistrarEditarPaciente getVistaABM(){
        return (FrmRegistrarEditarPaciente) super.getVistaABM();
    }
    
 

    private void cargarCombos() {
       getVistaABM().getCmbSexo().setModel(new GestorSexo().getModelCombo());       
       getVistaABM().getCmbTipoDocumento().setModel(new GestorTipoDocumento().getModelCombo());
       getVistaDomicilio().getCmbProvincia().setModel(new GestorProvincia().getModelCombo());
       getVistaDomicilio().getCmbLocalidad().setModel(new GestorLocalidad().getModelCombo());
    }
    
    @Override
    protected Object crearObjeto() {
        Paciente paciente = new Paciente();
        paciente.setDomicilio(new Domicilio());
        setearObjeto(paciente);
        return paciente;
    }

    @Override
    protected Object modificarObjeto() {
        Paciente paciente = getObjeto();
        setearObjeto(paciente);
        return paciente;
    }

    private void setearObjeto(Paciente paciente) {
        Domicilio domicilio = paciente.getDomicilio();
        paciente.setApellido(getVistaABM().getApellidoPaciente().getText());
        paciente.setNombre(getVistaABM().getNombrePaciente().getText());
        paciente.setTipoDocumento((TipoDocumento) getVistaABM().getCmbTipoDocumento().getSelectedItem());
        paciente.setNumeroDocumento(getVistaABM().getNumeroDocumento().getText());
        paciente.setEmail(getVistaABM().getEmail().getText());
        paciente.setFechaNacimiento(getVistaABM().getDtpFechaNacimiento().getDate());
        domicilio.setLocalidad((Localidad)getVistaDomicilio().getCmbLocalidad().getSelectedItem());
        domicilio.setCalle(getVistaDomicilio().getCalle().getText());
        domicilio.setNumeroCalle(getVistaDomicilio().getNumeroCalle().getText());
        domicilio.setDpto(getVistaDomicilio().getDpto().getText());
        domicilio.setPiso(getVistaDomicilio().getDpto().getText());
        paciente.setDomicilio(domicilio);
    }

    @Override
    protected Boolean isDatosValidos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void setearVistaDatos(){
        Domicilio domicilio=getObjeto().getDomicilio();
        getVistaABM().getApellidoPaciente().setText(getObjeto().getApellido());
        getVistaABM().getNombrePaciente().setText(getObjeto().getNombre());
        getVistaABM().getCmbTipoDocumento().setSelectedItem(getObjeto().getTipoDocumento().getNombre());
        getVistaABM().getCmbSexo().setSelectedItem(getObjeto().getSexo().getGenero());
        getVistaABM().getDtpFechaNacimiento().setDate(getObjeto().getFechaNacimiento());
        getVistaABM().getEmail().setText(getObjeto().getEmail());
        getVistaDomicilio().getCalle().setText(domicilio.getCalle());
        getVistaDomicilio().getDpto().setText(domicilio.getDpto());
        getVistaDomicilio().getNumeroCalle().setText(domicilio.getNumeroCalle());
        getVistaDomicilio().getPiso().setText(domicilio.getPiso());
        getVistaDomicilio().getCmbProvincia().setSelectedItem(domicilio.getLocalidad().getProvincia());
       //*Ver si el combo localdiad cambia al cargar la provincia*//
        getVistaDomicilio().getCmbLocalidad().setSelectedItem(domicilio.getLocalidad());
        
    }
    
    @Override
     public void cargarCmbLocalidad()
    {
       getVistaDomicilio().getCmbLocalidad().setModel(new GestorLocalidad().getModelCombo((Provincia) getVistaDomicilio().getCmbProvincia().getSelectedItem()));
    }        
    
}
