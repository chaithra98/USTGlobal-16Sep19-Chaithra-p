package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestB {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("deepika");
		ts.add("sneha");
	
		

		System.out.println("-------------Forecah-------------");
		for(String i : ts)
		{
			System.out.println(i);
		}

		System.out.println("-------------Iterator-------------");
		Iterator<String> o = ts.iterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
	}

}
