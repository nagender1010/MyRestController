package trng.imcs.spring.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import trng.imcs.spring.mvc.dao.DepartmentDAO;
import trng.imcs.spring.mvc.dao.EmployeeDAO;
import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.rest.service.DepartmentService;
import trng.imcs.spring.rest.service.EmployeeService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO departmentDao;
	
	@Override
	public Department getDepartment(int deptId) {
		return departmentDao.getDepartment(deptId);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}

}
