package com.ustglobal.beanobject.bean;

public class DatabaseEmp
{
	public void display(Employee e)
	{
		System.out.println("ID is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Department name is "+e.getDepartment());
		System.out.println("Designation is "+e.getDesignation());
	}
}
