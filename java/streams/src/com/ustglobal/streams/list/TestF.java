package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(38);
		al.add(59);
		al.add(85);
		al.add(60);
		al.add(84);
		al.add(68);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted--------------");
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
	}
}
