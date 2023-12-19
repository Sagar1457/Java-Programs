/*
4.create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg.
Subclasses extend the superclass and override its location() and famousFor() method.
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.
As it refers to the base class object and the base class method overrides the superclass
method; the base class method is invoked at runtime.
ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
 */
package oops_programs;
//BVIDHYASAGAR..AF0320724
public class Hillsations 
{
	void location() 
	{
		System.out.println("location like Mountainous Regions");
	}
	void famousFor() 
	{
		System.out.println();
		System.out.println("Famous For cooler climates, scenic beauty, and peaceful surroundings");
	}
	public static void main(String[] args) 
	{
		Hillsations m=new Hillsations();
		m.location();
		m.famousFor();
	}
}
