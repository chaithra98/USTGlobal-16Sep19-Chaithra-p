package com.ustglobal.maps;

import java.util.Hashtable;

public class TestF {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(208, "sonu");
		ht.put(79, "monu");
		ht.put(99, "sriram");
//		ht.put(null, "sriram");	NullPointerException
//		ht.put(108, null);	NullPointerException


		System.out.println("Data is "+ht);
	}
}
