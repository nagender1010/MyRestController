package trng.imcs.spring.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.mvc.repository.EmployeeRepository;
import trng.imcs.spring.rest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeDAO;

	@Override
	public Employee addEmployee(Employee e) {
		return employeeDAO.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return employeeDAO.save(e);
	}

	@Override
	public void deleteEmployee(int empId) {
		employeeDAO.delete(empId);
	}

	@Override
	public Employee getEmployee(int empId) {
		return employeeDAO.findOne(empId);

	}

	@Override
	public List<Employee> getAllEmployeesByDeptId(int deptId) {
		return employeeDAO.findByDeptId(deptId);
	}

}
