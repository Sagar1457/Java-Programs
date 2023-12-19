package Varaibles;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassB 
{
	Scanner SC=new Scanner(System.in);
	public void SwapTwoNumbers() 
	{
		System.out.println("Enter a value");
		int a=SC.nextInt();
		System.out.println("Enter b value");
		int b=SC.nextInt();
		a=(a+b);
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) 
	{
		ClassB s=new ClassB();
		s.SwapTwoNumbers();
	}
}
