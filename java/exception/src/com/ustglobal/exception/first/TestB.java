package com.ustglobal.exception.first;

public class TestB 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		int a = 10;
		int b = 0;
		int[] p = {10,20,30,40};
		
		try
		{
			System.out.println(p[2]);
		
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("number is divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array index not present");
		}
			
		System.out.println("Main ended");
	}
}
