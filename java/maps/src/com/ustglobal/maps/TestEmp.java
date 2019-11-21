package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {

		Employee e1 = new Employee(2, "diya", 89000);
		Employee e2 = new Employee(1, "divya", 63000);
		Employee e3 = new Employee(5, "bhavya", 45000);
		Employee e4 = new Employee(3, "akshatha", 46000);
		Employee e5 = new Employee(7, "pooja", 57000);
		Employee e6 = new Employee(8, "megha", 72000);
		Employee e7 = new Employee(9, "siri", 15000);
		Employee e8 = new Employee(4, "bhagya", 10000);
		Employee e9 = new Employee(6, "chaithra", 20000);
		
		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(e1);
		a1.add(e3);
		a1.add(e4);
		
		ArrayList<Employee> a2 = new ArrayList<>();
		a2.add(e5);
		a2.add(e2);
		a2.add(e6);
		
		ArrayList<Employee> a3 = new ArrayList<>();
		a3.add(e9);
		a3.add(e7);
		a3.add(e8);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first",a1);
		hm.put("second",a2);
		hm.put("third",a3);
		
		ArrayList<Employee> ae = hm.get("first");
		
		Iterator<Employee> a = ae.iterator();
		while(a.hasNext())
		{
			Employee e = a.next();
			System.out.println("Name is "+e.name);
			System.out.println("ID is "+e.eid);
			System.out.println("Salary is "+e.salary);
			System.out.println("=================================");
		}
		
	}
}
