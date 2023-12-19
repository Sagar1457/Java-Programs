package Conditions;
import java.util.*;
public class ClassA 
{
	static void If() 
	{	Scanner v=new Scanner(System.in);
		System.out.println("Conditional Statements");
		System.out.println("----------------------");
		System.out.println();
		System.out.println("if Conditional Statement");
		System.out.println();
		System.out.println("Enter any number");
		//true or false statement will be given as a condition if its true then if block will be executed else not.
		int n=v.nextInt();
		if (n>2)
		{
			System.out.println();
			System.out.println("IF Conditon is true for n greater than two and n = "+n);
		}
		
		if (n<2)
		{
			System.out.println();
			System.out.println("If Condtion ture for n less than two and n = "+n);
		}
	}
	public static void main(String[] args) 
	{
		If();
	} 
}
