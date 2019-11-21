package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;


public class TestBank {
	public static void main(String[] args) {
		
		SortbyName sb = new SortbyName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		Bank b1 = new Bank("HDFC", 560068, 676889);
		Bank b2 = new Bank("SBI", 560071, 989889);
		Bank b3 = new Bank("CITI", 560054, 836388);
		Bank b4 = new Bank("CANARA", 560076, 736288);
		Bank b5 = new Bank("CANARA", 560076, 736288);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("*****using iterator************");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext())
		{
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("===========================");
		}
	}
}
