package trng.imcs.spring.rest.service;

import java.util.List;

import trng.imcs.spring.mvc.model.Employee;

public interface EmployeeService {

	public int addEmployee(Employee e);

	public int updateEmployee(Employee e);

	public int deleteEmployee(int empId);

	public Employee getEmployee(int empId);

	public List<Employee> getAllEmployeesByDeptId(int deptId);

}
