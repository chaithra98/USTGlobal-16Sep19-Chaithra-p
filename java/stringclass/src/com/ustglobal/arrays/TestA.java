package com.ustglobal.arrays;

public class TestA
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		for(int i=0; i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		System.out.println("=================");
		
		for(int num :numbers)
		{
			System.out.println(num);
		}
		
		System.out.println("=================");

		char[] ch = {'a', 'b','c', 'd'};
		for(int i = 0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("=================");
		
		for(int c:ch)
		{
			System.out.println(c);
		}
		System.out.println("=============");
		boolean[] b = {true,false,true,false,true,false};
		for(int i = 0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("=============");
		for(boolean b1: b)
		{
			System.out.println(b1);
		}
		System.out.println("=============");
		double[] d = {10.5,36.2,27.6,73.6};
		for(int i = 0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("=============");
		for(double j: d)
		{
			System.out.println(j);
		}
		String[] s = {"aishu","kavya","divya","priya"};
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("=============");
		for(String s1: s)
		{
			System.out.println(s1);
		}
		System.out.println("=============");
		System.out.println(s.length);
	}
}
