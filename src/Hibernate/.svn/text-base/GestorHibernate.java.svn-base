/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Lisandro
 */
public class GestorHibernate<T> implements IPersistencia<T> {
    private Transaction tx;
    private Class<T> persistentClass;
    private Session sesion;
    
    
    public GestorHibernate(){
        this.sesion = HibernateUtil.getSession();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
 public void guardarObjeto(T objeto){
        try{
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        s.save(objeto);        
        tx.commit();

            
        } catch(Exception ex){
            System.out.println("error "+ex);
            System.out.println("Repositorio.guardarObjeto(Object objeto)"+objeto.getClass()+": "+objeto.toString()+ex);
            ex.printStackTrace();
            getTx().rollback();
        }
    }

    @Override
    public void actualizarObjeto(T objeto) throws Exception {
        try {
            Session session = getSession();
            setTx(session.beginTransaction());
            session.update(objeto);
            getTx().commit();
            System.out.println(" * actualizarObjeto() " + objeto.getClass() + ": " + objeto.toString());
        } catch (Exception ex) {
            System.out.println("Repositorio.actualizarObjeto(Object objeto)" + ex);
            throw ex;
        }
    }

    @Override
    public void eliminarObjeto(T objeto) throws Exception {
        setTx(getSession().beginTransaction());
        try {
            getSession().delete(objeto);
            getTx().commit();
            System.out.println(" * eliminarObjeto() " + objeto.getClass() + ": " + objeto.toString());
        } catch (Exception ex) {
            System.out.println("Repositorio.eliminarObjeto(Object objeto)" + ex);
            ex.printStackTrace();
            getTx().rollback();
            throw ex;
        }
    }

    @Override
    public List<T> getAll() {
        Criteria crit = getSession().createCriteria(getClassOfGeneric());
        return (List<T>) crit.list();
    }

    @Override
    public T getObjeto(Double id) {
        Criteria crit = getSession().createCriteria(getClassOfGeneric()).add(Restrictions.idEq(id));
        List<T> listaResultados = crit.list();
        return (listaResultados.size() > 0) ? listaResultados.get(0) : null;
    }

    public Transaction getTx() {
        return tx;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }

    protected Class getClassOfGeneric() {
        return persistentClass;
    }

    protected Session getSession() {
        return sesion;
    }

    protected Criteria getNewCriteria() {
        return getSession().createCriteria(getClassOfGeneric());
    }
   
   public DefaultComboBoxModel getModelCombo()
   {
    DefaultComboBoxModel modeloCombo=new DefaultComboBoxModel();
     Iterator it = this.getAll().iterator();
    while(it.hasNext()){
      modeloCombo.addElement(it.next());
     }
     return modeloCombo;
   }

   public DefaultListModel getModelList()
   {
    DefaultListModel modeloList=new DefaultListModel();
     Iterator it = this.getAll().iterator();
    while(it.hasNext()){
      modeloList.addElement(it.next());
     }
     return modeloList;
   }
}
