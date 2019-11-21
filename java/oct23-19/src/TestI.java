
public class TestI
{
	public static void main(String[] args) 
	{
		//AutoMobile a ;	// we can't create a object for interface but we write reference variable
		Bmw b = new Bmw();
		b.gear();
		b.gps();
		b.abs();
		System.out.println("====================");
		Toyota t = new Toyota();
		t.gear();
		t.gps();
		
			
	}

}
