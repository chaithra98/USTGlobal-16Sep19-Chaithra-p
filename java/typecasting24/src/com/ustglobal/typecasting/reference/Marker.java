package com.ustglobal.typecasting.reference;

public class Marker extends Pen
{
	double size;
	void color()
	{
		System.out.println("marker method");
	}
	@Override
	public void write()
	{
		System.out.println("write method of marker");
	}
	
}
