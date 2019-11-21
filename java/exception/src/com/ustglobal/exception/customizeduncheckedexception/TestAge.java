package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		Validator v = new Validator();
		
		try
		{
		v.verify(16);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
			System.out.println("Error occured");
		}
		
		v.verify(13);
		System.out.println("Main ended");
	}
}
