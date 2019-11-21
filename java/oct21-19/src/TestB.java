
public class TestB 
{
public static void main(String[] args) 
{
	
	Cow c = new Cow();
	c.name  = "Ganga";
	c.color ="brown";
	
	System.out.println("Cow's name is "+c.name);
	System.out.println("Cow's color is "+c.color);
	
	c.eat();
	c.sleep();
	
	System.out.println("******************");
	
	Cow c1 = new Cow();
	c1.name = "Tunga";
	c1.color = "black";
	
	System.out.println("Cow's name is "+c1.name);
	System.out.println("Cow's color is "+c1.color);
	c1.eat();
	c1.sleep();
	
}
}
