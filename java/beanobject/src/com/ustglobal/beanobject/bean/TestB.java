package com.ustglobal.beanobject.bean;

public class TestB
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setId(1);
		e.setName("Chaithra");
		e.setSalary(57328.00);
		e.setDesignation("Software Engineer");
		e.setDepartment("Development");
		
		DatabaseEmp db = new DatabaseEmp();
		db.display(e);
	}
}
