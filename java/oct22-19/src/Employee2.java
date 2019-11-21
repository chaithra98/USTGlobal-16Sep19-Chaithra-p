public class Employee2 
{
	String name;
	int eid;
	long aadharNo;

	Employee2(String name,int eid,long aadharNo)
	{
		this.name = name;
		this.eid = eid;
		this.aadharNo = aadharNo;
	}

	Employee2(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	
	Employee2(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
		
	}
	
	void disp()
	{
		System.out.println(name+" "+eid+" "+aadharNo);
		System.out.println(name+" welcome to UST Global");
		
	}

	
}
