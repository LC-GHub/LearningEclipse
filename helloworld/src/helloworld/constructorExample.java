package helloworld;



class Calcx
{
	int num3;
	int num4;
	int result1;
	
	public Calcx(int num3, int num4) //if u put void (return type) it will not be a constructor anymore.
	{
		this.num3 = num3;
		this.num4 = num4;
		
	}
	
	
	
}

public class constructorExample {

	public static void main(String[] args) {
		
		Calcx variable1 = new Calcx(4,5);
		
		
		System.out.println(variable1.num3);
		System.out.println(variable1.num4);
		

	}

}
