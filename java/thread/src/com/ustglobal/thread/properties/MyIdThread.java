package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("Myid thread "+mi.getId());
		
		System.out.println("Priority: "+Thread.currentThread().getPriority()); 
		
//		Thread.currentThread().setPriority(16);	IllegalArgumentException 
//		because we have priority till 10 only
		
		Thread.currentThread().setPriority(9);
		System.out.println("Priority is "+Thread.currentThread().getPriority());
		
		
		
		System.out.println("Main ended");
	}
}
