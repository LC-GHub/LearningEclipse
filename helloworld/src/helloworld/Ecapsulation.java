package helloworld;
//Encapsulation means to bind data with methods
class Student
{
	private int rollno;
	private String name;
	
	
	//Getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}

public class Ecapsulation {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(2);
		System.out.println(s1.getRollno());
		s1.setName("James");
		System.out.println(s1.getName());

	}

}
