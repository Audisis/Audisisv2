/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lisandro
 */
package Modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "localidad")
public class Provincia {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String nombreProvincia;
    @OneToMany (targetEntity = Localidad.class, cascade= CascadeType.ALL)
    private Set<Localidad> localidades = new HashSet();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Set<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(Set<Localidad> localidades) {
        this.localidades = localidades;
    }
    
    
}
