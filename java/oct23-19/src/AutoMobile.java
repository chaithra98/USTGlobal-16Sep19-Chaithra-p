
public interface AutoMobile
{
	int left = 10; // variables automatically public,static and final
	public static final int right = 20;
	
	abstract int gear(); // here abstract is optional
	void gps();
	
	public static void add()
	{
		
	}
	public default void sum()
	{
		
	}
}
