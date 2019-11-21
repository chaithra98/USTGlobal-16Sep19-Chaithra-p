package com.ustglobal.exception.second;

public class TestA 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		try 
		{
			Thread.sleep(2000);
			System.out.println("Inside try block");
		} 
		catch (InterruptedException e)
		{
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
	}
}
