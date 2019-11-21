package com.ustglobal.thread.defining;

public class MyThread extends Thread {

	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println("Child thread");
		}
	}
}
