package trng.imcs.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import trng.imcs.spring.rest.service.DepartmentService;
import trng.imcs.spring.rest.service.EmployeeService;
import trng.imcs.spring.rest.serviceImpl.DepartmentServiceImpl;
import trng.imcs.spring.rest.serviceImpl.EmployeeServiceImpl;

@SpringBootApplication
//@EnableJpaRepositories
public class MyRestControllerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyRestControllerApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyRestControllerApplication.class, args);
		// EmployeeRepository empDAO = context.getBean(EmployeeRepository.class);
//		EmployeeService serv = (EmployeeService) context.getBean(EmployeeServiceImpl.class);
		// List<Employee> empList = Lists.newArrayList(empDAO.findAll());

		/*
		 * //for all employees System.out.println("................................");
		 * Iterable<Employee> itr = empDAO.findAll(); for (Employee employee : itr) {
		 * System.out.println(employee); }
		 */
		/*
		 * java.util.Date d = new java.util.Date(); Date sqlDate = new
		 * Date(d.getTime()); Employee employee = new Employee("hars", "har", "1256",
		 * 43, sqlDate, sqlDate, 3, 1234, 2);
		 */
		// System.out.println(empDAO.findByDeptId(1));
		// System.out.println(serv.addEmployee(employee));
		// empDAO.delete(3);

		/*
		 * Iterable<Department> itr = deptDAO.findAll(); for (Department dept : itr) {
		 * System.out.println(dept); }
		 */

		// System.out.println(deptDAO.findOne(1));

		// System.out.println(deptDAO.delete(4));
		// System.out.println(serv.getEmployee(1));
		// serv.deleteEmployee(3);
//		System.out.println(serv.getEmployee(1));
//		System.out.println(serv.getAllEmployeesByDeptId(1));
		DepartmentService serv = (DepartmentService) context.getBean(DepartmentServiceImpl.class);
		System.out.println(serv.getAllDepartments());
		System.out.println(serv.getDepartment(1));

	}
}
