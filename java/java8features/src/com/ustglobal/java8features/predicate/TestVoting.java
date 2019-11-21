package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestVoting {
	public static void main(String[] args) {

		Predicate<Voting> p = v -> {
			if(v.age>17) {
				return true;
			} else {
				return false;
			}                                                                                
		};
		
		Voting v = new Voting(20, "Swetha");
		boolean res = p.test(v);
		System.out.println("Able to vote?"+res);
	}
}
