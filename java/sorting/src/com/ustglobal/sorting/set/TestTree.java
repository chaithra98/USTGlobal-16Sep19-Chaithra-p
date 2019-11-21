package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(64);
		ts.add(84);
		ts.add(69854);
		ts.add(8);
		ts.add(02);
		ts.add(02);
		

		System.out.println("-------------Forecah-------------");
		for(Object i : ts)
		{
			System.out.println(i);
		}

		System.out.println("-------------Iterator-------------");
		Iterator<Object> o = ts.iterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
	}
}
