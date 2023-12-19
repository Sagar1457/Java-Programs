package Operaters;

public class Data 
{
	public void meth1() 
	{
		System.out.println("implicit bTyppecating");
		byte b=10;
		short s=b;
		System.out.println(b+" & "+s);
		System.out.println("Data type of S ;-"+((Object)s).getClass().getSimpleName());
		System.out.println("----------");
	}
	public void meth2() 
	{
		System.out.println("explicit bTyppecating");
		int i=1056;
		short e=(short)i;
		System.out.println(i+" & "+e);
		System.out.println("----------");
	}
	public static void main(String[] args) 
	{
		Data obj=new Data();
		obj.meth1();
		obj.meth2();
		
		
	}

}
