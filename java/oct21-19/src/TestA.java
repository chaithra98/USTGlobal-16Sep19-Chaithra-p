
public class TestA
{

	public static void main(String[] args) 
	{
		Pen p = new Pen();
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";

		System.out.println("Cost is "+p.cost);
		System.out.println("Brand is "+p.brand);
		System.out.println("Color is "+p.color);
		
		p.write();
		
		System.out.println("=======================================");
		
		Van v =  new Van();
		v.cost = 100000;
		v.color = "white";
		
		Van v1 = new Van();
		v1.color = "red";
		v1.cost= 500000;
		
		System.out.println("Cost is "+v.cost);
		System.out.println("Color is "+v.color);
		v.move();
		
		System.out.println("****************************");
		
		System.out.println("Cost is "+v1.cost);
		System.out.println("Color is "+v1.color);
		v1.move();
		
		
		
	}

}
