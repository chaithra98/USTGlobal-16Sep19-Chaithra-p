package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(2, "divya",67.76);
		Student s2 = new Student(3, "kavya",62.26);
		Student s3 = new Student(1, "bhavya",82.62);
		Student s4 = new Student(4, "kiran",63.82);
		Student s5 = new Student(7, "dinesh",72.84);
		Student s6 = new Student(6, "ambika",83.72);
		Student s7 = new Student(5, "giri",92.63);
		Student s8 = new Student(10, "chinnu",83.63);
		Student s9 = new Student(9, "sonu",56.73);
		Student s10 = new Student(8, "dimple",58.28);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		al2.add(s10);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> a = hm.get("second");
		
		Iterator<Student> it = a.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("============================");
		}
		
	}
}
