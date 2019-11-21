
public class TestC
{
	public static void main(String[] args)
	{
		Person p = new Person();	
		p.name="abc";
		Person.color="white";
		p.age=24;

		System.out.println("Name is "+p.name);
		System.out.println("Color is "+Person.color);
		System.out.println("age is "+p.age);

		Person.sleep();  // static methods can be accessed by using either className or by object creation === both the way it will work 
		p.eat();
		p.walk();

		System.out.println("**************************");
		Person p1 = new Person();
		p1.age=20;
		p1.name = "divya";
		System.out.println("Person p1 age "+p1.age);
		System.out.println("Person p1 name "+p1.name);
		p1.color = "black";
		p1.sleep();
		System.out.println("**************************");
		
		Person p2 = new Person();
		p2.age=22;
		p2.name = "Bhavya";
		System.out.println("Person p2 age "+p2.age);
		System.out.println("Person p2 name "+p2.name);
		p2.color = "black";
		p2.sleep();
		

	}
}
