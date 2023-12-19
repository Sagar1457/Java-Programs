package oops_programs;
public class Manali extends Hillsations
{
	void location() 
	{
		System.out.println("Kullu Valley of Himachal Pradesh");
	}
	void famousFor() 
	{
		System.out.println();
		System.out.println("Famous For Adventure Activities, Hiking and Trekking, ...,etc.");
		
	}
	public static void main(String[] args) 
	{
		/*Hillsations m1=new Hillsations();
		m1.location();
		m1.famousFor();
		*/
		Hillsations m=new Manali();
		m.location();
		m.famousFor();
	}
}
