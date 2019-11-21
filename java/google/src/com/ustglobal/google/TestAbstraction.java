package com.ustglobal.google;

public class TestAbstraction
{
	public static void main(String[] args) 
	{
		Browser b  = new Browser();
		Gmail g = new Gmail();
		b.open(g);
		
		Google x = new Gmail();
		b.open(x);
		System.out.println("=====================");
		Google y = new GoogleDrive();
		b.open(y);
	}
}
