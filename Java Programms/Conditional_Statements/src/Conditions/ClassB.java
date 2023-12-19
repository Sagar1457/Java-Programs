package Conditions;
import java.util.*;
public class ClassB 
{
	Scanner SC=new Scanner(System.in);
	void If_Else() 
	{
		System.out.println("TO find an Even or an Odd Nubmer");
		System.out.println();
		System.out.println("Enter value of N");
		int n=SC.nextInt();
		if(n%2==0) 
		{
			System.out.println("N is an Even Number");
		}
		else
		{
			System.out.println("N is an Odd Number");
		}
	}
	public static void main(String[] args) 
	{
		ClassB I=new ClassB();
		I.If_Else();
	} 
}