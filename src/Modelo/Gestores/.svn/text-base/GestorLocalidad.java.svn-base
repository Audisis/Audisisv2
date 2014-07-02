/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestores;

import Hibernate.GestorHibernate;
import Modelo.Localidad;
import Modelo.Provincia;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Lisandro
 */
public class GestorLocalidad extends GestorHibernate<Localidad> {

    public ComboBoxModel getModelCombo(Provincia provincia) {
    DefaultComboBoxModel modeloCombo=new DefaultComboBoxModel();
    Iterator it = provincia.getLocalidades().iterator();
    while(it.hasNext()){
      modeloCombo.addElement(it.next());
     }
     return modeloCombo;
    }
    
}
