public class Student
{
	String name;
	int usn;
	int phNo;
	String bloodGroup;
	String address;


	Student(String name, int usn, int phNo, String bloodGroup, String address)
	{
		this.name = name;
		this.usn = usn;
		this.phNo = phNo;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}
	void display() 
	{
		System.out.println("Name is: "+name);
		System.out.println("USN is: "+usn);
		System.out.println("Phone number is: "+phNo);
		System.out.println("bloodGroup is: "+bloodGroup);
		System.out.println("Address is: "+address);
		System.out.println("*******************************");
		
		
		
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("Chaithra", 01, 89632936, "O+ve", "Mandya");
		s1.display();
		Student s2 = new Student("Thrupthi", 02, 73126837, "O-ve", "Bangalore");
		s2.display();
		Student s3 = new Student("Raksha", 03, 37829289, "A-ve", "Davangere");
		s3.display();
		Student s4 = new Student("Navya", 04, 87490123, "A+ve", "Mandya");
		s4.display();
		Student s5 = new Student("Theju", 05, 73258111, "O+ve", "Maddur");
		s5.display();
		Student s6 = new Student("Anusha", 06, 73572836, "O-ve", "Bangalore");
		s6.display();
		Student s7 = new Student("Yashashwini", 07, 86382826, "B+ve", "Mandya");
		s7.display();
		Student s8 = new Student("Pallavi", 11, 69239936, "B-ve", "Mandya");
		s8.display();
		Student s9 = new Student("Manvitha", 12, 89676436, "A-ve", "Bangalore");
		s9.display();
		Student s10 = new Student("Bhavya", 10, 12346673, "A+ve", "Mandya");
		s10.display();
	}

}
