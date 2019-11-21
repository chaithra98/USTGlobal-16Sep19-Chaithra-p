public class TestD
{
	public static void main(String[] args) 
	{
		Btm b = new Btm();
		b.swipe();
		int count= b.getCount();
		System.out.println("Count is "+count);
		int totalCount = b.getToatalCount();
		System.out.println("Total count is "+totalCount);
		
		
		Btm b1 = new Btm();
		b1.swipe();
	}
}
