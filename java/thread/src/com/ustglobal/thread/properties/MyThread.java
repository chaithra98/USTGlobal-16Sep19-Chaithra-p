package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {

		System.out.println("Main stearted");
		
		String tname = Thread.currentThread().getName();
		System.out.println("Current thread name: "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("MyThread name is "+mname);
		
		Thread.currentThread().setName("Bala");
//		System.out.println("Name is : "+Thread.currentThread().getName());

		t1.setName("Golu");
		System.out.println("My thread name is "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main ended");

	}

}
