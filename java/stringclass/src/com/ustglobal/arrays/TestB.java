package com.ustglobal.arrays;

public class TestB 
{
	public static void main(String[] args)
	{
		int[] nums = {10,20,30,40,50};
//		System.out.println(nums[10]); //ArrayIndexOutOfBoundException
		
		receive(nums);
		System.out.println("===================");
		int[] values = getArray();
		
		for(int val: values)
		{
			System.out.println(val);
		}
		
		String[] s = {"abc","xyz"};
		receive(s);
		
		for(String val: s)
		{
			System.out.println(val);
		}
		
	}
	
	
	static void receive(int[] numbers)
	{
		for(int num:numbers)
		{
			System.out.println(num);
		}
	}
	static int[] getArray() 
	{
		int[] values = {20,30,40,50};
		return values;
	}
	
	static void receive(String[] s)
	{
		for(String str:s)
		{
			System.out.println(str);
		}
	}
	
	static String[] getArray1() 
	{
		String[] value = {"abc","xyz"};
		return value;
	}
	
	
	
	
}
