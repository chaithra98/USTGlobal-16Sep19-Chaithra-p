package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(5, "vikram", 65.4));
		al.add(new Student(3, "vijay", 35.7));
		al.add(new Student(6, "yash", 84.38));
		al.add(new Student(2, "akshay", 38.4));
		al.add(new Student(1, "aishu", 96.3));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		System.out.println("========================");
//		h.displayFailedStudents(al);
//		System.out.println("========================");
//		h.displayPassedStudents(al);
		System.out.println("========================");
		h.displayTopStudent(al);
		

	}
}
