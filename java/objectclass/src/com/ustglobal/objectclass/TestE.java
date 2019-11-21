package com.ustglobal.objectclass;

public class TestE 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(10,"soap", "hckd", 14, "hndk");
		Product p2 = new Product(20,"paste", "hjel", 15, "hndk");
		Product p3 = new Product(10,"soap", "hckd", 14, "hndk");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
