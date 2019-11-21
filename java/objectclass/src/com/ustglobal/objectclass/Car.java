package com.ustglobal.objectclass;

public class Car
{
	int cost;
	String brand;
	String color;
	
	public Car(int cost, String brand, String color) 
	{
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public int hashCode()
	{
		return cost;
	}
	
	

	@Override
	public String toString() {
		return "cost=" + cost + ", brand=" + brand + ", color=" + color;
	}
	
	
}
