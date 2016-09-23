package com.sample.springBoot.SpringBootProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	 @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }

	  @RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	  public String getEmployees() {
		  List<Employee> empList = null;
		 String userId = "";	
		    try {
		      
		      empList= (List<Employee>) employeeDAO.findAll();
		      for (Employee emp:empList)
		      System.out.println("Emp ID :"+emp.getEmp_id()+ " Employee Name :"+emp.getEmp_name()  );
		    }
		    catch (Exception ex) {
		      return "Error creating the user: " + ex.toString();
		    }
		    return empList.toString();
		  
	}
	
	    public static void main(String[] args) throws Exception {
	    	SpringApplication springApplication = new SpringApplication();
	    	 ApplicationContext ctx = springApplication.run(App.class, args);
	    }
}
