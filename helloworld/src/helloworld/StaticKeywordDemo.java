package helloworld;

class Emp
{
	int eid;
	int salary;
	static String ceo; //static keyword makes a variable not object specific
	
	static
	{
		System.out.println("HELOOOOO");
	}

	public Emp() //executed when you create an object
	{
		eid = 1;
		salary = 3000;
		System.out.println("In constructor");
	}
	
	static //executed when class is loaded, which is only once
	{
		ceo = "Larry";
		System.out.println("In static");
	}
	
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}

public class StaticKeywordDemo {
	
	static int i = 0;

	public static void main(String[] args) {
		
		Emp jack = new Emp();
		
		i = 9;
		
		Emp lim = new Emp();
		
		
		jack.show();
		lim.show();
		
		

	}

}
