package Operaters;

public class Operaters 
{
	int b=20;
	static int c=30;
	void Operators()
	{
		int a=10;
		System.out.println((a<b)&&(++b>a)&&(c>a));
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Operaters go=new Operaters();
		go.Operators();
		go.Operation();
	}
	void Operation()
	{
		int e=10,d=3;
		int f=6,g=4;
		System.out.println(e%d);
		System.out.println(e/d);
		System.out.println(f%g);
		System.out.println(f/g);
		
	}
}
