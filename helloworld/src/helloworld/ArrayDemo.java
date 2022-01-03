package helloworld;


public class ArrayDemo
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4};
		System.out.println("For 1d array");
		
		for(int k : a) //for each loop or enhanced for loop
		{
			System.out.print(" " + k);
		}
		System.out.println();
		
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {
						{1,2,3,4},
						{2,4,8},
						{5,6,7,8,9}
					};
		
//		for(int row = 0; row < (d.length); row++) //For (row)
//		{
//			for(int col = 0; col < (d[row].length); col++) //For (column)
//			{
//				System.out.print(" " + d[row][col]);
//			}
//			System.out.println();
//		}
		System.out.println("For 2d array");
		
		for (int k[] : d)
		{
			for(int l: k)
			{
				System.out.print(" " + l);
			}
			System.err.println();
		}
				
				
				
		
		
		
	}

}
