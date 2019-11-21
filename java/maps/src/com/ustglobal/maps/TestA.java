package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
public static void main(String[] args) {

	HashMap hm = new HashMap();
	
	hm.put("sunitha", 628290);
	hm.put("pooja", 929276);
	hm.put("akshatha", 938273);
	hm.put("chaithra", 839274);
	hm.put(null,647383);
	hm.put(null,647384);
	
	System.out.println("Data "+hm);

	hm.put("pooja", 827465);
	System.out.println("After modifying the key  "+hm);
	
	hm.put("swetha", 839274);
	System.out.println("After modifying the value "+hm);
	
	System.out.println("After null "+hm);
	System.out.println("=========================");
	System.out.println("After adding duplicate null");
	System.out.println(hm);
	System.out.println("=========================");
	
	Object phno = hm.get("chaithra");
	System.out.println("Value "+phno);
	
	System.out.println("========================");
	Object ph_no = hm.get("she");
	System.out.println("Value "+ph_no);
	
	System.out.println("==============================");
	Object value = hm.remove("sunitha");
	System.out.println("Value "+value);
	System.out.println("After remove--------------->");
	System.out.println(hm);
}
}
