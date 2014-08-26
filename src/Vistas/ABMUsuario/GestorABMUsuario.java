/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMUsuario;

import Hibernate.IPersistencia;
import Modelo.TipoUsuario;
import Modelo.Usuario;
import Vistas.General.GestorABM;
import Vistas.General.GestorAdmin;
import Vistas.General.IVistaABM;
import Vistas.General.IVistaDomicilio;
import Vistas.TipoVista;

/**
 *
 * @author Lisandro
 */
public class GestorABMUsuario extends GestorABM{

       public GestorABMUsuario(IVistaABM vistaABM, GestorAdmin gestorAdmin,IPersistencia persistencia,Object objeto,IVistaDomicilio vistaDomicilio) {
        super(vistaABM, gestorAdmin,persistencia,objeto);
        this.setTipoVista(TipoVista.ABMUsuario);
    }

   
       
    @Override
    public FrmRegistrarEditarUsuario getVistaABM(){
        return (FrmRegistrarEditarUsuario) super.getVistaABM();
    }
       
       
    @Override
    protected void inicializarVentana() {
        getVistaABM().getNombre().setText("");
        getVistaABM().getApellido().setText("");
        getVistaABM().getNombreUsuario().setText("");
        getVistaABM().getEMail().setText("");
    //***/Falta Domicilio y Permisos
     
    }

    @Override
    public Usuario getObjeto(){
        return (Usuario)super.getObjeto();
    }
    
    
    
    @Override
    protected Object crearObjeto() {
        Usuario usuario = new Usuario();
        usuario.setTipoUsuario(new TipoUsuario());
        setearObjeto(usuario);
        return usuario;
    }

        private void setearObjeto(Usuario usuario) {
       
         usuario.setNombre(getVistaABM().getNombre().getText());
         usuario.setApellido(getVistaABM().getApellido().getText());
         usuario.setNombreUsuario(getVistaABM().getNombreUsuario().getText());
         usuario.seteMail(getVistaABM().getEMail().getText());
         usuario.setTelefono(getVistaABM().getTelefono().getText());        
    }
        
    @Override
    protected Object modificarObjeto() {
        Usuario usuario = getObjeto();
        setearObjeto(usuario);
        return usuario;
    }

    @Override
    protected Boolean isDatosValidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        private void setearVistaDatos(){
        getVistaABM().getNombre().setText(getObjeto().getNombre());
        getVistaABM().getApellido().setText(getObjeto().getApellido());
        getVistaABM().getNombreUsuario().setText(getObjeto().getNombreUsuario());
        getVistaABM().getTelefono().setText(getObjeto().getTelefono());
    }
    
}
