package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product getProduct(long id);

	List<Product> getProductList();

	Product updateProductId(Product product, long id);

	List<Product> findProductName(String proName);

	void deleteProduct(long id);

	void deleteAllProduct();

}
