package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	
public static void main(String[] args) {
	
	HashSet hs = new HashSet<>();
	
	hs.add(12);
	hs.add(45);
	hs.add("deepa");
	hs.add(84.5);
	hs.add(12);
	hs.add(null);
	hs.add(null);
	
	System.out.println("********** using foreach***********");
	for(Object obj : hs)
	{
		System.out.println(obj);
	}
	
	System.out.println("********** using iterator***********");
	Iterator i = hs.iterator();
	while(i.hasNext())
	{
		Object o = i.next();
		System.out.println(o);
	}
}

}
