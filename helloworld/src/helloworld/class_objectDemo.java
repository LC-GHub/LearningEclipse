package helloworld;

class Calcxxx //this is like a blueprint
{
	int num1;
	int num2;
	int result;
	
	public Calc() //constructor are use to allocate memory for object creation
	{
		num1 = 5;
		num2 = 5;
		System.out.println("in constructor");
	}
	
	public Calc(int n) //having more then 1 constructor is known as constructor overloading
	{
		num1 = n;
		num2 = n;
		System.out.println("in constructor1");
	}
	
	
	
	
	
//	public void perform() //public means can access anywhr and void is return type
//	{
//		result = num1+num2;
//	}
}

public class class_objectDemo {
	
	public static void main(String[] args)
	{
		Calc hi = new Calc(); //reference = creating object, 
		//Calc() is known as a (default) constructor it is use to construct the object of class Calc in main, it tells JVM the amt of memory needed
		//Object knows something and Object does something
		System.out.println(hi.num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		hi.num1 = 3;
//		//num1 is in Class Calc so to use it in class_objectdemo, need to use "obj."
//		hi.num2 = 5;
//		
//		hi.perform(); //invoke the method perform()
//		
//		System.out.println(hi.result);
		
	}
	

}
