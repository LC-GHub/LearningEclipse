package helloworld;

class Outer
{
	static int a; //member variable
	
	public static void show() //member method
	{
		
	}
	
	static class Inner //member class
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
}

public class innerclassdemo 
{

	//variable, methods
	
	
	public static void main(String[] args)
	{
		
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
