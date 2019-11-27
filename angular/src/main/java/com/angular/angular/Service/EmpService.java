package com.angular.angular.Service;

import java.util.List;

import com.angular.angular.Entity.Employee;


public interface EmpService 
{

	public List<Employee> getall();
	public Employee findbyID(int id);
	public void save(Employee employee);
	public void delete(int id);
	
}
