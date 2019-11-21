package com.ustglobal.collectionframework.list;

public class Teacher {
	String name;
	String subject;
	double salary;

	public Teacher(String name, String subject, double salary) {
		super();
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", salary=" + salary + "]";
	}





}
