
public class TestB 
{
	static int a;
	int b;

	{
		a=10;
		b=30;
		System.out.println("In non-static block-1");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main started");
		TestB t = new TestB();
		TestB t1 = new TestB();
		System.out.println("Main ended");
		System.out.println(a);
		System.out.println(t1.a);
		System.out.println(t1.b);
	}
	
	{
		a = 20;
		b = 35;
		System.out.println("In non-static block-2");
	}
}
