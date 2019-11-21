package com.ustglobal.beanobject.bean;

public class TestA
{
	public static void main(String[] args) 
	{
	Student s = new Student();
	s.setId(46);
	s.setName("Chaithra");
	s.setRollNo(809);
	
	Database db = new Database();
	db.recieve(s);
	
	
	}
}
