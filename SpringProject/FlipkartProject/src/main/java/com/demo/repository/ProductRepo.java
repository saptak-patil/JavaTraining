package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Product;

/**
 * @author SaptakPatil
 *
 */
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	//	 query for selecting productname
	//	@Query("SELECT prod FROM Product prod WHERE prod.proname=?")
	
	@Query(value = "SELECT * FROM Product WHERE prodName=:prodname", nativeQuery = true) 
	List<Product> findByProductName(@Param("prodname") String prodname);

	//	Product getProductName(String name);
}
