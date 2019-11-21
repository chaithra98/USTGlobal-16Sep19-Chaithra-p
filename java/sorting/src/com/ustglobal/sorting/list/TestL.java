package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	
	LinkedList<Integer> l = new LinkedList<>();
	l.add(52);
	l.add(674);
	l.add(62);
	l.add(45);
	l.add(5);
//	l.add(null); here we can't pass null values
	
	System.out.println(l);
	
	Collections.sort(l);
	System.out.println("after sort "+l);
	
	Collections.reverse(l);
	System.out.println("After reverse "+l);
	
	Collections.shuffle(l);
	System.out.println("After Shuffle "+l);
	
}
}
