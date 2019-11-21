package com.ustglobal.hasarelation.weak;

public class Person 
{
	String name;
	Marker m = new Marker();

	void sleep()
	{
		System.out.println("sleep method of person");
	}
	void eat() {
		System.out.println("eat method of person");
	}
}
