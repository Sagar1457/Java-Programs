package Operaters;

public class Constractor 
{
	int a=10;
	int b=20;
	public Constractor(int a,int b)
	{
		System.out.println("initialize instance variables");
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	public Constractor() 
	{
		System.out.println("default constractor ");
	}
	public Constractor(String msg)
	{
		System.out.println("parameter constractor ");
		System.out.println(msg);
	}
	public void meth1() 
	{
		System.out.println("meth1");
	}
	public void meth2(int a, int b) 
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		
		Constractor obj=new Constractor();
		obj.meth1();
		obj.meth2(10,20);
		new Constractor();
		new Constractor(5,10);
		new Constractor("sagar");
	}

}
