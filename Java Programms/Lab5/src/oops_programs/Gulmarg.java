package oops_programs;
public class Gulmarg extends Hillsations
{
	void location() 
	{
		System.out.println("Baramulla district of Jammu and Kashmir");
	}
	void famousFor() 
	{
		System.out.println();
		System.out.println("Famous For Gulmarg Gondola, Flower Show,....,ect.");
	}
	public static void main(String[] args) 
	{
		/*Hillsations m1=new Hillsations();
		m1.location();
		m1.famousFor();
		*/
		Hillsations m=new Gulmarg();
		m.location();
		m.famousFor();
	}
}
