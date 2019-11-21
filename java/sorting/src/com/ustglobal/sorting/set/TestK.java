package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestK {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);
		
		System.out.println("******using foreach loop***********");
		for(Object o : ls)
		{
			System.out.println(o);
		}
		
		System.out.println("*******using iterator***************");
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
