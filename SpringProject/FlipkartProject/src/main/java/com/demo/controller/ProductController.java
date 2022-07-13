package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.exception.ProductNotFoundException;
import com.demo.service.ProductService;

/**
 * @author SaptakPatil
 *
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {
	ProductService productServiceObj;

	// to add new product
	@PostMapping(value = "/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody @Valid Product product) {
		Product p = productServiceObj.createProduct(product);
		return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
	}

	// to get product by id from product
	@GetMapping(value = "/getProduct/{id}")
	public Product getProduct(@PathVariable long id) throws ProductNotFoundException {
		Product p = productServiceObj.getProduct(id);
		return p;
	}

	// to get all list of product from product
	@GetMapping(value = "/getProductList")
	List<Product> getProductList() {
		List<Product> prodList = productServiceObj.getProductList();
		return prodList;
	}

	// to update product by its id
	@PutMapping(value = "/updateProductId/{id}")
	public String updateProductId(@RequestBody Product product, long id) {
		productServiceObj.updateProductId(product, id);
		String update = "Product updated sucessfully by Id..!!";
		return update;
	}
	
	// find product by its name
	@GetMapping(value="/findProductName/{name}") 
	List<Product> findProductName(@PathVariable String name) {
		List<Product> prod = productServiceObj.findProductName(name);
		return prod;
	}
	
	// delete product by its id
	@DeleteMapping(value="/deleteProduct/{id}") 
	public String deleteProduct( @PathVariable long id) {

		productServiceObj.deleteProduct(id);
		String del = "Product deleted by Id..!!";
		return del;
	}
	
	// delete all products
		@DeleteMapping(value="/deleteProduct/{id}") 
		public String deleteAllProduct( @RequestBody Product product) {

			productServiceObj.deleteAllProduct();
			String del = "All Product deleted..!!";
			return del;
		}
}




/*
 * @GetMapping(value="/getProduct{name}") Product findProduct(@PathVariable
 * String name) { Product prod = productServiceObj.findProductName(name); return
 * prod; }
 */