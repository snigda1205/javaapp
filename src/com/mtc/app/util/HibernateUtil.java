package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.entity.Product;


public class HibernateUtil {
	public static SessionFactory SESSION_FACTORY;
	
		static
		{
			Configuration config=new Configuration();
			  config.configure();
			  
			  config.addAnnotatedClass(Product.class);
			 
			  ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			  
			  SESSION_FACTORY =config.buildSessionFactory(sr);
			
			
		}
		public static SessionFactory getSessionFactory()
		{
			return SESSION_FACTORY;
		}
		
		
	

}
