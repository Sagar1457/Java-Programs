package programs;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=S.nextInt();
		System.out.println("Enter y value");
		int y=S.nextInt();
		System.out.println("Enter required arthimetic operator to perform operation that needed");
		char ch=S.next().charAt(0);
		switch(ch)
		{
		 	case ('+'):
		 		System.out.println("addition of "+x+" and "+y+" is "+(x+y));
		 		break;
		 	case ('-'):
		 		System.out.println("substraction of "+x+" and "+y+" is "+(x-y));
		 		break;
		 	case ('*'):
		 		System.out.println("multiplication of "+x+" and "+y+" is "+(x*y));
		 		break;
		 	case ('/'):
		 		double z= x/y;
		 		System.out.println("division of "+x+" and "+y+" is "+z);
		 		break;
		 	case ('%'):
		 		System.out.println("modulas of "+x+" and "+y+" is "+(x%y));
		 		break;
		 	default:
		 		System.out.println("undefined");
		 		break;
		}
	}
}
