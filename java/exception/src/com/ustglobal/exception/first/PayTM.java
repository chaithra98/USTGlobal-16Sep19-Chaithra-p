package com.ustglobal.exception.first;

public class PayTM 
{
	public void book()
	{
		System.out.println("PayTM started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("PatTM ended");
	}
}
