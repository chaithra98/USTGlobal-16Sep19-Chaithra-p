public class Bus 
{
	int seats;
	String color;
	Bus(int seats, String color)
	{
		this.seats = seats;
		this.color = color;
	}
	Bus()
	{
		this(40);
	}
	Bus(int seats)
	{
		this(seats,"red");
		
	}
	
	
	public void getDetails() {
		System.out.println("Welcome to redbus, bus seat capacity is "+seats);
	}
}
