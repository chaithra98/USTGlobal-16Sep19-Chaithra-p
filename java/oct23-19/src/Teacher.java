public class Teacher extends Person
{
	String subject;
	int experience;

	Teacher(String name, int age,String subject,int experience)
	{
		super(name, age);
		this.subject = subject;
		this.experience = experience;
	}
	public void display()
	{
		System.out.println(name+" is "+age+" years old "+" and has a experience of "+experience+" years in "+subject);
	}

}
