public class Employee 
{
	String name;
	int id;
 	
	Employee(String ename, int eid)
	{
		name = ename;
		id = eid;
//		System.out.print(name+"  ");
//		System.out.println(id);
	}
	
	void printMethod() 
	{
		System.out.println("Employee name is: "+name);
		System.out.println("Employee's id is: "+id);
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Reshma",123);	
		e1.printMethod();
		
		Employee e2 = new Employee("Kavya",673);	
		e2.printMethod();
		
		Employee e3 = new Employee("Chaithra",756);	
		e3.printMethod();
	}
}
