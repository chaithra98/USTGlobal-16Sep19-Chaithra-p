package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(70);
		al.add(80);
		al.add(12);

		List<Integer> l = al.stream().map(i -> i * 2).collect(Collectors.toList());

		for(Integer i : l) {
			System.out.println(i);
		}
	}
}
