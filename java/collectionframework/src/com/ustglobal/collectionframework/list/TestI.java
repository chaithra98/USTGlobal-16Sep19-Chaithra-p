package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		Stack li = new Stack();
		li.add(16);
		li.add(34.7);
		li.add("more");
		li.add(true);
		li.add(null);

		System.out.println("----------For loop----------");
		for(int i=0; i<li.size();i++)
		{
			System.out.println(li.get(i));
		}

		System.out.println("----------Foreach loop----------");

		for(Object o : li)
		{
			System.out.println(o);
		}

		System.out.println("----------Iterator----------");

		Iterator<Object> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("---------List iterator----------");
		ListIterator<Object> o = li.listIterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}

		System.out.println("----------List iterator backward----------");
		while(o.hasPrevious())
		{
			System.out.println(o.previous());
		}
	}
}
