package com.demo.factory;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryDemo {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		// creating session factory object for creating session and executing
		// transactions
		try {
			// Creating Configuration Instance & Passing Hibernate Configuration File
			Configuration configObj = new Configuration();
			configObj.configure("hibernate.cfg.xml");

			// As Hibernate Version 4.x Service Registry is used
			ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
					.applySettings(configObj.getProperties()).build();
			
			// Creating hibernate session factory instance
			sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return sessionFactory;
	}
}

/*
 * // Builds session factory instance and configure it with POJO Class (Product)
 * //sessionFactory = new
 * AnnotationConfiguration().configure().addAnnotatedClass(Product.class).
 * buildSessionFactory();
 * 
 * 	public static SessionFactory SessionFactory() {
 * 
 * 	//		 Builds session factory instance and configure it with POJO Class (Product)
 * 	//		SessionFactory sessionFactory = new AnnotationConfiguration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
 * 		return sessionFactory;
 * 	}
 */
