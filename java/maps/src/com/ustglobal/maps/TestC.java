package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		lh.put("bangalore", 560068);
		lh.put("hariyana", 134203);
		lh.put("patna", 880000);
//		lh.put(null, 729178);	null values are allowed
//		lh.put(null, 729179); 
//		if we have a same key name twice then the value is replaced with new value
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		
		for(String key : s)
		{
			System.out.println("key "+key);
		}
		
		System.out.println("===============================");
		Collection<Integer> c = lh.values();
		for(Integer value : c)
		{
			System.out.println("value "+value);
		}
		
	}
}
