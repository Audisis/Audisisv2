package Modelo;



import Vistas.TipoVista;
import Vistas.VistaNoDisponibleException;
import java.util.Hashtable;
import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name = "tipousuario")
public class TipoUsuario {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String nombre;
    @javax.persistence.OneToMany(cascade = CascadeType.ALL)
    @javax.persistence.MapKey(name = "tipoVista")
    private Map<TipoVista, Permiso> permisosXVista;

    public Map<TipoVista, Permiso> getPermisosXVista() {
        return permisosXVista;
    }

    public void setPermisosXVista(Map<TipoVista, Permiso> permisosXVista) {
        this.permisosXVista = permisosXVista;
    }

    public TipoUsuario(){
        permisosXVista = new Hashtable<TipoVista, Permiso>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addVista(TipoVista vista, Permiso permiso){
        permisosXVista.put(vista, permiso);
    }

    public Permiso getPermiso(TipoVista vista) throws VistaNoDisponibleException{
        if(permisosXVista.get(vista) == null)
            throw new VistaNoDisponibleException("La vista " + vista + " no se encuentra en la colección");
        return permisosXVista.get(vista);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = (Short)id;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
