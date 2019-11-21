public class TestA 
{
	public static int add(int a, int b) 
	{
		System.out.println("add()");
		return a+b;
	}
	
	public static long add(long a, int b) 
	{
		System.out.println("add() method");
		return a+b;
	}
	
	public int multiply(int a, int b)
	{
		System.out.println("Multiplication method");
		return a*b;
	}
	
	public int multiply(byte a, int b)
	{
		System.out.println("Multiplication method");
		return a*b;
	}

	public static void add(int a, byte b) 
	{
		System.out.println("add()");
	}
	public static void main(String[] args) 
	{
		TestA.add(10, 20);
		TestA.add(29, 20);
		add(13,43);
		main(13);
		
		
		TestA t = new TestA();
		 int c = t.multiply(29, 3);
		 System.out.println("Multiplication of given numberers are: "+c);
		 t.multiply(3, 46);
	}
	
	public static void main(int a) 
	{
		System.out.println("main() is  overloaded");
	}
}
