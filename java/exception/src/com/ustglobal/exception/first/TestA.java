package com.ustglobal.exception.first;

public class TestA 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");	

		int a[] = {10,20,30};

		System.out.println(a[1]);
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
			//System.out.println("Index not present");
		}
		
		System.out.println("Main ended");
	}
}
