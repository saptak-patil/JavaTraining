package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.demo.entity.Department;
import com.demo.exception.DepartmentNotFoundException;
import com.demo.service.DepartmentService;

/**
 * @author SaptakPatil
 *
 */
@RestController
@RequestMapping(value = "department")
public class DepartmentController {

	@Autowired
	DepartmentService deptServiceObj;
	
	// to add department with any no of products in any list form
	@PostMapping(value = "/addDepartment")
	ResponseEntity<Department> addDepartment(@RequestBody @Valid Department department) {
			Department dept = deptServiceObj.createDepartment(department);
			return new ResponseEntity<Department>(dept, HttpStatus.ACCEPTED);
	}
	
	// to get any department by its id
	@GetMapping(value = "/getDepartment/{id}")
	Department getDepartment(@PathVariable long id) throws DepartmentNotFoundException {
			Department dept = deptServiceObj.getDepartment(id);
			return dept;
	}
	
	// to get list of departments in database
	@GetMapping(value="/getDepartmentList")
	List<Department> getDepartmentList(){
		List<Department> deptlist = deptServiceObj.getDepartmentList();
		return deptlist;

	}
	
	// to update department by its id
	@PutMapping(value="/updateDepartmentId/{id}") 
	public String updateDepartmentId(@RequestBody Department department, @PathVariable long id) {
		deptServiceObj.updateDepartmentId(department, id);
		String update = "Department Updated sucessfully by ID..!!"; 
		return update;
	}
	
	// to find departments by its name
	@GetMapping(value="/findDepartmentsName/{name}") 
	List<Department> findDepartmentsName(@PathVariable String name) {
		List<Department> dept = deptServiceObj.findDepartmentsName(name);
		return dept;
	}
	
	// delete department by its id
	@DeleteMapping(value="/deleteDepartment/{id}") 
	public String deleteDepartment( @PathVariable long id) {
		deptServiceObj.deleteDepartment(id);
		String del = "Department Deleted by ID..!!";
		return del;
	}
	
	// delete all departments available in database
	@DeleteMapping(value="/deleteAllDepartment") 
	public String deleteAllDepartment(@RequestBody Department department) {
		deptServiceObj.deleteAllDepartment();
		String del = "All Department Deleted..!!";
		return del;
	}
}
