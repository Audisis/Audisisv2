package Modelo;
import Vistas.TipoVista;
import javax.persistence.*;


@Entity
@Table(name = "permiso")
public class Permiso  {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.STRING) 
    private TipoVista tipoVista;
    private Boolean puedeAgregar;
    private Boolean puedeModificar;
    private Boolean puedeConsultar;
    private Boolean puedeEliminar;
    private Boolean puedeImprimir;
    private Boolean puedeBuscar;
    private Boolean puedeIniciar;

    public Boolean puedeAgregar() {
        return puedeAgregar;
    }

    public void setPuedeAgregar(Boolean puedeAgregar) {
        this.puedeAgregar = puedeAgregar;
    }

    public Boolean puedeConsultar() {
        return puedeConsultar;
    }

    public void setPuedeConsultar(Boolean puedeConsultar) {
        this.puedeConsultar = puedeConsultar;
    }

    public Boolean puedeEliminar() {
        return puedeEliminar;
    }

    public void setPuedeEliminar(Boolean puedeEliminar) {
        this.puedeEliminar = puedeEliminar;
    }

    public Boolean puedeBuscar() {
        return puedeBuscar;
    }

    public void setPuedeBuscar(Boolean puedeBuscar) {
        this.puedeBuscar = puedeBuscar;
    }

    public Boolean puedeImprimir() {
        return puedeImprimir;
    }

    public void setPuedeImprimir(Boolean puedeImprimir) {
        this.puedeImprimir = puedeImprimir;
    }

    public Boolean puedeModificar() {
        return puedeModificar;
    }
   
    
    public Boolean puedeIniciar() {
        return puedeIniciar;
    }

    public void setPuedeIniciar(Boolean puedeIniciar) {
        this.puedeIniciar = puedeIniciar;
    }
    
    public void setPuedeModificar(Boolean puedeModificar) {
        this.puedeModificar = puedeModificar;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = (Short)id;
    }
}
