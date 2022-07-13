package com.demo.main;

import com.demo.businesslogic.ProductImplement;
import com.demo.entity.Company;
import com.demo.entity.Product;

public class Main {

	public static void main(String[] args) {

//		-------------------
		// creating Product object and passing + setting values
		Product recordPro1 = new Product("iPhone 6S", "Apple", "Excellent", "Space Grey", "45000");
		Product recordPro2 = new Product("iPhone 12 Mini", "Apple", "Very Good", "White", "80000");
		Product recordPro3 = new Product("Xperia X1", "Sony", "Good", "Blue", "35973");

		System.out.println("---- Product Data Inserted and Associated Successfully..!!");

//		-------------------------
		// creating Company object and passing + setting values
		Company recordComp1 = new Company("Saptak India", "Mumbai", "India");
		Company recordComp2 = new Company("Saptak Global", "London", "UK");

		// one to one association of company to product
		recordPro1.setCompany(recordComp1);
		recordPro2.setCompany(recordComp2);

		// one to one association of product to company
		ProductImplement proImpObj = new ProductImplement();
		proImpObj.createProduct(recordPro1);
		proImpObj.createProduct(recordPro2);

		System.out.println("---- Company Data Inserted and Associated Successfully..!!");

//		-------------------------
		// Implementation class object
		ProductImplement prodImplObj = new ProductImplement();

		// Fetching data from database
		Product resultPro4 = prodImplObj.viewProduct(1);
		Product resultPro5 = prodImplObj.viewProduct(2);

		// Updating Data by ID
		Product recordPro4 = new Product(2, "Xperia Z Ultra", "Sony", "Fair", "Black", "45688");

		Product resultPro6 = prodImplObj.updateProduct(recordPro4);

		// Deleting record by ID
//		Product resultPro7 = prodImplObj.deleteProduct(1);

		// validation for operations executed
		if (recordPro1 != null && recordPro2 != null && recordPro3 != null) {
			System.out.println("---- Product Data Inserted Successfully..!!");
		} else if (resultPro4 != null && resultPro5 != null) {
			System.out.println("---- Product Data Fetched Successfully..!!");
		} else if (resultPro6 != null) { //
			System.out.println("---- Product Data Updated Successfully..!!");
		} else {
			System.out.println("**** Product Operation Failed");
		}

		System.out.println("-----------  All Product Operation Completed  ----------------");

	}
}

//// Insertion operation
//Product resultPro1 = prodRepo.createProduct(recordPro1);
//Product resultPro2 = prodRepo.createProduct(recordPro2);
//Product resultPro3 = prodRepo.createProduct(recordPro3);

//CompanyImplement compImpObj = new CompanyImplement();
//Company resultComp1 = compImpObj.createCompany(recordComp1);
//Company resultComp2 = compImpObj.createCompany(recordComp2);

// validation for operations executed
//if (resultComp1 != null && resultComp2 != null) {
//	System.out.println("---- Company Data Inserted Successfully..!!");
//} else {
//	System.out.println("**** Company Operation Failed");
//}

//Product p = new Product();
//p.setCompany(resultComp1);
//p.setCompany(resultComp1);

//recordComp1.setProduct(resultPro2);
//recordComp2.setProduct(resultPro3);
