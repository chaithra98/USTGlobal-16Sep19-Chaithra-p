package com.ustglobal.hasarelation.weak;

public class TestA 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.sleep();
		p.eat();
		System.out.println(p.name);
		System.out.println("=============");
		System.out.println(p.m.color);
		System.out.println(p.m.size);
		p.m.write();
	}
}
