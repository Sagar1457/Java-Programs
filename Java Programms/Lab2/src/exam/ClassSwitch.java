package exam;
//BVIDHYASAGAR..AF0320724
import java.util.Scanner;
public class ClassSwitch 
{
	Scanner s=new Scanner(System.in);
	void arithmeticOperators() 
	{
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		System.out.println("Enter your Arithmetic Operation");
		char ch=s.next().charAt(0);
		switch(ch)
		{
			case('+'):
				System.out.println("Addition of two numbers is: "+(a+b));
			break;
			case('-'):
				System.out.println("Substraction of two numbers is: "+(a-b));
			break;
			case('*'):
				System.out.println("Multiplication of two numbers is: "+(a*b));
			break;
			case ('/'):
				System.out.println("Division of two numbers is: "+(a/b));
			break;
			case ('%'):
				System.out.println("Remainder of two numbers is: "+(a%b));
			break;
			default:
				System.out.println("invailid charactor");
			break;	
		}
	}
	public static void main(String[] args) 
	{
		ClassSwitch e=new ClassSwitch();
		e.arithmeticOperators();		
	}
}
