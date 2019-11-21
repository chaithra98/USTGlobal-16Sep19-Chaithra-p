package com.ustglobal.objectclass;

public class TestB 
{
	public static void main(String[] args) 
	{
		Car c = new Car(500000, "Audi", "Red");
		int h = c.hashCode();
		System.out.println(h);
		System.out.println(c);
	}
}
