package com.angular.angular.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.angular.angular.Entity.Employee;
import com.angular.angular.Service.EmpService;

@CrossOrigin(origins = "http://localhost:4200")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController 
{
    private EmpService employeeservice;
	
	@Autowired
	public RestController(EmpService theemployeeservice) 
	{
		this.employeeservice=theemployeeservice;
	}
	
	
	@GetMapping("/employees")
	public List<Employee> findall()
	{
		System.out.println("in controller");
		return employeeservice.getall();
		
	}
	
	@GetMapping("/employees/{employeeID}")
	public Employee getbyID(@PathVariable int employeeID)
	{
		Employee employee=employeeservice.findbyID(employeeID);
		
		if( (employeeID >=0 ))
		{
			//throw new StudentNotFoundException("student not found");
		}
		
		return employee;
		
	}
	
	@PostMapping("/employees/")
	public Employee addemployee(@RequestBody Employee theemployee)
	{
		System.out.println("in post");
		theemployee.setId(0);
		employeeservice.save(theemployee);
		
		return theemployee;
	}
	
	@PutMapping("/employees/{employeeID}")
	public Employee updateemployee(@RequestBody Employee employee)
	{
		System.out.println("in put");
		String name=employee.getName();
		
		System.out.println(name);
		employeeservice.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{employeeID}")
	public String delete(@PathVariable int employeeID)
	{
		System.out.println(employeeID);
		employeeservice.delete(employeeID);
		
		return "deleted employee id - " + employeeID;
	}
	

}
