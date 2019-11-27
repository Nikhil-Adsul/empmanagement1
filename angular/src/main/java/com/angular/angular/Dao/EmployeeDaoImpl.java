package com.angular.angular.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.angular.angular.Entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
private EntityManager entitymanager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager theentitymanager) 
	{
		this.entitymanager=theentitymanager;
	}
	
	@Override
	public List<Employee> getall() 
	{
		org.hibernate.Session currentsession=entitymanager.unwrap(org.hibernate.Session.class);
		Query<Employee> query=currentsession.createQuery("from Employee" , Employee.class);
		
		List<Employee> employee=query.getResultList();
		return employee;
	}

	@Override
	public Employee findbyID(int id) 
	{
		Session currentsession=entitymanager.unwrap(Session.class);
		Employee employee=currentsession.get(Employee.class, id);
		
		
		return employee;
	}

	@Override
	@Transactional(noRollbackFor = Exception.class)
	public void save(Employee employee) 
	{
		Session currentsession=entitymanager.unwrap(Session.class);
		currentsession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) 
	{
		Session currentsession=entitymanager.unwrap(Session.class);
        Query query=currentsession.createQuery("delete from Employee where id=:employeeID");
        query.setParameter("employeeID",id);
        query.executeUpdate();
		
	}

}
