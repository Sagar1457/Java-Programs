package Conditions;
import java.util.*;
public class Number 
{	Scanner sc=new Scanner(System.in);
	public static void main(String[] Args) 
	{
		Number s=new Number();
		System.out.println("Enter a number n");
		int n=s.sc.nextInt();
		if (n<0) 
		{
			System.out.println("n is negitive number");
		}
		else if (n>0)
		{
			System.out.println("n is positive number");
		}
		else 
		{
			System.out.println("n is Zero");
		}
		
	}
}
