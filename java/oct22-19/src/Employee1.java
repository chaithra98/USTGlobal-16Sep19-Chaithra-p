public class Employee1
{
	String name;
	int id;

	public Employee1(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	void printMethod() 
	{
		System.out.println("Employee name is: "+name);
		System.out.println("Employee's id is: "+id);
		this.sayHello();
	}
	
	void sayHello()
	{
		System.out.println("Hello "+name+" Welcome to UST Global");
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Reshma",123);	
		e1.printMethod();

		Employee e2 = new Employee("Kavya",646);	
		e2.printMethod();

		Employee e3 = new Employee("Swathi",872);	
		e3.printMethod();

	}


}
