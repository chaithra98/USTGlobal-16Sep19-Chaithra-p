package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(63.6);
		al.add(54.72);
		al.add(92.74);
		al.add(82.71);
		al.add(54.72);
		al.add(null);
		al.add(null);

		System.out.println(al);
		al.add(2,56.68);
		System.out.println("After add in 2nd index "+al);
		al.remove(0);
		System.out.println("After removing 0th index "+al);
		al.remove(null);
		System.out.println("After removing null "+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index "+val);
		al.set(2, 888.88);
		System.out.println("After replacing 2nd index "+al);
		al.clear();
		System.out.println("After clear method"+al);
		al.contains(64.64);
		
		System.out.println("************************************************");
		
		List<Double> al1 = new ArrayList<>();
		al1.add(62.6);
		al1.add(82.5);
		al1.add(71.6);
		
		al1.addAll(al1);
		System.out.println("After add all "+al1);
		
		boolean res = al1.removeAll(al1);
		System.out.println("Removed all of al1 "+res);
		
		boolean res1 = al1.containsAll(al1);
		System.out.println("It contains the data "+res1);
		
	}
}
