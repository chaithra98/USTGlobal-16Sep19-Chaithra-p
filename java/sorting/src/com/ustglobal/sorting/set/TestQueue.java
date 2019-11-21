package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(33);
		pq.add(93);
		pq.add(73);
		
		System.out.println(pq);	//Sorting order
		System.out.println("******using iterator*********");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);
	}

}
