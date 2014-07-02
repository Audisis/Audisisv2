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
@Table(name = "localidad")
public class Localidad {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String codigoPostal;
    private String nombreLocalidad;
    @ManyToOne(targetEntity = Provincia.class, cascade= CascadeType.ALL)
    private Provincia provincia;

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }


    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
}
