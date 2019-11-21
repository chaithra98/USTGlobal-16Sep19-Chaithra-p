package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<>();
		
		Marker m1 = new Marker(30, "blue");
		Marker m2 = new Marker(20, "red");
		Marker m3 = new Marker(50, "green");
		Marker m4 = new Marker(10,"black");

		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		System.out.println("Before sorting----------->");
		display(al);
//		Collections.sort(al);
//		System.out.println("After sorting---------------->");

		SortByCost sb = new SortByCost();
		Collections.sort(al,sb);
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		System.out.println("After sorting-------------->");
		display(al);
	}

	private static void display(ArrayList<Marker> al1) {
		Iterator<Marker> i = al1.iterator();
		while(i.hasNext())
		{
			Marker m = i.next();
			System.out.println("Marker cost is "+m.cost);
			System.out.println("Marker color is "+m.color);
			System.out.println("****************");
		}
	}
}
