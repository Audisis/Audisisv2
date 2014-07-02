/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;

/**
 *
 * @author Lisandro
 */
public interface IPersistencia <T>{
    void guardarObjeto(T objeto) throws Exception;
    void actualizarObjeto(T objeto) throws Exception;
    void eliminarObjeto(T objeto) throws Exception;
    List<T> getAll();
    T getObjeto(Double id);
}
