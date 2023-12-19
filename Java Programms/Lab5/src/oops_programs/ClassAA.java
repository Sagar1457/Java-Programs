package oops_programs;
public class ClassAA implements InterfaceA,InterfaceB,InterfaceC
{
	public void meth1() 
	{
		System.out.println("Interface");
	}
	public static void main(String[] args) 
	{
		InterfaceA a=new ClassAA();
		InterfaceB b=new ClassAA();
		InterfaceC c=new ClassAA();
		a.meth1();
		b.meth1();
		c.meth1();
	}
}
