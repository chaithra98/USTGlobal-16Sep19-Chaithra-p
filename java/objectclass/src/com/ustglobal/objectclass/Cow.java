package com.ustglobal.objectclass;

public class Cow 
{
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) 
	{
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
	

		Cow c = (Cow) obj;
		if(this.id == c.id)
		{
			if(this.name.equals(c.name))
			{
				if(this.cost == cost)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
