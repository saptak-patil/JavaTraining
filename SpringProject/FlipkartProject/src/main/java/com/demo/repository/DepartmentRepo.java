package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Department;

/**
 * @author SaptakPatil
 *
 */
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	@Query(value = "SELECT * FROM Department WHERE deptName=:deptname", nativeQuery = true) 
	List<Department> findByDeptName(@Param("deptname") String deptname);

	// jpa query annotation
//	@Query(value = "SELECT * FROM department WHERE deptname=?1", nativeQuery=true) 
//	List<Department> getDeptName(String deptName);
	
}
