package trng.imcs.spring.rest;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;

import trng.imcs.core.EmpLibraryApplication;
import trng.imcs.spring.mvc.dao.DepartmentDAO;
import trng.imcs.spring.mvc.daoImpl.DepartmentDAOImpl;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.rest.service.DepartmentService;
import trng.imcs.spring.rest.service.EmployeeService;
import trng.imcs.spring.rest.serviceImpl.DepartmentServiceImpl;
import trng.imcs.spring.rest.serviceImpl.EmployeeServiceImpl;

@SpringBootApplication
public class MyRestControllerApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MyRestControllerApplication.class, args);
		/*ApplicationContext context = new AnnotationConfigApplicationContext("trng.imcs.spring.rest");
		DepartmentService dao = (DepartmentServiceImpl) context.getBean(DepartmentServiceImpl.class);*/
		
	}
}
