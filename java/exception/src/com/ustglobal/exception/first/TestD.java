package com.ustglobal.exception.first;

public class TestD 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		String s = "hello";
		int[] a = {10,20,30,40};
		int b = 10;
		
		try
		{
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(NullPointerException npe) 
		{
			System.out.println("don't play with null");
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array index not present");
		}
		catch(ArithmeticException e)
		{
			System.out.println("number is divided by zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
	}
}
