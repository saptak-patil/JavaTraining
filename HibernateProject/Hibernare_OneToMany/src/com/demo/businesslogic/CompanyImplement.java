package com.demo.businesslogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.CompanyDao;
import com.demo.entity.Company;
import com.demo.factory.SessionFactoryDemo;

public class CompanyImplement implements CompanyDao {

	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transact = null;

	@Override
	public Company createCompany(Company c) {
		
		// starting a session using session factory and opening a connection for
		// Transaction/SQL/database operations
		session = SessionFactoryDemo.getSessionFactory().openSession();

		// Creating transaction using current session
		transact = session.beginTransaction();

		// creating company entity object and setting values
//		Company c = new Company();
//		c.setCompanyName(name);
//		c.setCity(city);
//		c.setCountry(country);

		// saving session == "Insert into table values()"
		session.save(c);

		// commit the transaction
		transact.commit();

		// CLosing Session after completion
		session.close();

		// Retrun's company object
		return c;
	}
	
}
