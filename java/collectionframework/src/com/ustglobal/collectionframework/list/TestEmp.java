package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee s1 = new Employee(10, "Raksha", 87000.87);
		Employee s2 = new Employee(20, "Thrupthi", 57000.57);
		Employee s3 = new Employee(10, "Sharukh", 67000.87);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		System.out.println("-----for loop------");
		for(int i=0; i<al.size(); i++)
		{
			Employee s = al.get(i);
			System.out.println("Id is : "+s.empid);
			System.out.println("Name is : "+s.name);
			System.out.println("Salary is : "+s.salary);
		}

		System.out.println("-------------Foreach--------------");
		for(Employee s : al)
		{
			System.out.println(s);
		}

		System.out.println("-----iterators------");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
