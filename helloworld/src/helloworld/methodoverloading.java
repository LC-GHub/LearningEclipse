package helloworld;

class casio
{
	int num1;
	int num2;
	String operation;
	
	public casio()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	
	public casio(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
		System.out.println(operation);
	}
	
	public casio(int i, int j)
	{
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}
	public casio(int i, int j, String op)
	{
		num1 = i;
		num2 = j;
		operation = op;
		System.out.println(operation);
	}
	

}

public class methodoverloading {

	public static void main(String[] args) {
		
		casio obj = new casio(4,5, "Hello");
		
		
	}

}
