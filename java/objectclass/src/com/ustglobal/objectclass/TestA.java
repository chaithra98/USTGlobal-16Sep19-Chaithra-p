package com.ustglobal.objectclass;

public class TestA
{
	public static void main(String[] args) 
	{
		Student s1 =  new Student(10, "rama", 52.22); 
		
		int h = s1.hashCode();
		System.out.println(h);
		
		s1.printDetails();
		
		System.out.println(s1);
	}
}