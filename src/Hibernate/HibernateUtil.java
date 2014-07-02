/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 *
 * @author Lisandro
 */
public class HibernateUtil {
    public static SessionFactory sessionFactory;
    public static Session session;
    public static void inicializar() {
        try {
    //     sessionFactory = new AnnotationConfiguration().buildSessionFactory();
         AnnotationConfiguration conf = new AnnotationConfiguration();
                try{
                conf.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");
                conf.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");  
                conf.setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5433/AudisisBD"); 
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error de Base de Datos Nº 2001");
                }
                try{
                conf.setProperty("hibernate.connection.username","postgres");
                conf.setProperty("hibernate.connection.password","postgres");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error de Base de Datos Nº 2002");
                }
                conf.setProperty("hibernate.connection.pool_size","10");                
                conf.setProperty("show_sql","true");
                conf.setProperty("hibernate.hbm2ddl.auto","update");
            
            //carga de paquetes
                conf.addPackage("Modelo");
                conf.addAnnotatedClass(Modelo.Domicilio.class);
                conf.addAnnotatedClass(Modelo.Familiar.class);
                conf.addAnnotatedClass(Modelo.Localidad.class);               
                conf.addAnnotatedClass(Modelo.Paciente.class);                
                conf.addAnnotatedClass(Modelo.Persona.class);
                conf.addAnnotatedClass(Modelo.Profesional.class);
                conf.addAnnotatedClass(Modelo.Provincia.class); 
                conf.addAnnotatedClass(Modelo.Sexo.class); 
                conf.addAnnotatedClass(Modelo.Telefono.class);
                conf.addAnnotatedClass(Modelo.TipoDocumento.class);
                conf.addAnnotatedClass(Modelo.TipoTelefono.class);
            sessionFactory = conf.buildSessionFactory();
            session=sessionFactory.openSession();

        } catch (Throwable ex) {
// Log exception!
        throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Session getSession()
    throws HibernateException {
        return session;
    }
}
