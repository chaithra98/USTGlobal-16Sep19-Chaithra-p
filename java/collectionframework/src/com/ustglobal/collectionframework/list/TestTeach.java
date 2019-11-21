package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestTeach {
	public static void main(String[] args) {
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher s1 = new Teacher("Raksha","Kannada", 87000.87);
		Teacher s2 = new Teacher("Thrupthi","hindi", 57000.57);
		Teacher s3 = new Teacher("Sharukh","engish", 67000.87);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		System.out.println("-----for loop------");
		for(int i=0; i<al.size(); i++)
		{
			Teacher s = al.get(i);
			System.out.println("Name is : "+s.name);
			System.out.println("Subject is : "+s.subject);
			System.out.println("Salary is : "+s.salary);
		}

		System.out.println("-------------Foreach--------------");
		for(Teacher s : al)
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
