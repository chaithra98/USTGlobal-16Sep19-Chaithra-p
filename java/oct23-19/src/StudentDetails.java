public class StudentDetails extends Person
{
	int rollNo;
	double marks;
	public StudentDetails(String name, int age, int rollNo, double marks) 
	{
		super(name,age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Hi "+name+", Your roll number is "+rollNo+" and you got marks "+marks);
	}

}
