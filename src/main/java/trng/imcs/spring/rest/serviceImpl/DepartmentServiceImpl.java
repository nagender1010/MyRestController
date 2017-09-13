package trng.imcs.spring.rest.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.repository.DepartmentRepository;
import trng.imcs.spring.rest.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentDao;
	
	@Override
	public Department getDepartment(int deptId) {
		return departmentDao.findOne(deptId);
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> deptList = new ArrayList<>();
		Iterable<Department> itr =  departmentDao.findAll();
		for (Department department : itr) {
			deptList.add(department);
		}
		return deptList;
	}

}
