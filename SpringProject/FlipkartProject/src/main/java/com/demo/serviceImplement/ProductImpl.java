package com.demo.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepo;
import com.demo.service.ProductService;

/**
 * @author SaptakPatil
 *
 */
@Service
public class ProductImpl implements ProductService {

	// dependency injection
	@Autowired
	ProductRepo prodRepo;


	@Override
	public Product createProduct(Product product) {
		return prodRepo.save(product);
	}

	@Override
	public Product getProduct(long id) {
		Optional<Product> getProduct = prodRepo.findById(id);
		return getProduct.get();
	}

	@Override
	public List<Product> getProductList() {
		// get list of all products
		List<Product> productList = prodRepo.findAll();
		return productList;
	}

	@Override
	public Product updateProductId(Product product, long id) {
		// To update product by id with its properties
		Product p = prodRepo.findById(id).get();
		p.setProdName(product.getProdName());
		p.setProdPrice(product.getProdPrice());
		p.setProdColour(product.getProdColour());
		p.setProdDept(product.getProdDept());
		p.setProdDescription(product.getProdDescription());
		prodRepo.save(p);
		return p;
	}

	@Override
	public List<Product> findProductName(String proName) {
		List<Product> prod = prodRepo.findByProductName(proName);
		return prod;
	}

	@Override
	public void deleteProduct(long id) {
		// To delete product by id
		prodRepo.deleteById(id);
	}

	@Override
	public void deleteAllProduct() {
		// To delete all products from database
		prodRepo.deleteAll();
	}

}
