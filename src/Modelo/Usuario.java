package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String nombre;
    private String contraseña;
    private transient Sesion sesionActual;
    @ManyToOne(targetEntity = TipoUsuario.class, cascade= CascadeType.ALL)
    private TipoUsuario tipoUsuario;
    //private Empleado empleado;

    
    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = (Short)id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Sesion getSesionActual() {
        return sesionActual;
    }

    public void setSesionActual(Sesion sesionActual) {
        this.sesionActual = sesionActual;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
/*
 * --Utilizar Persona o Empleado
 * 
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    * */
}
