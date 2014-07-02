/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lisandro
 */
package Modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "persona")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Persona {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    @ManyToOne(targetEntity = Domicilio.class, cascade= CascadeType.ALL)
    private Domicilio domicilio;
     @ManyToOne(targetEntity = Sexo.class, cascade= CascadeType.ALL)
    private Sexo sexo;
    @ManyToOne(targetEntity = TipoDocumento.class, cascade= CascadeType.ALL)
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    @OneToMany(targetEntity = Telefono.class, cascade= CascadeType.ALL)
    private Set<Telefono> telefonos= new HashSet();

    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }



    public Set<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
}
