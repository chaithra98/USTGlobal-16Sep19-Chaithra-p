package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");	

		ValidateAmount va = new ValidateAmount();
		try
		{
			va.checkAmount(50000);
			System.out.println("Withdraw your cash");
		} 
		catch (InvalidAmountException e) 
		{
			System.err.println(e.getMessage());	// err -> It will come in red color
		}

		System.out.println("main ended");
	}
}
