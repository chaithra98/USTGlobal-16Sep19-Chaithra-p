package com.ustglobal.typecasting.primitive;

public class TestA 
{
	public static void main(String[] args)
	{
		byte a =19;
		int b = a;	//Implicit casting
		System.out.println("b is "+b);
		int p =20;
		double q=p;
		System.out.println("q is "+q);
		System.out.println("*****************");
		
		double s = 83.73;	// explicit type casting
		int i = (int) s;
		System.out.println("i is "+i);
		byte m = (byte) s;
		System.out.println("m is "+m);
		char c = (char) m;
		System.out.println("c is "+c);
	}
}
