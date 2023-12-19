package oops_programs;
public class ClassC extends ClassB
{
	void m3() 
	{
		System.out.println("I am Child as wll as Grand Child");
	}
	public static void main(String[] args) 
	{
		ClassC cobj=new ClassC();
		cobj.m1();
		cobj.m2();
		cobj.m3();
	}
}
