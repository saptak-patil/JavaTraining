package com.demo.dao;

import com.demo.entity.Product;

public interface ProductDao {

	Product createProduct(Product product);

	Product updateProduct(Product product);

	Product deleteProduct(long id);

	Product viewProduct(long id);

}
