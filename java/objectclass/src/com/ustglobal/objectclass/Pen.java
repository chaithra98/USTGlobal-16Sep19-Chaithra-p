package com.ustglobal.objectclass;

/*HASHCODE */

public class Pen 
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		int pHashCode= p.hashCode();
		System.out.println("HashCode of P is "+pHashCode);
		
		Pen p1 = new Pen();
		int p1HashCode = p1.hashCode();
		System.out.println("HashCode of P1 is "+p1HashCode);
		
	}
}
