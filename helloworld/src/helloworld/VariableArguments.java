package helloworld;


class calc1
{
	//VarArgs example
	public int add(int ...i) // "int ... i" is varying (amount of) arguments, which means arguments will go into parameter as an array.
	{
		int sum = 0;
		
		for(int k : i)
		{
			sum+= k;
		}
		
		return sum;
	}
}

public class VariableArguments {
	
	public static void main(String[] args)
	{
		calc1 obj = new calc1();
		
		//obj.add(4, 5);
		
		System.out.println(obj.add(4, 5, 9, 5,10,11,12));
	}
	
	

}
