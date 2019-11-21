public class TestF 
{
	public static void main(String[] args) 
	{
		//Person p = new Person("hkds",67) ;   // It is giving error because Person is a abstract class
		//p.display();
		System.out.println("===================================================================");
		Teacher t = new Teacher("Kavitha", 22, "java", 0);
		t.display();
		System.out.println("===================================================================");
		StudentDetails s = new StudentDetails("Pallavi", 25, 123, 80);
		s.display();
		

	}
}
