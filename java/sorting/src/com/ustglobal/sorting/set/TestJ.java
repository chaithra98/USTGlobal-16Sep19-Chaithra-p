package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestJ {
	public static void main(String[] args) {


		HashSet<String> hs = new HashSet<>();
		hs.add("ajay");
		hs.add("vijay");
		hs.add("sujay");
		hs.add("enjoy");
		
		System.out.println("******using foreach loop***********");
		for(Object o : hs)
		{
			System.out.println(o);
		}
		
		System.out.println("*******using iterator***************");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
