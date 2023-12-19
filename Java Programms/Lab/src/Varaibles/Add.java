package Varaibles;

public class Add 
{
	int i=20;
	static int s=10;
	public void Number() 
	{
		int l=30;
		System.out.println("addititon of static,instance and local variables :- "+(s+i+l));
	}
	public static void main(String[] args) 
	{
		Add obj=new Add();
		obj.Number();
	}
}
