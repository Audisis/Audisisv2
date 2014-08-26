package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contrasena;
    private String eMail;
    private String Telefono;
    private String salt;
    private transient Sesion sesionActual;
    @ManyToOne(targetEntity = TipoUsuario.class, cascade= CascadeType.ALL)
    private TipoUsuario tipoUsuario;
    @ManyToOne(targetEntity = Domicilio.class, cascade= CascadeType.ALL)
    private Domicilio domicilio;
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
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
