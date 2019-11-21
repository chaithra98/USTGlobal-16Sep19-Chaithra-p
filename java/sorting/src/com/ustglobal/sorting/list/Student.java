package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
	int id;
	String name;
	Double percentage;
	public Student(int id, String name, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	/*@Override
	public int compareTo(Student s) {
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}*/

	/*@Override
	public int compareTo(Student s) {
		if(this.percentage>s.percentage)
		{
			return 10;
		}
		else if(this.percentage<s.percentage)
		{
			return -10;
		}
		else 
		{
			return 0;
		}
	}*/
	
	/*@Override
	public int compareTo(Student s) 
	{
		String p = this.name.toLowerCase();
		String q = s.name.toLowerCase();
		return p.compareTo(q);
		
	}*/
	
	@Override
	public int compareTo(Student s) {
//		int i = this.id;
//		int j = s.id;	 only rapper classesare allowed
		
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
		
	}
}
