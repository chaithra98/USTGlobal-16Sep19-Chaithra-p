package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {
	public static void main(String[] args) {
		ArrayList<Pen> ap = new ArrayList<>();
		Pen p1 = new Pen(10, "Cello");
		Pen p2 = new Pen(5, "reynolds");
		Pen p3 = new Pen(30, "fusion");

		ap.add(p1);
		ap.add(p2);
		ap.add(p3);

		System.out.println("Before Sorting ------------------->");
		displayPenDetails(ap);
		Collections.sort(ap);
		System.out.println("After Sorting ------------------->");
		displayPenDetails(ap);

	}

	 static void displayPenDetails(ArrayList<Pen> ap1) {
		Iterator<Pen> i = ap1.iterator();
		while(i.hasNext())
		{
			Pen p = i.next();
			System.out.println("Pen name is "+p.brand);
			System.out.println("Pen price is "+p.price);
			System.out.println("**********************");
		}
	}
}
