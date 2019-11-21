package com.ustglobal.studentapp.qspiders;

//import static com.ustglobal.studentapp.jspiders.Remote.num;
//import static com.ustglobal.studentapp.jspiders.Remote.num;

import static com.ustglobal.studentapp.jspiders.Remote.*; // here we need to provide static and * for accessing only static properties

import com.ustglobal.studentapp.jspiders.*;

public class TestB 
{
	public static void main(String[] args) 
	{
		
		on();
		Remote.off();
		System.out.println(Remote.num);
		
		Remote r = new Remote();
		System.out.println(r.sum);
	}
}
