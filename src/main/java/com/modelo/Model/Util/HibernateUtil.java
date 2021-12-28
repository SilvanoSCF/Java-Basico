package com.modelo.Model.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

   // private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static final SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();
	
	 public static SessionFactory getFabricaDeSessoes() {
	        return fabricaDeSessoes;
	    }

    private static SessionFactory criarFabricaDeSessoes() {
        try {
            // Cria uma conxão a partir do  hibernate.cfg.xml       	
        	Configuration configuration = new Configuration().configure();       	
        	
        	ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();   
        	
        	SessionFactory fabrica = configuration.buildSessionFactory(registro);
        	
        			
        	return fabrica;
			//    new StandardServiceRegistryBuilder().build() );
        }
        catch (Throwable ex) {
            // Mensagem de erro ao conectar
            System.err.println("     -   -   -   -    A conexão não foi criada ...    -   -   -   -    " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

   

}
