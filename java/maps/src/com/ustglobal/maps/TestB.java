package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();

		hm.put("kuku", 628290);
		hm.put("mala", 929276);
		hm.put("sheela", 938273);
		
		HashMap hm1 = new HashMap();
		
		hm1.put("deepu", 937282);
		hm1.put("riya", 573829);
		hm1.put("krithi", 836372);
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has key is "+hasKey);
		
		boolean hasValue = hm1.containsValue(839282);
		System.out.println("Has value is "+hasValue);
		
		boolean hasValue1 = hm1.containsValue(836372);
		System.out.println("Has value is "+hasValue1);
		
		hm.putAll(hm1);
		
		System.out.println("=====================================");
		
		System.out.println("After put all "+hm);
	
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("map is empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	}
}
