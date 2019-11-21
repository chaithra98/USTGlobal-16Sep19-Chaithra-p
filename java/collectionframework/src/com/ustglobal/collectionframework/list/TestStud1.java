package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStud1 {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		Student1 s1 = new Student1(10, "Raksha", 87.87);
		Student1 s2 = new Student1(20, "Thrupthi", 76.57);
		Student1 s3 = new Student1(30, "Sharukh", 65.87);
		Student1 s4 = new Student1(40, "Samantha", 98.87);
		Student1 s5 = new Student1(50, "Anushka", 67.87);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		/*System.out.println("-----for loop------");
		for(int i=0; i<al.size(); i++)
		{
			Object s = al.get(i);
			System.out.println("Id is : "+s.id);
			System.out.println("Name is : "+s.name);
			System.out.println("Percentage is : "+s.percentage);
		}*/
		
		System.out.println("-------------Foreach--------------");
		for(Object s : al)
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
