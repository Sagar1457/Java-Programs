package Varaibles;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassC 
{
	static Scanner Sc=new Scanner(System.in);
	public static void ImplicitTyppecating() 
	{
		System.out.println("Implicit Typpecating");
		System.out.println("--------------------");
		
		System.out.println("Enter the value of byte = ");
		byte b=Sc.nextByte();
		short s=b;
		System.out.println("the value of short = "+s);
		
		System.out.println("Enter the value of  integer = ");
		int i=Sc.nextInt();
		long L=i;
		System.out.println("the value of Long = "+L);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
	}
	public void ExplicitTyppecating() 
	{
		System.out.println("Explicit Typpecating");
		System.out.println("--------------------");
		
		System.out.println("Enter the value of integer = ");
		int i=Sc.nextInt();
		short Sh=(short)i;
		System.out.println("the value of Short = "+Sh);
		
		System.out.println("Enter the value of Float = ");
		float l=Sc.nextFloat();
		int in=(int)l;
		System.out.println("the value of integer = "+in);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
	}
	public static void main(String[] args) 
	{
		ImplicitTyppecating();
		ClassC obj=new ClassC();
		obj.ExplicitTyppecating();
	}

}
