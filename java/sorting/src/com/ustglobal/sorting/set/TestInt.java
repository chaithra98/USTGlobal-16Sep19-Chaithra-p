package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestInt {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.add(34);
		ls.add(62);
		ls.add(89);
		ls.add(34);
		ls.add(72);
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
