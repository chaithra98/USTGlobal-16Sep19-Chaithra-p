public class TestA 
{
	static int a;
	int b;

	static 
	{
		a=19;
		System.out.println("In static block-1");
	}
	
	TestA()
	{
		System.out.println("In TestA constructor");
	}
	public static void main(String[] args)
	{
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value is "+a);	
	}
	static
	{
		a=62;
		System.out.println("In static block-2");
	}
	
	static 
	{
		a=73;
		System.out.println("In static block-3");
	}
}
