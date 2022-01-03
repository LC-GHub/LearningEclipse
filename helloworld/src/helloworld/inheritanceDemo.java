package helloworld;

class Calculator //Superclass or parent class or base class
{
	public int add(int i, int j) {
		return i + j;
	}
}

class calcAdv extends Calculator 
//Sub class or child class or derived (calcAdv)-
//-inheritance from superclass (Calculator)
{

	public int sub(int i, int j) {
		return i - j;
	}
}

class calcVeryadvance extends calcAdv
{
	public int multi (int i, int j)
	{
		return i*j;
	}
}



public class inheritanceDemo {

	public static void main(String[] args) {
		
		
		calcVeryadvance c1 = new calcVeryadvance();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(5, 4);
		int result3 = c1.multi(5, 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
