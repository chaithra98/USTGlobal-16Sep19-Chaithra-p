
public class SubClass extends SuperClass
{
	String s = "Subclass Variable";
	
	SubClass()
	{
		super();
		System.out.println("SubClass Constructor");
	}

	void getSData()
	{
		System.out.println(s);
		System.out.println("***************");
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("***************");
		super.superClassMethod();
	}


}
