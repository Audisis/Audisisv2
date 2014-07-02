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
@Table(name = "telefono")
public class Telefono {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String numero;
    @ManyToOne(targetEntity = TipoTelefono.class, cascade= CascadeType.ALL)
    private TipoTelefono tipoTelefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    
}
