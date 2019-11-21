package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {
	public static void main(String[] args) {

		TreeSet<Customer> ts = new TreeSet<Customer>();

		Customer c1 = new Customer(10, "Aishwarya", 83000);
		Customer c2 = new Customer(20, "Samantha", 87000);
		Customer c3 = new Customer(60, "Anushka", 98000);
		Customer c4 = new Customer(40, "Aashitha", 74000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);

		System.out.println("*********Using iterator*************");

		Iterator<Customer> i = ts.iterator();
		while(i.hasNext())
		{
			Customer c = i.next();
			System.out.println("ID is "+c.id);
			System.out.println("Name is "+c.name);
			System.out.println("Salary is "+c.salary);
			System.out.println("=================================");
		}

	}
}
