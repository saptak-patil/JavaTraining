package com.demo.main;

import com.demo.businesslogic.ProductRepo;
import com.demo.entity.Product;

public class ProductManger {

	public static void main(String[] args) {

		// creating ProductRepo object and passing + setting values
		ProductRepo prodRepo = new ProductRepo();

		// Insertion operation
		Product result1 = prodRepo.createProduct("iPhone 6S", "Apple", "Excellent", "Space Grey", "45000");
		Product result2 = prodRepo.createProduct("iPhone 12 Mini", "Apple", "Very Good", "White", "80000");
		Product result3 = prodRepo.createProduct("Xperia X1", "Sony", "Good", "Blue", "35973");

		// Fetching data from database
		Product result4 = prodRepo.viewProduct(1);
		Product result5 = prodRepo.viewProduct(2);

		// Updating Data by ID
		Product result6 = prodRepo.updateProduct(2, "Xperia Z Ultra", "Sony", "Fair", "Black", "45688");

		// Deleting record by ID
		Product result7 = prodRepo.deleteProduct(1);

		// validation for operations executed
		if (result1 != null && result2 != null && result3 != null) {
			System.out.println("---- Data Inserted Successfully..!!");
		} else if (result4 != null && result5 != null) {
			System.out.println("---- Data Fetched Successfully..!!");
		} else if (result6 != null) {
			System.out.println("---- Data Updated Successfully..!!");
		} else if (result7 != null) {
			System.out.println("---- Data Deleted Successfully..!!");
		} else {
			System.out.println("**** Operation Failed");
		}

		System.out.println("-----------  All Operation Completed  ----------------");
	}

}

//		Product p = new Product();
//		p.setName("iPhone");
//		p.setBrand("Apple");
//		p.setDescription("Excellent");
//		p.setColour("Space Grey");
//		p.setCost("80000");

//ProductRepo prodRepo1 = new ProductRepo();
//ProductRepo prodRepo2 = new ProductRepo();

//Product record1 = new Product("iPhone 6S", "Apple", "Excellent", "Space Grey", "45000");
//record1.setName("iPhone 6S");
//record1.setBrand("Apple");
//record1.setDescription("Excellent");
//record1.setColour("Space Grey");
//record1.setCost("45000");

//Product record2 = new Product("iPhone 12 Mini", "Apple", "Very Good", "White", "80000");
//record1.setName("iPhone 12 Mini");
//record1.setBrand("Apple");
//record1.setDescription("Very Good");
//record1.setColour("White");
//record1.setCost("80000");

//Product result1 = ProductRepo.createProduct(record1);
//Product result2 = ProductRepo.createProduct(record2);