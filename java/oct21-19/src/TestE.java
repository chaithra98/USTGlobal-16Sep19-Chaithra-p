public class TestE 
{
public static void main(String[] args) 
{
	Student.cname = "Qspiders";
	Student s1 = new Student();
	s1.name="Priya";
	s1.usn  = 54;
	 

	System.out.println("College name is"+Student.cname);
	System.out.println("name is "+s1.name);
	System.out.println("usn is "+s1.usn);
	s1.read();
	
}
}
