package com.demo.businesslogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.factory.SessionFactoryDemo;

public class ProductRepo {

	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transact = null;

	// To create a new product
	public Product createProduct(String name, String brand, String description, String colour, String cost) {
		// starting a session using session factory and opening a connection for
		// Transaction/SQL/database operations
		session = SessionFactoryDemo.getSessionFactory().openSession();

		// Creating transaction using current session
		transact = session.beginTransaction();

		// creating entity object and setting values
		Product p = new Product();
//		Product p = new Product(name, brand, description, colour, cost);
		p.setName(name);
		p.setBrand(brand);
		p.setDescription(description);
		p.setColour(colour);
		p.setCost(cost);
		p.displayProduct();

		// saving session == "Insert into table values()"
		session.save(p);

		// commit the transaction
		transact.commit();

		// Closing Session after completion
		session.close();

		// Retrun's Product object
		return p;
	}

	// To view product details
	public Product viewProduct(long id) {
		// starting a session using session factory and opening a connection for
		// Transaction/SQL/database operations
		session = SessionFactoryDemo.getSessionFactory().openSession();

		// Creating transaction using current session
		transact = session.beginTransaction();

		// creating entity object and setting values
		Product p = (Product) session.get(Product.class, id);
		p.getId();
		p.getName();
		p.getBrand();
		p.getDescription();
		p.getColour();
		p.getCost();
		p.displayProduct();

		// saving session == "Insert into table values()"
		session.save(p);

		// commit the transaction
		transact.commit();

		// CLosing Session after completion
		session.close();

		// Retrun's Product object
		return p;
	}

	// To update product information
	public Product updateProduct(long id, String name, String brand, String description, String colour, String cost) {
		// starting a session using session factory and opening a connection for
		// Transaction/SQL/database operations
		session = SessionFactoryDemo.getSessionFactory().openSession();

		// Creating transaction using current session
		transact = session.beginTransaction();

		// creating entity object and setting values
		Product p = (Product) session.get(Product.class, id);
		p.setName(name);
		p.setBrand(brand);
		p.setDescription(description);
		p.setColour(colour);
		p.setCost(cost);
		p.displayProduct();

		// saving session == "Insert into table values()"
		session.save(p);

		// commit the transaction
		transact.commit();

		// CLosing Session after completion
		session.close();

		// Retrun's Product object
		return p;
	}

	// To delete a product from database
	public Product deleteProduct(long id) {

		// starting a session using session factory and opening a connection for
		// Transaction/SQL/database operations
		session = SessionFactoryDemo.getSessionFactory().openSession();

		// Creating transaction using current session
		transact = session.beginTransaction();

		// creating entity object and setting values
		Product p = (Product) session.get(Product.class, id);
		p.displayProduct();
		session.delete(p);

		// commit the transaction
		transact.commit();

		// CLosing Session after completion
		session.close();

		return p;
	}

}

//productOperationObj.getName();
//productOperationObj.getBrand();
//productOperationObj.getDescription();
//productOperationObj.getColour();
//productOperationObj.getCost();

//productOperationObj.displayProduct();
