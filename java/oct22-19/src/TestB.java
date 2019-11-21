public class TestB 
{
	static int a = 25;
	int x;
	
	public static void add()
	{
		// only final access modifier is supported for local variable
		//		final int a = 20;
		int b = 64;

		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		add();
		TestB t = new TestB();
				System.out.println(t.x);
	}
}
