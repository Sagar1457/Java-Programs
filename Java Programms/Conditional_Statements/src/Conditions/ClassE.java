package Conditions;
import java.util.*;
public class ClassE 
{
	Scanner SC=new Scanner(System.in);
	void Nested_if() 
	{
		System.out.println("To find the Small number among three numbers.");
		System.out.println("=============================================");
		System.out.println("Enter value of N");
		int n=SC.nextInt();
		System.out.println("Enter value of X");
		int x=SC.nextInt();
		System.out.println("Enter value of Y");
		int y=SC.nextInt();
		if(n>x || n>y)
		{
			if(x>n || x>y) 
			{
				System.out.println(y+" is small Number and it is Y value");
			}
			else 
			{
				System.out.println(x+" is small Number and it is X value");
			}
		}
		else
		{
			System.out.println(n+" is small Number and it is N value");
		}
	}
	public static void main(String[] args) 
	{
		ClassE I=new ClassE();
		I.Nested_if();
	} 

}
