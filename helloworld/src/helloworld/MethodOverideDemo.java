package helloworld;

class A1
{
	public void show()
	{
		System.out.println("In A");
	}
}

class B1 extends A1
{
	//@Override //use @Override to method override
	public void show()
	{
		System.out.println("In A");
	}
	public void config()
	{
		System.out.println("Config");
	}
}

class C1 extends A1
{
	public void show()
	{
		System.out.println("In C");
	}
}

public class MethodOverideDemo {
	public static void main(String[] args)
	{
		A1 obj1 = new B1();
		obj1.show();
		//obj1.config();
	}

}
