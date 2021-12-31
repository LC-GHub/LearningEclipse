package helloworld;

public class Iterationsdemo {

	public static void main(String[] args) {
		
		int y = 0, x = 0;
		
		for (y=0; y<4; y++)
		{
			if(y!=1 && y!=2)
			{
				for(x=0;x<4;x++)
				{
					System.out.print("$ ");
				}
				
			}
			else {
				System.out.print("$     $");
			}
			System.out.println();
			
		}

	}
}
