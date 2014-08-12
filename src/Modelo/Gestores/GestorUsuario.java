/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestores;

import Vistas.Permisos.EncriptadorPassword;
import Hibernate.GestorHibernate;
import Modelo.Usuario;

/**
 *
 * @author Lisandro
 */
public class GestorUsuario extends GestorHibernate<Usuario>{
    private String salt;
    private Usuario usuarioActivo;
    private String clave;
    
     public void encriptarPass()
    {
        StringBuilder sb = new StringBuilder(usuarioActivo.getId()+usuarioActivo.getTipoUsuario().getNombre()+usuarioActivo.getNombre().length());
        this.salt = sb.reverse().append(usuarioActivo.getId()).toString();
        EncriptadorPassword ep = new EncriptadorPassword(this.salt);
        this.clave = ep.encrypt(this.clave);        
    }
    
    public String desencriptarPass()
    {
        EncriptadorPassword ep = new EncriptadorPassword(usuarioActivo.getSalt());           
        String desEncrypted  = ep.decrypt(this.clave);
        return  desEncrypted;
    }

    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
}
