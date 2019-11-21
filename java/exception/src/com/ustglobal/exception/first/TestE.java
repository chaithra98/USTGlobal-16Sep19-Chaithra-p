package com.ustglobal.exception.first;

public class TestE 
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
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Exception occured");
		}
		
		System.out.println("Main ended");
	}
}
