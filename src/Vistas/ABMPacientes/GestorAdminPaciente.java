/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMPacientes;

import Hibernate.IPersistencia;
import Modelo.Gestores.GestorPaciente;
import Modelo.Gestores.GestorTipoDocumento;
import Modelo.Paciente;
import Vistas.General.GestorAdmin;
import Vistas.General.IVistaAdmin;
import Vistas.General.PnlAdmin;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.table.TableColumnExt;

/**
 *
 * @author Lisandro
 */
public class GestorAdminPaciente extends GestorAdmin{

    public GestorAdminPaciente(IVistaAdmin vistaAdmin, IPersistencia persistencia,Object objeto) {
        super(vistaAdmin, persistencia,objeto);
    }

 
    @Override
    public void inicializarVentana() {
        inicializarTabla();
        getVistaAdmin().getDocumento().setModel(new GestorTipoDocumento().getModelCombo());
    }
    
    public void inicializarTabla(){
       DefaultTableModel modelo=new DefaultTableModel(new String[]{"","Apellido", "Nombre","Domicilio","Localidad"}, 0);
       getPanelAdm().getTblAdmin().setModel(modelo);
       TableColumnExt columnObj = getPanelAdm().getTblAdmin().getColumnExt(0);
       columnObj.setVisible(false);
       List<Paciente> pacientes = getPersistencia().getAll();
       for (int i=0;i<pacientes.size();i++){
           String domicilio = pacientes.get(i).getDomicilio().getCalle() +" "+ pacientes.get(i).getDomicilio().getNumeroCalle();
           modelo.addRow(new Object[]{pacientes.get(i),pacientes.get(i).getApellido(),pacientes.get(i).getNombre(),domicilio,pacientes.get(i).getDomicilio().getLocalidad().getNombreLocalidad()});
       } 
    }
    
    @Override
    public FrmAdminPaciente getVistaAdmin(){
        return (FrmAdminPaciente)super.getVistaAdmin();
       
    }
    
    @Override
    public FrmRegistrarEditarPaciente getVistaABM(){
       return (FrmRegistrarEditarPaciente) super.getVistaABM();
    }        
    @Override
    protected void agregarFila() {
        DefaultTableModel modelo = (DefaultTableModel) getPanelAdm().getTblAdmin().getModel();
        String domicilio = getObjeto().getDomicilio().getCalle() +" "+ getObjeto().getDomicilio().getNumeroCalle();
        modelo.addRow(new Object[]{getObjeto(),getObjeto().getApellido(),getObjeto().getNombre(),domicilio,getObjeto().getDomicilio().getLocalidad().getNombreLocalidad()});
        
    }

    @Override
    protected void modificarFila() {
        JXTable tabla = getVistaAdmin().getTblAdmin();
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        String domicilio = getObjeto().getDomicilio().getCalle() + " " + getObjeto().getDomicilio().getNumeroCalle();
        modelo.setValueAt(getObjeto(), tabla.getSelectedRow(), 0);
        modelo.setValueAt(getObjeto().getApellido(), tabla.getSelectedRow(), 1);
        modelo.setValueAt(getObjeto().getNombre(), tabla.getSelectedRow(), 2);
        modelo.setValueAt(domicilio, tabla.getSelectedRow(), 3);
        modelo.setValueAt(getObjeto().getDomicilio().getLocalidad(), tabla.getSelectedRow(), 4);
    }
    
    @Override
    public Paciente getObjeto(){
        return (Paciente)super.getObjeto();
    }

    @Override
    protected void modoAgregar() {
        this.setVistaABM(new FrmRegistrarEditarPaciente(this, new GestorPaciente(), new Paciente()));
        this.getVistaAdmin().getDesktopPane().add(this.getVistaABM());
        this.getVistaABM().setVisible(true);
        this.getVistaABM().getGestor();
        
   }

    @Override
    protected void modoModificar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
