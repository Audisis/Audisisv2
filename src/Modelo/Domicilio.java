/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lisandro
 */
package Modelo;
import javax.persistence.*;


@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String calle;
    private String numeroCalle;
    private String dpto;
    private String piso;
    @ManyToOne(targetEntity = Localidad.class, cascade= CascadeType.ALL)
    private Localidad localidad;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCalle() {
        return calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
       
}
