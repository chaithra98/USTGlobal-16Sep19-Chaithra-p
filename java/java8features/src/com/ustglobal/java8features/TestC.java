package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i*i;
		
		int res = f.apply(6);
		System.out.println("Squares of 6 is "+res);
		
		int res1 = f.apply(7);
		System.out.println("Squares of 7 is "+res1);
	}
}
