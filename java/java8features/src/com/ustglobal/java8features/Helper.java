package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=======================");
		}
	}

	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(Student ->Student.percentage<40).collect(Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=======================");
		}
	}

	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(Student ->Student.percentage>40).collect(Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=======================");
		}
	}
	
	Comparator<Student> cmp = (p1,p2) -> {
		if(p1.percentage > p2.percentage) {
			return 10;
		} else if(p1.percentage < p2.percentage) {
			return -10;
		} else {
			return 0;
		}
	};
	
	
	
	void displayTopStudent(ArrayList<Student> al) {
		Student s = al.stream().max(cmp).get();

	
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=======================");
		}
	}
	
	

