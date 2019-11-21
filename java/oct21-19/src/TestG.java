public class TestG 
{
public static void main(String[] args) 
{
	ThirdGen t = new ThirdGen();
	t.call();
	t.msg();
	t.games();
	t.camera();
	System.out.println("******************");
	SecondGen s = new SecondGen();
	s.call();
	s.msg();
	s.games();
	System.out.println("******************");
	FirstGen f = new FirstGen();
	f.call();
	f.msg();
	
}
}