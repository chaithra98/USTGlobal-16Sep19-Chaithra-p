package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<>();
		l.add(21);
		l.add(53);
		l.add(72);
		l.add(73);

		Integer peekElement = l.peek();
		System.out.println("Peek element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element "+peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Element "+peekLastElement);
		System.out.println("After Peek -------->  "+l);

		System.out.println("**********************************");

		Integer pollElement = l.poll();
		System.out.println("Poll element "+peekElement);
		Integer poolFirstElement = l.pollFirst();
		System.out.println("Pool First Element "+poolFirstElement);
		Integer poolLastElement = l.pollLast();
		System.out.println("Pool Last Element "+poolLastElement);
		System.out.println("After Pool -------->  "+l);

		System.out.println("************************************");
		
		l.push(12);
		System.out.println("After push-------->  "+l);
		Integer p = l.pop();
		System.out.println("Popped element is: "+p);
		System.out.println("After pop---------->  "+l);
	}
}
