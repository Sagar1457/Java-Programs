package oops_programs;
public class Mussoorie extends Hillsations
{
	void location() 
	{
		System.out.println("Uttarakhand");
	}
	void famousFor() 
	{
		System.out.println();
		System.out.println("Famous For Scenic Beauty, Mall Road, Gun Hill,...,etc.");
	}
	public static void main(String[] args) 
	{
		/*Hillsations m1=new Hillsations();
		m1.location();
		m1.famousFor();
		*/
		Hillsations m=new Mussoorie();
		m.location();
		m.famousFor();
		
	}
}
