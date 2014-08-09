/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.*;

/**
 *
 * @author Nico
 */

@Entity
@Table (name = "condicionIVA")
public class CondicionIVA {
    private String nombreCondicionIVA;
    @Id@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
    private int id;
}

