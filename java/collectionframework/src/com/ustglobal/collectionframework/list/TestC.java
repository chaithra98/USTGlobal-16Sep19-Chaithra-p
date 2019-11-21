package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(67.28);
		al.add(true);
		al.add("Evening");

		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println(o1);

		Object o2 = it.next();
		System.out.println(o2);

		Object o3 = it.next();
		System.out.println(o3);

		Object o4 = it.next();
		System.out.println(o4);

		/*boolean b = it.hasNext();
		System.out.println(b);	// NoSuchElementException
		 */


		/*Object o5 = it.next();
		System.out.println(o5);*/
		System.out.println("================");
		for(int i=0;i<al.size(); i++)
		{
			Object o = al.get(i);
			System.out.println(o);
		}


		ArrayList al1 =new ArrayList();
		al1.add(62);
		al1.add(false);
		al1.add(62.56);


		System.out.println("===using iterator");

		Iterator it1 = al1.iterator();


		/*while(it1.hasNext())
		{
			Object o = it1.next();
			System.out.println(o);
		}*/


		System.out.println("==== for loop ========");
		for(;it1.hasNext();)
		{
			Object obj = it1.next();
			System.out.println(obj);
		}
	}
}
