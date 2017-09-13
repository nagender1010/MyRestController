package trng.imcs.spring.rest.service;

import java.util.List;

import trng.imcs.spring.mvc.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee e);

	public Employee updateEmployee(Employee e);

	public void deleteEmployee(int empId);

	public Employee getEmployee(int empId);

	public List<Employee> getAllEmployeesByDeptId(int deptId);

}
