package com.angular.angular.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee 
{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
	  private int id;
	  
	  
	  @Column(name="Name")
	  private String name;
	  
	  @Column(name="Email")
	  private String email;
	  
	  @Column(name="Salary")
	  private String salary;
	  
	  @Column(name="Mobile")
	  private String mobile;
	  
	  @Column(name="Password")
	  private String password;
	  
	  
	  

	public Employee() 
	{
		super();
	}




	public Employee(int id, String name, String email, String salary, String mobile, String password) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.password = password;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getSalary() {
		return salary;
	}




	public void setSalary(String salary) {
		this.salary = salary;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", mobile="
				+ mobile + ", password=" + password + "]";
	}

}
