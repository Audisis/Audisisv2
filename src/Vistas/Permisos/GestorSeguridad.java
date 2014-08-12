/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Permisos;

import Modelo.Gestores.GestorUsuario;
import Modelo.Usuario;

/**
 *
 * @author Lisandro
 */
public class GestorSeguridad extends Object{
 
    private static final GestorSeguridad INSTANCE = new GestorSeguridad();
    private GestorUsuario gestorUsuario;
    private Usuario usuario;
   
    public GestorSeguridad()
    { 
        gestorUsuario=new GestorUsuario();
    }
   
    public static GestorSeguridad getInstance(){
        return INSTANCE;
    }

    public GestorUsuario getGestorUsuario() {
        return gestorUsuario;
    }

    public void setGestorUsuario(GestorUsuario gestorUsuario) {
        this.gestorUsuario = gestorUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
      public EstadoLogin configUsuario(String login,String clave)
    {
        if(getUsuario() == null)
        {
            return initUsuario(login,clave);
        }else{
            return EstadoLogin.ERROR;
        }
    }

    private EstadoLogin initUsuario(String login,String clave)
    {
        usuario = new Usuario();        

        if(usuario == null)
        {
            return EstadoLogin.NO_EXISTE;
        }else{
            
            if(clave.equals(gestorUsuario.desencriptarPass()))
            {   
                return EstadoLogin.ACCESO_OK;
            }else{
                return EstadoLogin.ERROR_CLAVE;
            }
        }
    }
        

}
