package com.ustglobal.exception.first;

public class TestC 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		int a = 10;
		int b = 0;
		int[] p = {10,20,30,40};
		System.out.println(p[2]);

		try
		{
		
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("number is divided by zero");
		}
		try
		{
			System.out.println(p[6]);

		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array index not present");
		}
			
		System.out.println("Main ended");
	}
}
