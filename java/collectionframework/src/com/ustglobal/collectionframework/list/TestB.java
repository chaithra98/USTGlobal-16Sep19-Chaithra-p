package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB
{
	public static void main(String[] args) 
	{
		ArrayList al=  new ArrayList();
		al.add(10);
		al.add(163.74);
		al.add(true);
		al.add("Spandana");
		
		for(Object o : al)
		{
			System.out.println(o);
		}
		
		System.out.println("==============");
		Iterator i= al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
