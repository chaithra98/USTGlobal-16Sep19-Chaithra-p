package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();	
		a.add(12);
		a.add("Sneha");
		a.add(39.5);
		a.add(null);
		a.add(true);
		a.add('A');
		
		Object o = a.get(3);
		System.out.println(o);
		System.out.println("==============");
		
		for(int i=0; i<=5; i++)
		{
			Object obj = a.get(i);
			System.out.println(obj);
		}
		System.out.println("======================");
		
		for(Object i : a)
		{
			System.out.println(i);
			
		}
	}
}
