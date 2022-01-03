package helloworld;

public class JumpDemo {
	
	public static void main(String[] args)
	{
		int i = 0;
		
		for(i=0; i<=10; i++)
		{
			if(i==7)
			{
				break;
			}
			
			System.out.println("The value is " + i);
		}
	}

}
