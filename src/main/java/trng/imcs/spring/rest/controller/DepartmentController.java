package trng.imcs.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.rest.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/{deptId}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getEmployee(@PathVariable int deptId) {
		Department department = departmentService.getDepartment(deptId);
		if (department == null) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(department, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployee() {
		System.out.println("checking get method ...........");
		List<Department> deptList = departmentService.getAllDepartments();
		return new ResponseEntity<List<Department>>(deptList, HttpStatus.OK);
	}

}
