package com.demo.service;

import java.util.List;

import com.demo.entity.Department;

public interface DepartmentService {

	Department createDepartment(Department department);

	Department getDepartment(long id);

	List<Department> getDepartmentList();

	Department updateDepartmentId(Department department, long id);

	List<Department> findDepartmentsName(String deptName);

	void deleteDepartment(long id);

	void deleteAllDepartment();
}
