
public class Bmw implements AutoMobile,AutoMobileWithAbs 
{
	public int gear()
	{
		System.out.println("gear method BMW");
		return 10;
	}
	public void gps()
	{
		System.out.println("gps method BMW");
	}
	public void abs()
	{
		System.out.println("abs method of BMW");
	}
}
