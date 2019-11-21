public class SubClass extends SuperClass
{
	public void add()
	{
		System.out.println("add() method");
	}
	public void count(int a)
	{
		System.out.println("count of subclass() ");
	}
	
	@Override
	public void count()
	{
		System.out.println("count of subclass() ");
	}
}
