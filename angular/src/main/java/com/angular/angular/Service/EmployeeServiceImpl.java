package com.angular.angular.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.angular.Dao.EmployeeDao;
import com.angular.angular.Entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmpService
{

private EmployeeDao employeedao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao theemployeedao)
	{
		this.employeedao=theemployeedao;
	}
	
	@Override
	@Transactional
	public List<Employee> getall() 
	{
		
		return employeedao.getall();
	}

	@Override
	@Transactional
	public Employee findbyID(int id)
	{
		
		return employeedao.findbyID(id);
	}

	@Override
	@Transactional(noRollbackFor = Exception.class)
	public void save(Employee employee) 
	{
		employeedao.save(employee);
	}

	@Override
	@Transactional
	public void delete(int id) 
	{
		employeedao.delete(id);
		
	}

}
