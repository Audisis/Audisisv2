/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import javax.persistence.*;



/**
 *
 * @author Lisandro
 */
@Entity
@Table(name = "sexo")
public class Sexo {
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private int id;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return this.getGenero();
    }
}
