package trng.imcs.spring.rest.serviceImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trng.imcs.spring.mvc.dao.EmployeeDAO;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.rest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public int addEmployee(Employee e) {
		return employeeDAO.addEmployee(e);
	}

	@Override
	public int updateEmployee(Employee e) {
		return employeeDAO.updateEmployee(e);
	}

	@Override
	public int deleteEmployee(int empId) {
		return employeeDAO.deleteEmployee(empId);
	}

	@Override
	public Employee getEmployee(int empId) {
		return employeeDAO.getEmployee(empId);

	}

	@Override
	public List<Employee> getAllEmployeesByDeptId(int deptId) {
		return employeeDAO.getAllEmployeesByDeptId(deptId);
	}

}
