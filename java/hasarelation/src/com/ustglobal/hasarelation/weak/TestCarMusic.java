package com.ustglobal.hasarelation.weak;

public class TestCarMusic 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		System.out.println(c.name);
		c.move();
		System.out.println(c.m.songNames);
		c.m.off();
		c.m.on();
	}
}
