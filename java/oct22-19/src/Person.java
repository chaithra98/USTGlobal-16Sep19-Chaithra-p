public class Person 
{
	String name;
	int age;
	Person(int page, String pname)
	{
		age = page;
		name = pname;
		System.out.print(name+"  ");
		System.out.println(age);

	}
	public static void main(String[] args) 
	{
		Person p1 = new Person(25, "Pallavi");
		Person p2 = new Person(22, "Tom");
		Person p3 = new Person(35, "Jerry");
	}
}
