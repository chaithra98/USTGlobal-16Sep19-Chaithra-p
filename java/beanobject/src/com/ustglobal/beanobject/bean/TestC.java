package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC
{
	public static void main(String[] args)
	{
		System.out.println( "Scanner class");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Name is "+name);
	
		
		System.out.println("Are you male");
		boolean b = s.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter your address");
		Scanner sc  = new Scanner(System.in);
		String g = sc.nextLine();
		System.out.println(g);
		
		s.close();
		sc.close();
	}
}
