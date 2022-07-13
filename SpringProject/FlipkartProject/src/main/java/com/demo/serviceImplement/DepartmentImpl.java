package com.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepo;
import com.demo.service.DepartmentService;

/**
 * @author SaptakPatil
 *
 */
@Service
public class DepartmentImpl implements DepartmentService {

	// dependency injection
	@Autowired
	DepartmentRepo deptRepo;

	@Override
	public Department createDepartment(Department department) {
//		returns dept
		return deptRepo.save(department);
	}

	@Override
	public Department getDepartment(long id) {
		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getDepartmentList() {
		return deptRepo.findAll();
	}

	@Override
	public Department updateDepartmentId(Department department, long id) {
		// creating dept object to set its properties
		Department d = deptRepo.findById(id).get();
		d.setDeptName(department.getDeptName());
		d.setDeptDetails(department.getDeptDetails());
		d.setDeptEmail(department.getDeptEmail());
		d.setProducts(department.getProducts());
		deptRepo.save(d);
		return d;
	}

	@Override
	public List<Department> findDepartmentsName(String deptName) {
		List<Department> dept = deptRepo.findByDeptName(deptName);
		return dept;
	}

	@Override
	public void deleteDepartment(long id) {
		deptRepo.deleteById(id);
	}

	@Override
	public void deleteAllDepartment() {
//		call for deleting all dept from database
		deptRepo.deleteAll();
	}

}
