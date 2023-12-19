package Conditions;
/*test program*/
import java.util.*;
public class ClassD 
{
	static Scanner SC= new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("To find the greatest number among three numbers.");
		System.out.println("================================================");
		System.out.println("Enter value of a");
		int a=SC.nextInt();
		System.out.println("Enter value of b");
		int b=SC.nextInt();
		if(a>b) 
		{
			System.out.println(a+" is big number from "+a+" & "+b);
		}
		else
		{
			System.out.println(b+" is big number from "+b+" & "+a);
		}
	}
}
