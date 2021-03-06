package com.ustglobal.exception.customizeduncheckedexception;

import java.util.Arrays;

public class InvalidAgeException extends RuntimeException
{
	String message = "Invalid age below 18 years not allowed";

	public InvalidAgeException()
	{
	}

	public InvalidAgeException(String message)
	{
		this.message = message;
	}
	
//	@Override
//	public String toString()
//	{
//		return message;
//	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
