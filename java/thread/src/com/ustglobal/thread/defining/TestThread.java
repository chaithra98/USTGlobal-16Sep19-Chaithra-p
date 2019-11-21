package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("Main started");

		MyThread t1 = new MyThread();
		
		/*
		 * Don't call run() method, it behaves like a normal program
		 *  All code will be executed inside the main thread only
		 */
		
//		t1.run();
		t1.start();
//		t1.start(); 	IllegalThreadStateException

		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
		System.out.println("Main ended");
	}
}
