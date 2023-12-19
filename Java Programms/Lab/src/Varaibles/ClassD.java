package Varaibles;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassD 
{
	Scanner Sc=new Scanner(System.in);
	public float Multiplication() 
	{
		System.out.println("Enter float value of a :");
		float a=Sc.nextFloat();
		System.out.println("Enter float value of b :");
		float b=Sc.nextFloat();
		return(a*b);
	}
	public static void main(String[] args) 
	{
		ClassD g=new ClassD();
		System.out.println("multilication of a and b = "+g.Multiplication());
	}

}
