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

import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.rest.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/{empId}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getEmployee(@PathVariable int empId) {
		Employee employee = employeeService.getEmployee(empId);
		if (employee == null) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(employee, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping(value = "/dept/{deptId}", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeesBydeptId(@PathVariable int deptId) {
		System.out.println("checking get method ...........");
		List<Employee> empList = employeeService.getAllEmployeesByDeptId(deptId);
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		Employee emp = null;
		try {
			emp = employeeService.addEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (emp != null) {
			return new ResponseEntity<>(emp, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(emp, HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEmployee(@PathVariable int empId) {

		employeeService.deleteEmployee(empId);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.updateEmployee(employee);
		if (emp == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}

}
