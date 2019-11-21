package com.ustglobal.wrapperclasses;

public class TestA 
{
	protected class TestB
	{
		
	}
	
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;	//Auto-boxing, implicit
		System.out.println("i is "+i);
		System.out.println("=================");
		Integer x = 10;	// auto un-boxing, implicit
		Integer z  = new Integer(20);
		//System.out.println(z);
		System.out.println("x is "+x);
		int y = x;
		System.out.println("y is "+y);
		
		System.out.println("=============");
		int value = Integer.parseInt("123abc");	// if we pass this as a input 123abc then we get a exception- java.lang.NumberFormatException
		System.out.println("y is "+value);
		
		boolean result = Boolean.parseBoolean("true"); // here if we give otherthan 
		System.out.println("Result is "+result);
	}
}
