package trng.imcs.spring.rest.service;

import java.util.List;

import trng.imcs.spring.mvc.model.Department;

public interface DepartmentService {
	
	public Department getDepartment(int empId);

	public List<Department> getAllDepartments();

}
