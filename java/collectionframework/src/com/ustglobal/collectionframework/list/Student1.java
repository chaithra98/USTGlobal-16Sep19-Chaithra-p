package com.ustglobal.collectionframework.list;

public class Student1 {
	int id;
	String name;
	double percentage;
	
	public Student1(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
