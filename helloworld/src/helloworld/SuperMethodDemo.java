package helloworld;

class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In A int");
	}
}
class B extends A
{
	public B()
	{
		super(); //by default will be here
		System.out.println("In B");
	}
	public B(int i)
	{
		super(i); //by default will be here
		System.out.println("In B int");

	}
	

}

public class SuperMethodDemo {

	public static void main(String[] args)
	{
		
		B obj1 = new B();
		
		
	}

}
