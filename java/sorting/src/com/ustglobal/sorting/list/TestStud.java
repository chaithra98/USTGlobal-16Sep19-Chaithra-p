package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStud {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		Student s1 = new Student(12,"Kimple",53.72);
		Student s2 = new Student(72,"sweety",74.77);
		Student s3 = new Student(62,"jimmy",83.63);
		Student s4 = new Student(74,"tummy",73.66);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Before Sorting ------");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After Sorting-----------");
		displayStudentDetails(al);
		

	}
	static void displayStudentDetails(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {

			Student s= it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("------------------------------");
		}
	}
}