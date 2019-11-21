
package com.ustglobal.objectclass;

public class TestD 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "Chaithra", 25000);	

		Employee e2 = new Employee(2, "Pooja",30000);

		int h = e2.hashCode();
		System.out.println(h);
		
		System.out.println(e1.equals(e2));
	}
}
