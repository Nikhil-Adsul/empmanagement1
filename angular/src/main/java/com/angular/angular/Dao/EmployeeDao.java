package com.angular.angular.Dao;

import java.util.List;

import com.angular.angular.Entity.Employee;

public interface EmployeeDao 
{
	
	public List<Employee> getall();
	public Employee findbyID(int id);
	public void save(Employee employee);
	public void delete(int id);
	

}
